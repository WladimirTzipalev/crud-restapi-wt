package com.example.restapiwt.service;

import com.example.restapiwt.model.Role;
import java.util.List;

public interface RoleService {

    List<Role> getAllRoles();

    Role findById(Long id);

    void saveRole(Role role);
}
