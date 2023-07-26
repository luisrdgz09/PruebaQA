package com.subocol.mastercrash.models.captcha;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CaptchaRequest {

    private String secret;
    private String response;

}
