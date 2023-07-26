package com.subocol.mastercrash.factories;

import com.subocol.mastercrash.models.login.Credentials;
import com.subocol.mastercrash.models.login.LoginRequest;

public class LoginFactory {

    public static LoginRequest withValidUser(){
        return LoginRequest
                .builder()
                .token("123366666")
                .credentials(Credentials.builder()
                        .username("diegoromerog@subocol.com")
                        .password("$m4T14s#")
                        .build())
                .build();
    }

    public static LoginRequest withInvalidPassword(){
        return LoginRequest
                .builder()
                .token("123366666")
                .credentials(Credentials.builder()
                        .username("diegoromerog@subocol.com")
                        .password("badPassword")
                        .build())
                .build();
    }

    public static LoginRequest withUnauthorizedUser(){
        return LoginRequest
                .builder()
                .token("123366666")
                .credentials(Credentials.builder()
                        .username("noautorizado@subocol.com")
                        .password("$m4T14s#")
                        .build())
                .build();
    }
    public static LoginRequest withRequiredUser(){
        return LoginRequest
                .builder()
                .token("123366666")
                .credentials(Credentials.builder()
                        .username("")
                        .password("$m4T14s#")
                        .build())
                .build();
    }

    public static LoginRequest withRequiredPassword(){
        return LoginRequest
                .builder()
                .token("123366666")
                .credentials(Credentials.builder()
                        .username("diegoromerog@subocol.com")
                        .password("")
                        .build())
                .build();
    }

    public static LoginRequest withInactiveRol(){
        return LoginRequest
                .builder()
                .token("123366666")
                .credentials(Credentials.builder()
                        .username("yesicarendon@subocol.com")
                        .password("$m4T14s#")
                        .build())
                .build();
    }

    public static LoginRequest withInvalidLoginCaptcha(){
        return LoginRequest
                .builder()
                .token("123366666")
                .credentials(Credentials.builder()
                        .username("invalidc@subocol.com")
                        .password("$m4T14s#")
                        .build())
                .build();
    }

    public static LoginRequest withFailedConnectionToDB(){
        return LoginRequest
                .builder()
                .token("123366666")
                .credentials(Credentials.builder()
                        .username("failedcdb@subocol.com")
                        .password("$m4T14s#")
                        .build())
                .build();
    }

    public static LoginRequest withEmptyDB(){
        return LoginRequest
                .builder()
                .token("123366666")
                .credentials(Credentials.builder()
                        .username("emptydb@subocol.com")
                        .password("$m4T14s#")
                        .build())
                .build();
    }

    //------------------Captcha
    public static LoginRequest withValidCaptcha(){
        return LoginRequest
                .builder()
                .token("123336666")
                .credentials(Credentials.builder()
                        .username("diegoromerog@subocol.com")
                        .password("$m4T14s#")
                        .build())
                .build();
    }

    public static LoginRequest withInvalidResposeCaptcha(){
        return LoginRequest
                .builder()
                .token("123370000")
                .credentials(Credentials.builder()
                        .username("diegoromerog@subocol.com")
                        .password("$m4T14s#")
                        .build())
                .build();
    }

    public static LoginRequest withInvalidSecretCaptcha(){
        return LoginRequest
                .builder()
                .token("123380000")
                .credentials(Credentials.builder()
                        .username("diegoromerog@subocol.com")
                        .password("$m4T14s#")
                        .build())
                .build();
    }

    public static LoginRequest withTimedOutOrDuplicateToken(){
        return LoginRequest
                .builder()
                .token("123330000")
                .credentials(Credentials.builder()
                        .username("diegoromerog@subocol.com")
                        .password("$m4T14s#")
                        .build())
                .build();
    }

    public static LoginRequest withRobotCaptcha(){
        return LoginRequest
                .builder()
                .token("123340000")
                .credentials(Credentials.builder()
                        .username("diegoromerog@subocol.com")
                        .password("$m4T14s#")
                        .build())
                .build();
    }

    public static LoginRequest withMissingInputResponseCaptcha(){
        return LoginRequest
                .builder()
                .token("123390000")
                .credentials(Credentials.builder()
                        .username("diegoromerog@subocol.com")
                        .password("$m4T14s#")
                        .build())
                .build();
    }

    public static LoginRequest withMissingInputSecretCaptcha(){
        return LoginRequest
                .builder()
                .token("123350000")
                .credentials(Credentials.builder()
                        .username("diegoromerog@subocol.com")
                        .password("$m4T14s#")
                        .build())
                .build();
    }

    public static LoginRequest withBadRequestCaptcha(){
        return LoginRequest
                .builder()
                .token("123360000")
                .credentials(Credentials.builder()
                        .username("diegoromerog@subocol.com")
                        .password("$m4T14s#")
                        .build())
                .build();
    }

    public static LoginRequest withNonExistentUser(){
        return LoginRequest
                .builder()
                .token("123336666")
                .credentials(Credentials.builder()
                        .username("nonexistent@subocol.com")
                        .password("$m4T14s#")
                        .build())
                .build();
    }

    public static LoginRequest withDisabledUser(){
        return LoginRequest
                .builder()
                .token("123336666")
                .credentials(Credentials.builder()
                        .username("juangomez@subocol.com")
                        .password("$m4T14s#")
                        .build())
                .build();
    }

    public static LoginRequest withWrongPassword(){
        return LoginRequest
                .builder()
                .token("123336666")
                .credentials(Credentials.builder()
                        .username("diegoromerog@subocol.com")
                        .password("$m4T14s#*")
                        .build())
                .build();
    }
}
