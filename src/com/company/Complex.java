package com.company;

import java.util.Arrays;

public class Complex extends Building{
    private Apartment[] apartments;

    public Complex(String address, int countFloor, Apartment[] apartments) {
        super(address, countFloor);
        this.apartments = apartments;
    }

    public Apartment[] getApartments() {
        return apartments;
    }

    public void setApartments(Apartment[] apartments) {
        this.apartments = apartments;
    }
    public String getAllPeople (){
        String result = "";
       for(int i = 0; i < apartments.length;i++){
        for (int j = 0; j<apartments[i].getFamily().length;j++){
            Person p = apartments[i].getFamily()[j];
            result+="\n"+ p;
        }
       }
       return result;
    }

    @Override
    public void renovation() {
        System.out.println("Уведоьление о ремонте " + getAllPeople());
    }

    @Override
    public void connect() {
        System.out.println("В жил.комплексе есть отопление!");
    }

    @Override
    public String toString() {
        return "Complex{" +
                "apartments=" + Arrays.toString(apartments) +
                '}';
    }
}
