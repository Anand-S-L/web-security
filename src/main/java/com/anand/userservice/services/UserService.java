package com.anand.userservice.services;

import com.anand.userservice.entity.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService {

    UserDetailsService userDetailsService();

    User getUserById(long id);
}
