package org.launchcode;

import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        double pi = 3.14;
        double userInput;
        double circleArea;
        Scanner input;

        input = new Scanner(System.in);
        do {
        System.out.println("Input a circle radius..must be a positive number");
            userInput = input.nextDouble();
        } while (userInput < 0);
//        circleArea = (userInput * userInput * pi);
        circleArea = Circle.getArea(userInput);
        input.close();
        System.out.println("The area with radius " + userInput + " is " + circleArea);

    } // end main
} // end Area
