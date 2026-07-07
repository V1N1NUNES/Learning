package PracticeProjects.CarRental.Controllers;

import PracticeProjects.CarRental.Repository.ClientRepository;

public class ClientController {

    public boolean ClientManagerAccount(String id){
        //variables for workflow
        ClientRepository clientRepo = new ClientRepository();
        boolean validation = true;

            if(clientRepo.ClientSearch(id)){
                return validation;
            }else{
                validation = false;
            }
        return validation;
    }
    public void ClientControllerAccount(int option){
        ClientRepository clientRepo = new ClientRepository();
    }
}
