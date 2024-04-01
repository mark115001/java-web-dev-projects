package org.launchcode;

//import java.util.Locale;
import java.util.Arrays;
import java.util.Scanner;
public class Rectangle {
    public static void main(String[] args) {
        //A. Input/Output
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, what is your name?");
        String name = input.nextLine();
        System.out.println("Hello " + name);

        //B. Numeric Types - Rectangle
        Scanner input2 = new Scanner(System.in);
        System.out.println("\n" + name + ", Please input length and width to find the area of a rectangle" + "\nInput length of rectangle");
        Integer recLen = Integer.valueOf(input2.nextLine());

        Scanner input3 = new Scanner(System.in);
        System.out.println("Input width of rectangle");
        Integer recWidth = Integer.valueOf(input3.nextLine());

//        int rectangleArea = recLen * recWidth;
//        System.out.println("Hello " + name);
//        System.out.println("The area of this rectangle is " + rectangleArea);
//        System.out.println("The area of this rectangle is " + recLen * recWidth);
        System.out.println(name + "!!!\nThe area of this rectangle is " + (recLen * recWidth));

        //C. Numeric Types - Gasoline
//        Scanner input2 = new Scanner(System.in);
        System.out.println("\nNext Section - Miles Per Gallon:\n Input number of miles driven");
//        Integer recLen = Integer.valueOf(input2.nextLine());
        Double miles = input2.nextDouble();

//        Scanner input3 = new Scanner(System.in);
        System.out.println("Input number of gallons used");
//        Integer gallons = Integer.valueOf(input3.nextLine());
        Double gallons = input2.nextDouble();
        Double mpg = miles/gallons;
        System.out.format("Hello " + name + "!!!\nMiles per gallon is " +  miles/gallons + "\n\nNext Section - Strings\n");

//        D. Strings - Ask for term to search for

        String sentence = "Alice was beginning to get very tired of sitting by her sister on \n" +
                "the bank, and of having nothing to do: once or twice she had peeped into the \n" +
                "book her sister was reading, but it had no pictures or conversations \n" +
                "in it, and what is the use of a book,’ thought Alice ‘without pictures \n" +
                "or conversation?";

        String searchText = "";
        String inputText = "";
        System.out.println("\n\n" + sentence + "\n\nFrom the sentence above...Enter 'term' to search for");
//        searchText = "very tired";
//        searchText = searchText.toLowerCase(input.nextLine());
        inputText = input.nextLine();
        searchText = inputText.toLowerCase();
//        if (searchText.equals(sentence.toLowerCase(Locale.forLanguageTag(searchText)))) {
        if (searchText.equals(searchText)) {
            System.out.println("'" + searchText + "' was found");
            //E. Strings - Index and length of string
            System.out.println("'" + searchText + "' was found beginning at index " + sentence.indexOf(searchText));
            System.out.println("'" + searchText + "' length is " + searchText.length() + "characters");
        } else {
            System.out.println(searchText + " was NOT found");
        }
        if (searchText.equals(true)) {
            String[] shortenedSearchString;
            String newSentence = "";
            shortenedSearchString = new String[]{Arrays.toString(sentence.split(searchText))};
            newSentence = shortenedSearchString[0];
            System.out.println("\n 'Alice' sentence without '" + searchText + "'\n" + newSentence);
        } else {
            System.out.println("\nNo change to the original 'Alice' sentence...it's still...\n" + sentence);

        }
    }


}

