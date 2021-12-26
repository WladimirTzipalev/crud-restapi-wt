package com.example.restapiwt.dao;

import com.example.restapiwt.model.Role;
import java.util.List;

public interface RoleDao {

    List<Role> getAllRoles();

    Role findById(Long id);

    void saveRole(Role role);
}
