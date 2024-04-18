package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;

public class Menu {

    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private LocalDate lastUpdated;

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    @Override
    public String toString() {
        StringBuilder appetizers = new StringBuilder();
        for (MenuItem item: menuItems) {
            if (item.getCategory().equals("appetizer")) {
                appetizers.append("\n").append(item.toString()).append("\n");
            }
        }
        StringBuilder mainCourses = new StringBuilder();
        for (MenuItem item: menuItems) {
            if (item.getCategory().equals("mainCourse")) {
                mainCourses.append("\n").append(item.toString()).append("\n");
            }
        }
        StringBuilder deserts = new StringBuilder();
        for (MenuItem item: menuItems) {
            if (item.getCategory().equals("desert")) {
                deserts.append("\n").append(item.toString()).append("\n");
            }
        }
        return "\nHELLO WORLD MENU\n" +
                "APPETIZERS" + appetizers + "\n" +    //appetizers.toString can be added but not necessary due to concatenation
                "MAIN COURSES" + mainCourses + "\n" +
                "DESERTS" + deserts + "\n";
    }

    void addItem(MenuItem newItem) {
        if (menuItems.contains(newItem)) {
            System.out.println(newItem + " already exists");
            return;
        }

        for (MenuItem item : menuItems) {
            if (item.equals(newItem)) {
                System.out.println(newItem + " already exists");
                return;
            }
        }

        menuItems.add(newItem);
//        lastUpdated = LocalDate.now();
        menuLastUpdated();
    }

    void removeItem(MenuItem item) {
        menuItems.remove(item);
//        lastUpdated = LocalDate.now();
        menuLastUpdated();
    }

    private LocalDate menuLastUpdated() {
        return LocalDate.now();
    }


}


