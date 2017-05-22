package com.janita.one.service;

import com.janita.one.bean.UserBean;
import org.springframework.stereotype.Service;

/**
 * Created by Janita on 2017-05-22 19:49
 */
@Service
public class UserService {

    public UserBean createUser (UserBean user) {
        return user;
    }
}
