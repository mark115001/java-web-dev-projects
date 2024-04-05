package org.launchcode;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;


public class CountingCharacters {
    public static void main(String[] args) {
        HashMap<Character, Integer> characterCounts = new HashMap<>();
        String testString = "";
        String testSentence = "'The# q!u&i*ck bro0@wn f0x ju&mp(ed 0Ov#$er th# laz^y d0og+up'";
        Scanner input = new Scanner(System.in);
        String userAnswer;

        do {
            System.out.println("COUNTING CHARACTERS IN A LINE");
            System.out.println("Enter 't' to count letters in " + testSentence);
            System.out.println("Enter 'e' to count letters in a line you type");
            System.out.println("Enter 'f' to read a line from a file that contains " + testSentence);
            userAnswer = input.nextLine().toLowerCase();
            if (userAnswer.equals("t")) {
                testString = AlphaChars.justAlpha(testSentence); // hard coded sentence
                //            testString = "The# q!u&i*ck bro0@wn f0x ju&mp(ed 0Ov#$er th# laz^y d0og+up".toUpperCase().replaceAll("[^a-zA-Z0-9]", "");
                userAnswer = "";
            } else if (userAnswer.equals("e")) {
                System.out.println("Input a phase to count its characters");
                userAnswer = input.nextLine();
                testString = AlphaChars.justAlpha(userAnswer); //user line input
                userAnswer = "";
                //            testString = input.nextLine().toUpperCase().replaceAll("[^a-zA-Z0-9]", "");
            } else if (userAnswer.equals("f")) {
                userAnswer = ReadFile.getFile();
                testString = AlphaChars.justAlpha(userAnswer); // read from a file
                userAnswer = "";
            } else {
                if (!userAnswer.isEmpty()) {
                    System.out.println("Invalid response....please try again");
                }
            }
        } while (!userAnswer.isEmpty());

        char[] characterInString = testString.toCharArray();
        for (char character : characterInString) {
            if (characterCounts.containsKey(character)) {
                characterCounts.put(character, characterCounts.get(character) + 1);
            } else {
                characterCounts.put(character, 1);
            }
        }
        for (Map.Entry<Character, Integer> oneChar : characterCounts.entrySet()) {
            System.out.println(oneChar.getKey() + ": " + oneChar.getValue());
        }
    }
}
