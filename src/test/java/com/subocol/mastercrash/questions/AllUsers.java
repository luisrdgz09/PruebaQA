package com.subocol.mastercrash.questions;

import com.subocol.mastercrash.models.users.UsersResponse;
import com.subocol.mastercrash.util.ResponseUtil;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Question;

public class AllUsers {

    public static Question<UsersResponse> response() {
        return actor -> ResponseUtil
                .getModelFromResponse(SerenityRest.lastResponse().asString(),
                        UsersResponse.class);
    }
}
