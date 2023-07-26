package com.subocol.mastercrash.factories;

import com.subocol.mastercrash.models.captcha.CaptchaRequest;

public class CaptchaFactory {

    public static CaptchaRequest withValidCaptcha(){
        return CaptchaRequest
                .builder()
                .secret("secret")
                .response("tokenValid")
                .build();
    }

    public static CaptchaRequest withDuplicateToken(){
        return CaptchaRequest
                .builder()
                .secret("secret")
                .response("tokenDuplicate")
                .build();
    }

    public static CaptchaRequest withRobotCaptcha(){
        return CaptchaRequest
                .builder()
                .secret("Robot")
                .response("")
                .build();
    }

    public static CaptchaRequest withMissingInputSecretCaptcha(){
        return CaptchaRequest
                .builder()
                .secret("")
                .response("tokenValid")
                .build();
    }

    public static CaptchaRequest withMissingInputResponseCaptcha(){
        return CaptchaRequest
                .builder()
                .secret("secret")
                .response("")
                .build();
    }

    public static CaptchaRequest withInvalidSecretCaptcha(){
        return CaptchaRequest
                .builder()
                .secret("invalidSecret")
                .response("tokenValid")
                .build();
    }

    public static CaptchaRequest withInvalidResponseCaptcha(){
        return CaptchaRequest
                .builder()
                .secret("secret")
                .response("invalidToken")
                .build();
    }

    public static CaptchaRequest withBadRequestCaptcha(){
        return CaptchaRequest
                .builder()
                .secret("secret")
                .response("badRequest")
                .build();
    }
}
