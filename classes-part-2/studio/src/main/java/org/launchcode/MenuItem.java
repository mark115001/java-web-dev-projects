package org.launchcode;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class MenuItem {
    private String itemName;
    private double price;
    private String description;
    private String category;
    private boolean isNew;
    private final LocalDate dateAdded;

    public MenuItem(LocalDate dateAdded) {
        this.itemName = "Item Name";
        this.price = 1.00;
        this.description = "Describe menuItem";
        this.category = "type";
        this.isNew = false;
        this.dateAdded =  LocalDate.now();
//        this.dateAdded = LocalDate.parse("2022-06-12"); // used to test dateAdded = false
    }

    public MenuItem(String itemName, double price, String description, String category, boolean isNew) {
        this.itemName = itemName;
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = isNew;
        this.dateAdded = LocalDate.now();
//        this.dateAdded = LocalDate.parse("2022-06-12");  // used to test dateAdded = false
    }
    @Override
    public String toString() {

        String newText = isNew() ? " - NEW!" : " ";

        return this.itemName + newText + "\n ------- \n" + this.price + "-" + this.description + "-" + this.category + "-" + this.isNew;
    }

    @Override
    public boolean equals(Object toBeCompared) {

        if (this == toBeCompared) {      // testing same memory location that's why using 'this'
            return true;
        }
        if (toBeCompared == null) {
            return false;
        }
        if(getClass() != toBeCompared.getClass()) {
            return false;
        }
        MenuItem otherItem = (MenuItem) toBeCompared;

        return  this.itemName.equals(otherItem.getItemName());  //I think this is the toBeCompared equals not this method
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

//    public boolean isNew() {
//        return this.isNew;
//    }

    public void setNew(boolean aisNew) {
        this.isNew = aisNew;
    }

    public LocalDate getDateAdded() {
        return dateAdded;
    }
    boolean isNew() {
        LocalDate today = LocalDate.now();
        double daysBetween;
        daysBetween = getDateAdded().until(today, ChronoUnit.DAYS);
        return daysBetween < 90;
    }
}


