package org.launchcode;

public class CD extends BaseDisk implements OpticalDisk {
    // TODO: Implement your custom interface.

    @Override
    public double spinDisc() {
        System.out.println("A CD spins at a rate of 200 - 500 rpm.");
        return 0;
    }


    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
