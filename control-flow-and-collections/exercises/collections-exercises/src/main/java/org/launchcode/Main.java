package org.launchcode;

import java.util.ArrayList;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] intArr = {1,1,2,3,5,8};
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//        System.out.print("Hello and welcome!");

//        for (int i = 1; i <= 5; i++) {
            System.out.println("All Array Numbers");
            for (Integer num : intArr) {
                System.out.println(num);
            }
                System.out.println();

                System.out.println("Array Odd numbers");

            for (Integer num : intArr) {
                if (num % 2 == 1) {
                    System.out.println(num);
                }
            }

        System.out.println();

        String sentence = "I would not, could not, in a box. I would not, could not with a fox." +
                " I will not eat them in a house. I will not eat them with a mouse.";

        String[] arrOfStr = sentence.split(" "); // split with a 'space'
        System.out.println(Arrays.toString(arrOfStr));
        System.out.println();
        String[] arrSentence = sentence.split("\\."); //split by a 'period' into sentence objects
        System.out.println(Arrays.toString(arrSentence));

        //ARRAY PRACTICE
        int[] sumArray = {2,5,7,23,45,898,55,1,98,235,111,450,11,60,600};
//
       Integer checkEven = GetEven.sumEven(sumArray);
       System.out.println("\nThe total for even number from 'sumArray' is " + checkEven);

       CheckLetters.fiveLetterCount(sentence);
       System.out.println("\nThat's all folks");
//
//        public static int evenArr(arr) {
//            int newSum = 0;
//            for (int i : sumArray) {
//                if (i % 2 == 0) {
//                    newSum += i;
//                }
//            }
//            return newSum;
//        }

//        public static string wordLength(ArrayList<String> sentence ) {
//
//        }

            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            System.out.println("i = " + i);
        }
    }
