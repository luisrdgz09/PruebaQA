package com.subocol.mastercrash.features.users;

import com.subocol.mastercrash.conf.BaseTest;
import com.subocol.mastercrash.factories.LoginFactory;
import com.subocol.mastercrash.tasks.Login;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Narrative;
import org.apache.http.HttpStatus;
import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;


@ExtendWith(SerenityJUnit5Extension.class)
@Narrative(text = {"As a user",
        "I want to be able to ..",
        "in order to ..."})
@DisplayName("Login feature")
public class LoginTest extends BaseTest {

    @Test
    @DisplayName("Login with valid user")
    @Tag("mock")
    void loginWithValidCredentials() {

        actor.attemptsTo(
                Login
                        .with(LoginFactory.withValidUser())
        );

        Assert.assertEquals(HttpStatus.SC_OK, SerenityRest.lastResponse().statusCode());
        //Ensure.that(SerenityRest.lastResponse().statusCode())
        //        .isEqualTo(HttpStatus.SC_OK);

    }

    @Test
    @DisplayName("Login with invalid password")
    @Tag("mock")
    void loginWithInvalidPassword() {

        actor.attemptsTo(
                Login
                        .with(LoginFactory.withInvalidPassword())
        );

        Assert.assertEquals(HttpStatus.SC_INTERNAL_SERVER_ERROR, SerenityRest.lastResponse().statusCode());
        //Ensure.that(SerenityRest.lastResponse().statusCode())
        //        .isEqualTo(HttpStatus.SC_OK);

    }

    @Test
    @DisplayName("Login with unauthorized user")
    @Tag("mock")
    void loginWithUnauthorizedUser() {

        actor.attemptsTo(
                Login
                        .with(LoginFactory.withUnauthorizedUser())
        );

        Assert.assertEquals(HttpStatus.SC_UNAUTHORIZED, SerenityRest.lastResponse().statusCode());
        //Ensure.that(SerenityRest.lastResponse().statusCode())
        //        .isEqualTo(HttpStatus.SC_OK);

    }
    @Test
    @DisplayName("Login with Required User")
    @Tag("mock")
    void loginWithRequiredUser() {

        actor.attemptsTo(
                Login
                        .with(LoginFactory.withRequiredUser())
        );

        Assert.assertEquals(HttpStatus.SC_BAD_REQUEST, SerenityRest.lastResponse().statusCode());
        //Ensure.that(SerenityRest.lastResponse().statusCode())
        //        .isEqualTo(HttpStatus.SC_BAD_REQUEST);

    }

    @Test
    @DisplayName("Login with Required Password")
    @Tag("mock")
    void loginWithRequiredPassword() {

        actor.attemptsTo(
                Login
                        .with(LoginFactory.withRequiredPassword())
        );

        Assert.assertEquals(HttpStatus.SC_BAD_REQUEST, SerenityRest.lastResponse().statusCode());
        //Ensure.that(SerenityRest.lastResponse().statusCode())
        //        .isEqualTo(HttpStatus.SC_BAD_REQUEST);

    }

    @Test
    @DisplayName("Login with inactive rol")
    @Tag("mock")
    void loginWithInactiveRol() {

        actor.attemptsTo(
                Login
                        .with(LoginFactory.withInactiveRol())
        );

        Assert.assertEquals(HttpStatus.SC_INTERNAL_SERVER_ERROR, SerenityRest.lastResponse().statusCode());
        //Ensure.that(SerenityRest.lastResponse().statusCode())
        //        .isEqualTo(HttpStatus.SC_INTERNAL_SERVER_ERROR);

    }

    @Test
    @DisplayName("Login with invalid login captcha")
    @Tag("mock")
    void loginWithInvalidLoginCaptcha() {

        actor.attemptsTo(
                Login
                        .with(LoginFactory.withInvalidLoginCaptcha())
        );

        Assert.assertEquals(HttpStatus.SC_INTERNAL_SERVER_ERROR, SerenityRest.lastResponse().statusCode());
        //Ensure.that(SerenityRest.lastResponse().statusCode())
        //        .isEqualTo(HttpStatus.SC_INTERNAL_SERVER_ERROR);

    }

    @Test
    @DisplayName("Login with failed connection to db")
    @Tag("mock")
    void loginWithFailedConnectionToDB() {

        actor.attemptsTo(
                Login
                        .with(LoginFactory.withFailedConnectionToDB())
        );

        Assert.assertEquals(HttpStatus.SC_INTERNAL_SERVER_ERROR, SerenityRest.lastResponse().statusCode());
        //Ensure.that(SerenityRest.lastResponse().statusCode())
        //        .isEqualTo(HttpStatus.SC_INTERNAL_SERVER_ERROR);

    }

    @Test
    @DisplayName("Login with empty db")
    @Tag("mock")
    void loginWithEmptyDB() {

        actor.attemptsTo(
                Login
                        .with(LoginFactory.withEmptyDB())
        );

        Assert.assertEquals(HttpStatus.SC_INTERNAL_SERVER_ERROR, SerenityRest.lastResponse().statusCode());
        //Ensure.that(SerenityRest.lastResponse().statusCode())
        //        .isEqualTo(HttpStatus.SC_INTERNAL_SERVER_ERROR);

    }

    @Test
    @DisplayName("Login with valid captcha")
    @Tag("mock")
    void loginWithValidCaptcha() {

        actor.attemptsTo(
                Login
                        .with(LoginFactory.withValidCaptcha())
        );

        Assert.assertEquals(HttpStatus.SC_OK, SerenityRest.lastResponse().statusCode());
        //Ensure.that(SerenityRest.lastResponse().statusCode())
        //        .isEqualTo(HttpStatus.SC_OK);

    }
    @Test
    @DisplayName("Login with invalid response captcha")
    @Tag("mock")
    void loginWithInvalidResponseCaptcha() {

        actor.attemptsTo(
                Login
                        .with(LoginFactory.withInvalidResposeCaptcha())
        );

        Assert.assertEquals(HttpStatus.SC_INTERNAL_SERVER_ERROR, SerenityRest.lastResponse().statusCode());
        //Ensure.that(SerenityRest.lastResponse().statusCode())
        //        .isEqualTo(HttpStatus.SC_INTERNAL_SERVER_ERROR);

    }

    @Test
    @DisplayName("Login with invalid secret captcha")
    @Tag("mock")
    void loginWithInvalidSecretCaptcha() {

        actor.attemptsTo(
                Login
                        .with(LoginFactory.withInvalidSecretCaptcha())
        );

        Assert.assertEquals(HttpStatus.SC_INTERNAL_SERVER_ERROR, SerenityRest.lastResponse().statusCode());
        //Ensure.that(SerenityRest.lastResponse().statusCode())
        //        .isEqualTo(HttpStatus.SC_INTERNAL_SERVER_ERROR);

    }

    @Test
    @DisplayName("Login with missing input response captcha")
    @Tag("mock")
    void loginWithMissingInputResponseCaptcha() {

        actor.attemptsTo(
                Login
                        .with(LoginFactory.withMissingInputResponseCaptcha())
        );

        Assert.assertEquals(HttpStatus.SC_INTERNAL_SERVER_ERROR, SerenityRest.lastResponse().statusCode());
        //Ensure.that(SerenityRest.lastResponse().statusCode())
        //        .isEqualTo(HttpStatus.SC_BAD_REQUEST);

    }

    @Test
    @DisplayName("Login with missing input secret captcha")
    @Tag("mock")
    void loginWithMissingInputSecretCaptcha() {

        actor.attemptsTo(
                Login
                        .with(LoginFactory.withMissingInputSecretCaptcha())
        );

        Assert.assertEquals(HttpStatus.SC_INTERNAL_SERVER_ERROR, SerenityRest.lastResponse().statusCode());
        //Ensure.that(SerenityRest.lastResponse().statusCode())
        //        .isEqualTo(HttpStatus.SC_BAD_REQUEST);

    }
    @Test
    @DisplayName("Login with robot captcha")
    @Tag("mock")
    void loginWithRobotCaptcha() {

        actor.attemptsTo(
                Login
                        .with(LoginFactory.withRobotCaptcha())
        );

        Assert.assertEquals(HttpStatus.SC_INTERNAL_SERVER_ERROR, SerenityRest.lastResponse().statusCode());
        //Ensure.that(SerenityRest.lastResponse().statusCode())
        //        .isEqualTo(HttpStatus.SC_OK);

    }

    @Test
    @DisplayName("Login with timed out or duplicate token captcha")
    @Tag("mock")
    void loginWithDuplicateCaptcha() {

        actor.attemptsTo(
                Login
                        .with(LoginFactory.withTimedOutOrDuplicateToken())
        );

        Assert.assertEquals(HttpStatus.SC_INTERNAL_SERVER_ERROR, SerenityRest.lastResponse().statusCode());

        //Ensure.that(SerenityRest.lastResponse().statusCode())
        //        .isEqualTo(HttpStatus.SC_GATEWAY_TIMEOUT);

    }

    @Test
    @DisplayName("Login with bad request captcha")
    @Tag("mock")
    void loginWithBadRequestCaptcha() {

        actor.attemptsTo(
                Login
                        .with(LoginFactory.withBadRequestCaptcha())
        );

        Assert.assertEquals(HttpStatus.SC_INTERNAL_SERVER_ERROR, SerenityRest.lastResponse().statusCode());

    }
}
