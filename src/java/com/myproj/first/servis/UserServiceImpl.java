package com.myproj.first.servis;

import com.myproj.first.dao.RoleDao;
import com.myproj.first.dao.RoleUser;
import com.myproj.first.model.Role;
import com.myproj.first.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Evgeny on 14.07.2017.
 */
@Service
public class UserServiceImpl implements Userservice{

    @Autowired
    private RoleUser roleUser;

    @Autowired
    private RoleDao roleDao;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public void save(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        Set<Role> roles = new HashSet<>();
        roles.add(roleDao.getOne(1L));
        user.setRoles(roles);
        roleUser.save(user);
    }

    @Override
    public User findByUsername(String username) {
        return roleUser.findByUsername(username);
    }
}
