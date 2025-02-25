package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map <String,String> userInfo = new LinkedHashMap<>();
        userInfo.put("name","Ilya");
        userInfo.put("lastName","Holik");
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        System.out.println(gson.toJson(userInfo));
    }
}