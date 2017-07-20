package com.myproj.first.dao;

import com.myproj.first.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Evgeny on 14.07.2017.
 */
public interface RoleDao extends JpaRepository<Role,Long> {

}
