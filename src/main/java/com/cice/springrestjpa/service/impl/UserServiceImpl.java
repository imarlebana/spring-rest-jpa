package com.cice.springrestjpa.service.impl;

import com.cice.springrestjpa.model.entity.User;
import com.cice.springrestjpa.repository.UserRepository;
import com.cice.springrestjpa.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired private UserRepository userRepository;

    @Override
    public String login(String user, String pass) {
        Optional<User> opt = userRepository.findAllByUserAndAndPass(user,pass);

        String response = "El usuario no existe";
        if(opt.isPresent()){
            response ="El usuario es correcto";
        }

        return response;
    }
}
