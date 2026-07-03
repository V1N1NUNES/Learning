package PracticeProjects.CarRental.Repository;

import PracticeProjects.CarRental.Models.Client;

import java.util.ArrayList;
import java.util.Scanner;

public class ClientRepository {
    //variables for workflow
    Scanner read = new Scanner(System.in);

    //Memories Data bases
    ArrayList<Client> clients =  new ArrayList<Client>();


    //methods for create, search, modify and delete
    public boolean ClientSearch(String id){
        boolean option = true;

        for(Client c:clients){
            if(id.equals(c.getId())){
                option = true;
            }
            else{
                option = false;
            }
        }
        return option;
    }
}
