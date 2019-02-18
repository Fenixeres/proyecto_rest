package com.project.services.dummy.util;

import com.google.gson.Gson;
import org.springframework.stereotype.Component;

@Component
public class GenericMethods {

    public void getLogRequest(String parameter) {
        Gson gson = new Gson();
        System.out.println("REQUEST :: HEADERS: " + gson.toJson(parameter));
    }

    public void getLogResponse(Object parameter) {
        Gson gson = new Gson();
        System.out.println("RESPONSE :: DATA: " + gson.toJson(parameter));
    }
}
