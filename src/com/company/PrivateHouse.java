package com.company;

import java.util.Arrays;

public class PrivateHouse extends Building {
    private Person[] family;
    private boolean isGardenPresent;
    private double areaOfGround;

    public PrivateHouse(String address, int countFloor, Person[] family, boolean isGardenPresent, double areaOfGround) {
        super(address, countFloor);
        this.family = family;
        this.isGardenPresent = isGardenPresent;
        this.areaOfGround = areaOfGround;
    }

    @Override
    public void renovation() {
        System.out.println("Ремонт");
    }

    @Override
    public void connect(){
        System.out.println("Подключено отопление!");
    }
    public Person[] getFamily() {
        return family;
    }

    public void setFamily(Person[] family) {
        this.family = family;
    }

    public boolean isGardenPresent() {
        return isGardenPresent;
    }

    public void setGardenPresent(boolean gardenPresent) {
        isGardenPresent = gardenPresent;
    }

    public double getAreaOfGround() {
        return areaOfGround;
    }

    public void setAreaOfGround(double areaOfGround) {
        this.areaOfGround = areaOfGround;
    }

    @Override
    public String toString() {
        return "PrivateHouse{" +
                "family=" + Arrays.toString(family) +
                ", isGardenPresent=" + isGardenPresent +
                ", areaOfGround=" + areaOfGround +
                '}';
    }
}
