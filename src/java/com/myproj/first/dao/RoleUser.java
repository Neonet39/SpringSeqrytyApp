package com.myproj.first.dao;

import com.myproj.first.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Evgeny on 14.07.2017.
 */
public interface RoleUser extends JpaRepository<User,Long> {
    User findByUsername(String username);

}
