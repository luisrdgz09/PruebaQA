package com.subocol.mastercrash.features.users;


import com.subocol.mastercrash.aggregators.UserAggregator;
import com.subocol.mastercrash.conf.BaseTest;
import com.subocol.mastercrash.models.data.UserData;
import com.subocol.mastercrash.tasks.GetSingleUser;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.aggregator.AggregateWith;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;

@ExtendWith(SerenityJUnit5Extension.class)
public class ParameterizedUserTestsV2 extends BaseTest {

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 4})
    //@Execution(ExecutionMode.CONCURRENT)
    public void should_get_user_by_id(
            int userId
    ) {
        actor.attemptsTo(
                GetSingleUser.byId(userId)
        );

    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data/users.csv", numLinesToSkip = 1)
    public void should_get_user_by_id_from_csv_file(
            int userId, String name, String lastName) {
        System.out.println("name is: " + name);
        System.out.println("lastname is: " + lastName);
        actor.attemptsTo(
                GetSingleUser.byId(userId)
        );
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data/users.csv", numLinesToSkip = 1)
    public void should_get_user_by_id_from_csv_file_2(
            @AggregateWith(UserAggregator.class) UserData user) {

        System.out.println("id is: " + user.getId());
        System.out.println("name is: " + user.getName());
        System.out.println("lastname is: " + user.getLastName());
    }
}