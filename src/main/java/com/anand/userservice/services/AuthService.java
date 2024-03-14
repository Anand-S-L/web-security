package com.anand.userservice.services;

import com.anand.userservice.dto.JwtAuthResponse;
import com.anand.userservice.dto.RefreshTokenRequest;
import com.anand.userservice.dto.SignInRequest;
import com.anand.userservice.dto.SignUpRequest;
import com.anand.userservice.entity.User;

public interface AuthService {
    User signUp(SignUpRequest signUpRequest);

    JwtAuthResponse signIn(SignInRequest signInRequest);

    JwtAuthResponse refreshToken(RefreshTokenRequest refreshTokenRequest);
}
