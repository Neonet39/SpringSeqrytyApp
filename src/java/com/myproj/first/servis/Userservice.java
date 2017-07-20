package com.myproj.first.servis;

import com.myproj.first.model.User;

/**
 * Created by Evgeny on 14.07.2017.
 */
public interface Userservice {
    void save(User user);
    User findByUsername(String username);

}
