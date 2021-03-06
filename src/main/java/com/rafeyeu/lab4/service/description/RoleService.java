package com.rafeyeu.lab4.service.description;

import com.rafeyeu.lab4.entity.Role;
import com.rafeyeu.lab4.exeptions.ServiceException;

import java.util.Optional;

public interface RoleService {

    Optional<Role> retrieveRoleById(int roleId) throws ServiceException;
    Optional<Role> retrieveRoleByRoleName(String roleName) throws ServiceException;

}
