package com.bridgelabz.bookstore.entity;

import com.bridgelabz.bookstore.dto.LoginDTO;
import com.bridgelabz.bookstore.dto.UserDTO;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class UserData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id", nullable = false)
    private int userID;
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    @Column(name = "login_id", nullable = false)
    private String loginID;
    private String password;


    public UserData(int id, UserDTO userDTO) {
        this.userID = id;
        this.firstName = userDTO.getFirstName();
        this.lastName = userDTO.getLastName();
        this.email = userDTO.getEmail();
        this.address = userDTO.getAddress();
        this.loginID = userDTO.getLoginID();
        this.password = userDTO.getPassword();
    }

    public UserData(UserData userData) {
        this.userID = userData.getUserID();
        this.firstName = userData.getFirstName();
        this.lastName = userData.getLastName();
        this.email = userData.getEmail();
        this.address = userData.getAddress();
        this.loginID = userData.getLoginID();
        this.password = userData.getPassword();
    }

    public UserData(UserDTO userDTO) {
        this.firstName = userDTO.getFirstName();
        this.lastName = userDTO.getLastName();
        this.email = userDTO.getEmail();
        this.address = userDTO.getAddress();
        this.loginID = userDTO.getLoginID();
        this.password = userDTO.getPassword();
    }

    public UserData(LoginDTO loginDTO) {
        this.loginID = loginDTO.getLoginID();
        this.password = loginDTO.getPassword();
    }
}