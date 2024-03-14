package com.anand.userservice.services.impl;

import com.anand.userservice.entity.User;
import com.anand.userservice.repository.UserRepository;
import com.anand.userservice.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public UserDetailsService userDetailsService() {
        return new UserDetailsService() {
            @Override
            public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
                return userRepository.findByUserName(username).orElseThrow(()->new UsernameNotFoundException("User Not Found"));
            }
        };
    }

    @Override
    public User getUserById(long id) {
        return userRepository.findById(id).orElse(new User());
    }
}
