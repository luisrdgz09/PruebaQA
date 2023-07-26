package com.subocol.mastercrash.models.login;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Credentials {

    private String username;
    private String password;
}
