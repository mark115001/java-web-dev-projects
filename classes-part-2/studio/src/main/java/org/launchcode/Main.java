package org.launchcode;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

   MenuItem item1 = new MenuItem("French Fries", 1.00, "Signature Side", "appetizer", true);
   MenuItem item2 = new MenuItem("Hamburger", 2.00, "Signature Hamburger", "mainCourse", true);
   MenuItem item3 = new MenuItem("Ice Cream Vanilla", 1.50, "Choices of flavors", "desert", false);
   MenuItem item4 = new MenuItem("French Fries with Cheese", 2.20, "Loaded Side", "appetizer", true);
   MenuItem item5 = new MenuItem("Hamburger with Cheese", 2.50, "Signature Cheeseburger", "mainCourse", true);
   MenuItem item6 = new MenuItem("Ice Cream Chocolate", 1.50, "Choices of flavors", "desert", false);

   Menu menuItems = new Menu();

   menuItems.addItem(item1);
   menuItems.addItem(item2);
   menuItems.addItem(item3);
   menuItems.addItem(item4);
   menuItems.addItem(item5);
   menuItems.addItem(item6);

        System.out.println(menuItems);

        menuItems.removeItem(item4);

        System.out.println("----------------\n" + menuItems);

        System.out.println(item1.equals(item2));

        MenuItem item7 = new MenuItem("Ice Cream Chocolate", 1.50, "Choices of flavors", "desert", false);

        System.out.println(item6.equals(item7));

        menuItems.addItem(item1);

//        System.out.println(item1);
//        System.out.println(item2);
//        System.out.println(item3);
//        System.out.println(item4);
//        System.out.println(item5);
//        System.out.println(item6);
//        System.out.println(item1.getItemName());
//        System.out.println(item1.isNew());

        // write your code here
    }
}
