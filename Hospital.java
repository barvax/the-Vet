package com.company;

import java.util.ArrayList;

public class Hospital {


    private ArrayList<Client> clients = new ArrayList<>();

    public ArrayList<Client> getClients() {
        return clients;
    }

    public void addClient(String firstName, String lastName, String phone, boolean ads) {
        Client c = new Client(firstName, lastName, phone, ads);
        clients.add(c);
        c.clientNumber = Client.getCounter();
        Client.setCounter(Client.getCounter() + 1);

    }

    public void removeClient(int clientNumber) {
        boolean found = false;
        for (int i = 0; i < clients.size(); i++) {

            if (clients.get(i).getClientNumber() == clientNumber) {
                clients.remove(clientNumber);
                found = true;
                break;
            }

        }
        if (!found) {
            System.out.println("no client with the number: " + clientNumber);
        }

    }

    public void addPetToClient(int clientNumber, Animal animal) {
        boolean found = false;
        for (int i = 0; i < clients.size(); i++) {
            if (clients.get(i).getClientNumber() == clientNumber) {
                clients.get(i).addPetToList(animal);

                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("no client with the number: " + clientNumber);
        } else {
            System.out.println(animal.getName() + " added to client");
        }
    }

    public void removePetToClient(int clientNumber, Animal animal) {
        boolean found = false;
        for (int i = 0; i < clients.size(); i++) {
            if (clients.get(i).getClientNumber() == clientNumber) {
                clients.get(i).removePetToList(animal);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("no client with the number: " + clientNumber);
        } else {
            System.out.println(animal.getName() + " removed from client");
        }
    }

    public void showFnamePhone(int i) {
        System.out.println("name: " + clients.get(i).getFirstName() + ", phone number: " + clients.get(i).getPhone());
    }

    public void sendAdd(String content) {
        for (int i = 0; i < clients.size(); i++) {
            if (clients.get(i).isAds() == true) {
                showFnamePhone(i);
                //sendSMS (content);
            }

        }
    }

    public void sendMessageToDogOwners() {
        for (int i = 0; i < clients.size(); i++) {
            if (clients.get(i).haveDog() == true) {
                showFnamePhone(i);
                System.out.println("come to vaccine your dog");
            }
        }

    }

    public boolean addPetToER(int chipNumber) {
        if (ER.animalsInBed.size() < ER.getAvalbleBeds()) {

            for (int i = 0; i < clients.size(); i++) {
                for (int j = 0; j < clients.get(i).getPets().size(); j++) {
                    if (clients.get(i).getPets().get(j).getChipNumber() == chipNumber) {
                        System.out.println("enteranimalToER ,  chip num: " + chipNumber);
                        ER.getAnimalsInBed().add(clients.get(i).getPets().get(j));
                        return true; // בעל חיים נכנס למיטה
                    }

//
//                }
                }

            }
            System.out.println("chipNumber " + chipNumber+ " not exist try another chip number");
        }
        return false;
    }

    public void removePetFromER(int chipNumber){
        for (int i = 0; i < ER.getAnimalsInBed().size(); i++) {
            if(ER.getAnimalsInBed().get(i).getChipNumber()==chipNumber){
                ER.getAnimalsInBed().remove(ER.getAnimalsInBed().get(i));
                System.out.println(findPetOwnerByChipNumber(chipNumber).getFirstName() + ". pls come to the Hospital ER to take your animal");
            }
        }

    }

    public Client findPetOwnerByChipNumber(int chipNumber){
        for (int i = 0; i < clients.size(); i++) {
            for (int j = 0; j < clients.get(i).getPets().size(); j++) {
                if (clients.get(i).getPets().get(j).getChipNumber() == chipNumber) {
                   return clients.get(i);


                }


            }

        }
        return null;
    }
}
