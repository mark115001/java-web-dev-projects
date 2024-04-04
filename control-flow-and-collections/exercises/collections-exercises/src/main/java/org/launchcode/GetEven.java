package org.launchcode;

public class GetEven {

    public static Integer sumEven(int[] arr) {
        int sumNum = 0;
        for (int i : arr) {
            if (i % 2 == 0) {
                sumNum = sumNum + i;
            }
        }
        return sumNum;
    }
}
