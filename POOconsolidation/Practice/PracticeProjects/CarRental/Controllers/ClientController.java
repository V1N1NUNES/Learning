package PracticeProjects.CarRental.Controllers;

import PracticeProjects.CarRental.Repository.ClientRepository;

public class ClientController {

    public boolean ClientControllerAccount(int option, String id){
        //variables for workflow
        ClientRepository clientRepo = new ClientRepository();
        boolean validation = false;

        if(option==1){
            //call repository (search and return)
            if(clientRepo.ClientSearch(id)){
                validation = true;
            };
        }else{
            //call repository (create new Client account)
        }
    }
}
