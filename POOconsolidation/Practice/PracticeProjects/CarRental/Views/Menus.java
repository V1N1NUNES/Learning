package PracticeProjects.CarRental.Views;

import PracticeProjects.CarRental.Controllers.ClientController;
import PracticeProjects.CarRental.Controllers.MenusController;
import PracticeProjects.CarRental.Models.Client;

import java.util.Scanner;

public class Menus {

    //variables for workflow
    private final ClientController clientController = new ClientController();
    private final Client client = new Client();
    private final MenusController menusController = new MenusController();
    Scanner read;

    //interaction Menus
    public void MainMenu(Scanner read){
        this.read = read;

        int option;
        System.out.println("---------------------------------");
        System.out.println("WELCOME ON CAR RENTAL\n");

        do {
            System.out.println("Select option:\n1- Client\n2- Vehicle Registration\n3- Employee\n0- Exit");
            option = read.nextInt();

            //Option validation
            if(option < 0 || option > 3){
                System.out.println("Invalid option, try again\n\n");
            }
        }while(option < 0 || option > 3);

        //call controller
        menusController.MainMenuController(option,this, read);
    }

    //Client Menu
    public void ClientMenu(Scanner read){
        this.read = read;
        //variables for workflow
        int option;
        String id;

        System.out.println("---------------------------------");
        System.out.println("CLIENT MENU\n");

        do {
            System.out.println("Has an account?\n1- Yes\n2- No");
            option = read.nextInt();

            if(option < 0 || option > 2){
                System.out.println("Invalid option, try again\n\n");
            }
        }while(option < 0 || option > 2);

        //update for use switchcase for choice
        if(option == 1){

            System.out.println("Enter with ClientId: ");
            id = read.next();

            //call searchClientRepo
            if(clientController.ClientManagerAccount(id)){
                System.out.println("Client with:");
                client.setId(id);
                System.out.println("Is found!\n");

                //continue menuClient (add, update and delete client)
            }else{
                System.out.println("Client is not found, returning main menu\n\n");
                this.MainMenu(read);
            }
        }else{
            do{
                System.out.println("Want create a new Login?\n1- Yes\n2- No");
                option = read.nextInt();

                if(option < 0 || option > 2){
                    System.out.println("Invalid option, try again\n\n");
                }
            }while(option < 1 || option > 2);

            if(option == 1){
                //call ClientControllerAccount
                clientController.ClientControllerAccount(option);
            }else{
                System.out.println("Returning main menu\n\n");
                this.MainMenu(read);
            }
        }
    }

    //Vehicle Menu
    public void VehicleRegistrationMenu(Scanner read){

    }


    //Employee Menu
    public void EmployeeRegistrationMenu(Scanner read){

    }

}
