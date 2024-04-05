package org.launchcode;

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner;

public class ReadFile {

    public static String getFile() {
        String data = null;
        try {
            File myObj = new File("C:\\Users\\mlehr\\OneDrive\\Desktop\\fileTest.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
//            e.printStackTrace();
        }
        return data;
    }
}