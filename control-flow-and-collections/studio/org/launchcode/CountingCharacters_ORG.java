package org.launchcode;

import java.util.HashMap;
import java.util.Map;


public class CountingCharacters_ORG {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
        HashMap<Character, Integer> characterCounts = new HashMap<>();
        String testString;
//        testString = "Jess55ica@ h-a_s the# be#st gro0+up".toUpperCase().replaceAll("[^a-zA-Z0-9]", "");
//        System.out.println("Input a phase to count its characters");
//        testString = input.nextLine().toUpperCase().replaceAll("[^a-zA-Z0-9]", "");
        testString = ReadFile.getFile();
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
            System.out.println(oneChar.getKey() + ": " + oneChar.getValue());
        }
    }
}
