package org.example;

import java.util.HashMap;
import java.util.Map;

public class MiscUtilities {
    static Map<String, String> credInitializer = new HashMap<>();

    static {
        credInitializer.put("userName","omkarmatkar");
        credInitializer.put("password", "cvteygbu789");
    }

    public static String doLogin(String username, String password) throws LoginException {
        if (username == null & password == null) {
            throw new LoginException("Username & Password must not be null");
        } else if (username.equals(credInitializer.get("userName")) && !password.equals(credInitializer.get("password"))) {
            return "Invalid Password";
        } else if (!username.equals(credInitializer.get("userName")) && password.equals(credInitializer.get("password"))) {
            return "Invalid Username";
        } else if (!username.equals(credInitializer.get("userName")) && !password.equals(credInitializer.get("password"))) {
            return "Invalid Username & Password";
        } else {
            return "Login was successful!";
        }
    }
}