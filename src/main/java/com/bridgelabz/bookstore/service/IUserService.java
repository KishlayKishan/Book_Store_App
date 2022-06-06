package com.bridgelabz.bookstore.service;

import com.bridgelabz.bookstore.dto.LoginDTO;
import com.bridgelabz.bookstore.dto.UserDTO;
import com.bridgelabz.bookstore.entity.UserData;

import java.util.List;

public interface IUserService {
    public String loginUser(LoginDTO loginDTO);

    UserData getUserById(int id);

    List<UserData> getBookList();

    Object addUser(UserDTO userDTO);
}