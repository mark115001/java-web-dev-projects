package org.launchcode;

public abstract class BaseDisk {

    private double rpmDiskSpeed;

    private double diskCapacity;

    BaseDisk() {
        this.rpmDiskSpeed = 100;
        this.diskCapacity = 720;
    }

    BaseDisk(Double diskspeed, Double diskCapacity) {
        this.rpmDiskSpeed = diskspeed;
        this.diskCapacity = diskCapacity;
    }

    public void setRpmDiskSpeed(double rpmDiskSpeed) {
        this.rpmDiskSpeed = rpmDiskSpeed;
    }

    public void setDiskCapacity(double diskCapacity) {
        this.diskCapacity = diskCapacity;
    }

    public double getRpmDiskSpeed() {
        return rpmDiskSpeed;
    }

    public double getDiskCapacity() {
        return diskCapacity;
    }
}
