package com.subocol.mastercrash.questions;

import com.subocol.mastercrash.util.ResponseUtil;
import com.subocol.mastercrash.models.users.SingleUserResponse;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Question;

public class SingleUser {

    public static Question<SingleUserResponse> response() {
        return actor -> ResponseUtil
                .getModelFromResponse(SerenityRest.lastResponse().asString(),
                        SingleUserResponse.class);
    }
}
