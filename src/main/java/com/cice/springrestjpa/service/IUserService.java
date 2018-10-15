package com.cice.springrestjpa.service;

public interface IUserService {

    //String login(UserLoginDto loginDto);

    String login(String user, String pass);
}
