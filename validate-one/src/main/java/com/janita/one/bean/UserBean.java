package com.janita.one.bean;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

/**
 * Created by Janita on 2017-05-22 19:38
 */
public class UserBean {


    @NotBlank(message = "name is not empty")
    private String name ;

    @Email
    private String email;

    @NotBlank(message = "password is not empty")
    @Length(min = 6, message = "password length < 6")
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
