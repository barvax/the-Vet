package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	Hospital h1 = new Hospital();
        ER er = new ER();

    h1.addClient("ron" , "n","0528586562",true);
        h1.addClient("ben" , "n","0528586562",true);
        Animal animal1 = new Animal("jullie" ,243 , "dog");
        Animal animal2 = new Animal("mookie" ,246 , "cat");
        h1.addClient("efrat" , "n","0528586562",true);
        showClientList(h1);
        h1.addPetToClient(3 , animal1);
        h1.addPetToClient(3 , animal2);
        h1.sendMessageToDogOwners();
        h1.addPetToER(245);
        er.showAnimalsInER();
        h1.addPetToER(243);
        h1.addPetToER(246);
        er.showAnimalsInER();
        h1.removePetFromER(243);
        er.showAnimalsInER();
    }

    public static void showClientList(Hospital hospitalName){
        System.out.println("###############");
        System.out.println("total clients in Hospital is: "+ hospitalName.getClients().size());
        for (int i = 0; i < hospitalName.getClients().size(); i++) {
            System.out.println("client: " + (i+1));
            System.out.print(hospitalName.getClients().get(i).clientNumber+",");
            System.out.print(hospitalName.getClients().get(i).getFirstName()+",");
            System.out.print(hospitalName.getClients().get(i).getLastName()+",");
            System.out.print(hospitalName.getClients().get(i).getPhone()+",");
            System.out.print(hospitalName.getClients().get(i).getPets()+",");
            System.out.println(hospitalName.getClients().get(i).isAds());
            System.out.println("--------------");
        }
        System.out.println("###############");
    }
}
