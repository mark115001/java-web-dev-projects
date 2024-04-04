package org.launchcode;

import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        Scanner input2 = new Scanner(System.in);
        double recLen;
        do {
            System.out.println("Please input the radius of a circle ");
            recLen = input2.nextDouble();

            if (recLen >= 0) {
                System.out.println("The area of the circle with radius " + recLen + " is " + (recLen * recLen * 3.14));
            }

        } while (recLen >= 0);
    }
}
