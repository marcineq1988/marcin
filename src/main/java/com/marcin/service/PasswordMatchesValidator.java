package com.marcin.service;

import com.marcin.entity.User;
import org.springframework.stereotype.Service;

@Service
public class PasswordMatchesValidator {

    public boolean isPasswordValid(User user) {

        return user.getPassword().equals(user.getPasswordConfirm());
    }
}
