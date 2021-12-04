package com.rafeyeu.lab4.service.description;

import com.rafeyeu.lab4.entity.User;
import com.rafeyeu.lab4.entity.UserInformation;
import com.rafeyeu.lab4.exeptions.ServiceException;

import java.util.List;
import java.util.Optional;

public interface UserInformationService {

    Optional<UserInformation> retrieveUserInformationById(int userInformationId) throws ServiceException;


    List<UserInformation> getUserInformationFromUsers(List<User> users) throws ServiceException;
}
