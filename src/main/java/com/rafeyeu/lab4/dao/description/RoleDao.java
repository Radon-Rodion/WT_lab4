package com.rafeyeu.lab4.dao.description;

import com.rafeyeu.lab4.dao.Dao;
import com.rafeyeu.lab4.entity.Role;
import com.rafeyeu.lab4.exeptions.DaoException;

import java.util.Optional;

public interface RoleDao extends Dao<Role> {


    Optional<Role> findByName(String name) throws DaoException;
}