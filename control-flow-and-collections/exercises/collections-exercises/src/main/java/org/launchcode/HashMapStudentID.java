package org.launchcode;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapStudentID {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        Integer newStudentID = 0;
        String studentName = "";

        System.out.println("Enter your students (or ENTER to finish):");

        // Get student names
        do {

            System.out.print("Enter Student Name: ");
            studentName = input.nextLine();

            if (!studentName.isEmpty()) {
                System.out.print("Student: " + studentName + "has been given Student ID: " + newStudentID + "\n");
                newStudentID++;

                // Read in the newline before looping back
//                input.nextLine();
            }

        } while(!studentName.isEmpty());

        // Print class roster
//        System.out.println("\nClass roster:");
//        double sum = 0.0;

//        for (Map.Entry<String, Double> student : students.entrySet()) {
//            System.out.println(student.getKey() + " (" + student.getValue() + ")");
//            sum += student.getValue();
//        }
//
//        double avg = sum / students.size();
//        System.out.println("Average grade: " + avg);
    }
}