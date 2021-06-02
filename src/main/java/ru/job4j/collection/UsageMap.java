package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {

    public static void main(String[] args) {
        HashMap<String,String> users = new HashMap<>();
        users.put("novosem@mail.ru", "Алексей Анатольевич Семин");
        for (String key : users.keySet()) {
            String value = users.get(key);
            System.out.println(key + " = " + value);
        }
    }
}
