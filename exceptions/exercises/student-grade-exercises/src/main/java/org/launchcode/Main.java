package org.launchcode;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Test out your Divide() function!

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!
    }

    public static void Divide(int x, int y)
    {
        try {
            int result = x / y;
        }
            catch(ArithmeticException e) {

                System.out.println("ArithmeticException occurred....division by 0 ");
                throw e;
            }

        // Write code here!
    }

    public static int CheckFileExtension(String fileName) {
        int num;
        if (fileName.endsWith("java")) {
            num = 1;
    } else if (fileName.endsWith(null) || fileName.endsWith("")) {
            num = -1;
    } else {
            num = 0;
        }
        // Write code here!
        return num;
    }
}