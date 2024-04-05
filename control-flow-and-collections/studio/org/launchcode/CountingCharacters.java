package org.launchcode;

import java.util.Map;
import java.util.HashMap;

public class CountingCharacters {
    public static void main(String[] args) {
        HashMap<Character, Integer> characterCounts = new HashMap<>();
        String testString = "Hello World";
        char[] characterInString = testString.toCharArray();
        for (char character : characterInString) {
            if (characterCounts.containsKey(character)) {
                characterCounts.put(character, characterCounts.get(character) + 1);
            }
            else {
                characterCounts.put(character, 1);
            }
        }
        for (Map.Entry<Character, Integer> oneChar : characterCounts.entrySet()) {
            System.out.println(oneChar.getKey() + "; " + oneChar.getValue());
        }
    }
}
