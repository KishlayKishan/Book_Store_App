package com.bridgelabz.bookstore.service;

import com.bridgelabz.bookstore.dto.LoginDTO;
import com.bridgelabz.bookstore.dto.UserDTO;
import com.bridgelabz.bookstore.entity.User;

import java.util.List;

public interface IUserService {
    public String loginUser(LoginDTO loginDTO);

    User getUserById(int id);

    List<User> getBookList();

    Object addUser(UserDTO userDTO);
}