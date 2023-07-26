package com.subocol.mastercrash.tasks;

import com.subocol.mastercrash.endpoints.EndPoints;
import com.subocol.mastercrash.models.login.LoginRequest;
import io.restassured.http.ContentType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Post;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Login  implements Task {

    private final LoginRequest loginRequest;

    public Login(LoginRequest loginRequest){
        this.loginRequest = loginRequest;
    }

    public static Performable with(LoginRequest loginRequest) {
        return instrumented(Login.class, loginRequest);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Post.to(EndPoints.LOGIN.path())
                        .with(request -> request
                                .contentType(ContentType.JSON)
                                        .body(this.loginRequest)
                                ));
    }
}
