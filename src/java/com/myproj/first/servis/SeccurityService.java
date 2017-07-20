package com.myproj.first.servis;

/**
 * Created by Evgeny on 20.07.2017.
 */
public interface SeccurityService {
    String findLoggedInUsername();
    void autoLogin(String username,String password);
}
