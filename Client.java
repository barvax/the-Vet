package com.company;

import java.util.ArrayList;

public class Client {

    private static  int counter =1;
    public int clientNumber;
    private String firstName;
    private String lastName;
    private String phone;
    public ArrayList<Animal> pets = new ArrayList<>();
    private boolean ads;


    public Client(String firstName,String lastName,String phone,boolean ads){
    this.firstName = firstName;
    this.lastName = lastName;
    this.phone = phone;

    this.ads = ads;
    }


    public static int getCounter() {
        return counter;
    }
    public static void setCounter(int counter) {
        Client.counter = counter;
    }
    public int getClientNumber() {
        return clientNumber;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getPhone() {
        return phone;
    }
    public ArrayList<Animal> getPets() {
        return pets;
    }

//    public void setPets(ArrayList<Animal> pets) {
//        this.pets = pets;
//    }
    public boolean isAds() {
        return ads;
    }
    public void addPetToList(Animal animal){
        pets.add(animal);
    }
    public void removePetToList(Animal animal){
        pets.remove(animal);
    }

    public boolean haveDog(){
        for (int i = 0; i < pets.size(); i++) {
            if(pets.get(i).getType()=="dog"){
                return true;
            }

        }
        return false;
    }

}
