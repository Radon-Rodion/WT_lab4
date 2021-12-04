package com.rafeyeu.lab4.dao.description;

import com.rafeyeu.lab4.dao.Dao;
import com.rafeyeu.lab4.entity.UserInformation;
import com.rafeyeu.lab4.exeptions.DaoException;


public interface UserInformationDao extends Dao<UserInformation> {

    void updateById(int id, UserInformation userInformation) throws DaoException;
}
