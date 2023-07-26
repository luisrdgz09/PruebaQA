package com.subocol.mastercrash.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.subocol.mastercrash.models.data.UserData;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class StringToJson {

    public List<UserData> getUsers() throws IOException {
        File file = new File(
                getClass().getClassLoader().getResource("data/users.json").getFile()
        );

        ObjectMapper mapper = new ObjectMapper();
        return  Arrays.asList(mapper.readValue(file, UserData[].class));
    }
}
