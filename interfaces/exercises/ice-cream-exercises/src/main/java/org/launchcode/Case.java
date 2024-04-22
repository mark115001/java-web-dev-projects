package org.launchcode;

import java.util.ArrayList;
import java.util.Arrays;

public class Case {
    private ArrayList<org.launchcode.Flavor.Flavor> flavors = new ArrayList<>();
    private ArrayList<org.launchcode.Cone> cones = new ArrayList<>();

    public Case(){
        org.launchcode.Cone cone1 = new org.launchcode.Cone("Waffle", 1.25, new ArrayList<>(Arrays.asList( "gluten")));
        org.launchcode.Cone cone2 = new org.launchcode.Cone("Sugar", 0.75, new ArrayList<>(Arrays.asList( "gluten")));
        org.launchcode.Cone cone3 = new org.launchcode.Cone("Wafer", 0.50, new ArrayList<>(Arrays.asList( "gluten")));
        org.launchcode.Cone cone4 = new org.launchcode.Cone("Bowl", 0.05, new ArrayList<>(Arrays.asList( "none")));
        cones.add(cone1);
        cones.add(cone2);
        cones.add(cone3);
        cones.add(cone4);

        org.launchcode.Flavor.Flavor flavor1 = new org.launchcode.Flavor.Flavor("Vanilla", 0.75, new ArrayList<>(Arrays.asList( "dairy")));
        org.launchcode.Flavor.Flavor flavor2 = new org.launchcode.Flavor.Flavor("Chocolate", 0.75, new ArrayList<>(Arrays.asList( "dairy")));
        org.launchcode.Flavor.Flavor flavor3 = new org.launchcode.Flavor.Flavor("Red Velvet", 0.85, new ArrayList<>(Arrays.asList( "dairy", "red #5")));
        org.launchcode.Flavor.Flavor flavor4 = new org.launchcode.Flavor.Flavor("Rocky Road", 0.85, new ArrayList<>(Arrays.asList( "dairy", "nuts", "gelatin")));
        org.launchcode.Flavor.Flavor flavor5 = new org.launchcode.Flavor.Flavor("Strawberry Sorbet", 0.50, new ArrayList<>(Arrays.asList( "strawberry")));
        flavors.add(flavor1);
        flavors.add(flavor2);
        flavors.add(flavor3);
        flavors.add(flavor4);
        flavors.add(flavor5);
    }

    public ArrayList<org.launchcode.Flavor.Flavor> getFlavors() {
        return flavors;
    }

    public ArrayList<org.launchcode.Cone> getCones() {
        return cones;
    }

    public void setFlavors(ArrayList<org.launchcode.Flavor.Flavor> flavors) {
        this.flavors = flavors;
    }

    public void setCones(ArrayList<org.launchcode.Cone> cones) {
        this.cones = cones;
    }
}
