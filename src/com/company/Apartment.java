package com.company;

import java.util.Arrays;

public class Apartment {
    private int countRooms;
    private int numberOfApartment;
    private double area;
    private boolean isBalconyPresent;
    private Person[] family;

    public Apartment(int countRooms, int numberOfApartment, double area, boolean isBalconyPresent, Person[] family) {
        this.countRooms = countRooms;
        this.numberOfApartment = numberOfApartment;
        this.area = area;
        this.isBalconyPresent = isBalconyPresent;
        this.family = family;
    }

    public int getCountRooms() {
        return countRooms;
    }

    public void setCountRooms(int countRooms) {
        this.countRooms = countRooms;
    }

    public int getNumberOfApartment() {
        return numberOfApartment;
    }

    public void setNumberOfApartment(int numberOfApartment) {
        this.numberOfApartment = numberOfApartment;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public boolean isBalconyPresent() {
        return isBalconyPresent;
    }

    public void setBalconyPresent(boolean balconyPresent) {
        isBalconyPresent = balconyPresent;
    }

    public Person[] getFamily() {
        return family;
    }

    public void setFamily(Person[] family) {
        this.family = family;
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "countRooms=" + countRooms +
                ", numberOfApartment=" + numberOfApartment +
                ", area=" + area +
                ", isBalconyPresent=" + isBalconyPresent +
                ", family=" + Arrays.toString(family) +
                '}';
    }
}
