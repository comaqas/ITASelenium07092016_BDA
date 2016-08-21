package helpers;

import java.util.List;
import java.util.UUID;

public class Random {
    public static String getRandomString() {
        return UUID.randomUUID().toString().replaceAll("-", "").substring(20);
    }

    public static String getRandomEmail() {
        return getRandomString() + "@mail.ru";
    }

    public static String getPassword() {
        return "P" + getRandomString();
    }

    public static String getUsername() {
        return getRandomString();
    }

    public static String getFirstName() {
        return getRandomString().substring(5);
    }

    public static String getLastName() {
        return getRandomString().substring(7);
    }

    public static String GetRandomCompany(List<String> list) {
        java.util.Random randomizer = new java.util.Random();
        return list.get(randomizer.nextInt(list.size()));
    }
}
