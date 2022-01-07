package com.company;

public class Animal {



    private String name;

    public int getChipNumber() {
        return chipNumber;
    }

    private int chipNumber;



    private  String type;


    public Animal(String name , int chipNumber , String type){
        this.name = name;
        this.chipNumber = chipNumber;
        this.type = type;
    }


    public String getName() {
        return name;
    }
    public String getType() {
        return type;
    }

}
