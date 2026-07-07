package PracticeProjects.CarRental.Repository;

import PracticeProjects.CarRental.Models.Client;

import java.util.ArrayList;
import java.util.Scanner;

public class ClientRepository {
    //variables for workflow

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

    public void AddClient(){

    }

    public void DeleteClient(){

    }

    public void UpdateClient(){

    }
}
