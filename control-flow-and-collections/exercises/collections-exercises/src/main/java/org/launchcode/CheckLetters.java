package org.launchcode;

import java.util.Scanner;
public class CheckLetters {

    public static void fiveLetterCount(String str) {

        int charCount = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter number of characters to count? ");
        charCount = input.nextInt();

        String[] arrOfStr = str.split(" "); // split with a 'space'
        for (String word : arrOfStr) {
            if (word.length() == charCount) {
                System.out.println(word);
            }
        }
//        System.out.println(Arrays.toString(arrOfStr));
//        System.out.print(str);

    }
}