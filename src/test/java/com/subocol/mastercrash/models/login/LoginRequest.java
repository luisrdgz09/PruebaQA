package com.subocol.mastercrash.models.login;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LoginRequest {

    private String token;
    private Credentials credentials;
}
