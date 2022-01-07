package com.company;

import java.util.ArrayList;

public class ER {
    public static int getAvalbleBeds() {
        return avalbleBeds;
    }

    private static int avalbleBeds=5;

    public static ArrayList<Animal> animalsInBed = new ArrayList<>();


    public static ArrayList<Animal> getAnimalsInBed() {
        return animalsInBed;
    }

    public static void setAnimalsInBed(Animal animalsInBed) {
        ER.animalsInBed.add(animalsInBed) ;
    }

    public void showAnimalsInER(){
        for (int i = 0; i < animalsInBed.size(); i++) {
            System.out.println("animal name: "+animalsInBed.get(i).getName()+". animal chip number: "+ animalsInBed.get(i).getChipNumber());
        }
        System.out.println("avalble beds in the ER: " +(avalbleBeds-animalsInBed.size()));
    }









}
