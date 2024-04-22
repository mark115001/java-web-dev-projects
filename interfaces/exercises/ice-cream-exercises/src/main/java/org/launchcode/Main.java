package org.launchcode;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        org.launchcode.Case menu = new org.launchcode.Case();
        ArrayList<org.launchcode.Flavor.Flavor> flavors = menu.getFlavors();
        ArrayList<org.launchcode.Cone> cones = menu.getCones();
        Comparator comparator = new FlavorComparator();

        flavors.sort(comparator);

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name' field.

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost' field.

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
    }
}