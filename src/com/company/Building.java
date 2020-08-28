package com.company;

public abstract class Building implements Connectable,Renovationable {
    private String address;
    private int countFloor;

    public Building(String address, int countFloor) {
        this.address = address;
        this.countFloor = countFloor;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCountFloor() {
        return countFloor;
    }

    public void setCountFloor(int countFloor) {
        this.countFloor = countFloor;
    }

    @Override
    public String toString() {
        return "Building{" +
                "address='" + address + '\'' +
                ", countFloor=" + countFloor +
                '}';
    }
}
