package com.subocol.mastercrash.features.users;

import com.subocol.mastercrash.conf.BaseTest;
import com.subocol.mastercrash.factories.RegisteredUser;
import com.subocol.mastercrash.facts.AnUserRegistered;
import com.subocol.mastercrash.models.register.UserRegisterRequest;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.thucydides.core.annotations.Narrative;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(SerenityJUnit5Extension.class)
@Narrative(text = {"As a user",
        "I want to be able to ..",
        "in order to ..."})
@DisplayName("Register users feature")
public class RegisterUsersTests extends BaseTest {

    @Test
    @DisplayName("Register an user")
    void registerAnUserFactSample(){

        UserRegisterRequest userToRegisterWithDefaultInfo =
                RegisteredUser.withDefaultInfo();

        actor.has(
                AnUserRegistered.withInfo(userToRegisterWithDefaultInfo)
        );


    }
}
