package com.subocol.mastercrash.features.users;

import com.subocol.mastercrash.conf.BaseTest;
import com.subocol.mastercrash.models.users.SingleUserResponse;
import com.subocol.mastercrash.models.users.UsersResponse;
import com.subocol.mastercrash.questions.AllUsers;
import com.subocol.mastercrash.questions.SingleUser;
import com.subocol.mastercrash.tasks.GetAllUsers;
import com.subocol.mastercrash.tasks.GetSingleUser;
import com.subocol.mastercrash.util.StringToJson;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Narrative;
import net.thucydides.core.annotations.TestsRequirement;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.io.IOException;

@ExtendWith(SerenityJUnit5Extension.class)
@Narrative(text = {"As a user",
        "I want to be able to ..",
        "in order to ..."})
@DisplayName("Get users feature")
public class GetUsers extends BaseTest {


    /* Scenario:
    * Given Pepe wants to buy a coffee
    * When ...
    * Then ...
    * */
    @Test
    @DisplayName("Get all the users registered from displayed name")
    @Tag("regression")
    @TestsRequirement("Given I want to buy" +
            "When I buy " +
            "Then I should ....")
    void getAllUsers() {
        actor.attemptsTo(
                GetAllUsers.registered()
        );

        UsersResponse allUsers = AllUsers.response().answeredBy(actor);

        /*actor.should(
                seeThat(act -> allUsers.getPage(),
                        equalTo(1)),
                seeThat(act -> allUsers.getPer_page(),
                        equalTo(6)),
                seeThat(act -> allUsers.getTotal_pages(),
                        equalTo(2))
        );*/

        actor.attemptsTo(
                Ensure.that(allUsers.getPage()).isEqualTo(1),
                Ensure.that(allUsers.getPer_page()).isEqualTo(6),
                Ensure.that(allUsers.getTotal_pages()).isEqualTo(2));
    }

    @Test
    @DisplayName("Get a single user")
    @Tag("humo")
    void getASingleUser() {
        int userId = 2;

        actor.attemptsTo(
                GetSingleUser.byId(userId)
        );

        SingleUserResponse singleUser = SingleUser.response().answeredBy(actor);

        actor.attemptsTo(
                Ensure.that(singleUser.getData().getEmail()).isEqualTo("janet.weaver@reqres.in"),
                Ensure.that(singleUser.getData().getId()).isEqualTo(userId),
                Ensure.that(singleUser.getData().getFirst_name()).isEqualTo("Janet")
        );
    }


    @Test
    @DisplayName("Get a single user")
    @Tag("users 2")
    void getAUsersFromJsonFile() throws IOException {

        StringToJson users = new StringToJson();
        users.getUsers().forEach(System.out::println);
    }
}


