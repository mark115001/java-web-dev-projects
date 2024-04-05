package org.launchcode;

public class AlphaChars {

    public static String justAlpha(String str) {

        return str.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
    }
}
