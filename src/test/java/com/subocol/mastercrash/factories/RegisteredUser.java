package com.subocol.mastercrash.factories;

import com.subocol.mastercrash.models.register.UserRegisterRequest;

public class RegisteredUser {
    public static UserRegisterRequest withDefaultInfo(){
        return UserRegisterRequest
                .builder()
                .email("eve.holt@reqres.in")
                .password("pistol")
                .build();
    }
}
