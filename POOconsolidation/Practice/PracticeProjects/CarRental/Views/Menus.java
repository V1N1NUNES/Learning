package PracticeProjects.CarRental.Views;

import PracticeProjects.CarRental.Controllers.ClientController;
import PracticeProjects.CarRental.Controllers.MenusController;
import PracticeProjects.CarRental.Models.Client;

import java.util.Scanner;

public class Menus {

    //variables for workflow
    private Menus menu =  new Menus();
    private ClientController clientController = new ClientController();
    private Client client = new Client();
    private MenusController menusController = new MenusController();

    //interaction Menus
    public void MainMenu(Scanner read){
        int option;

        do {
            System.out.println("WELCOME ON CAR RENTAL\n");
            System.out.println("Select option:\n1- Client\n2- Vehicle Registration\n3- Employee\n0- Exit");
            option = read.nextInt();

            //Option validation
            if(option < 0 || option > 3){
                System.out.println("Invalid option, try again\n\n");
            }
        }while(option < 0 || option > 3);

        //call controller
        menusController.MainMenuController(option, menu);
    }

    //Client Menu
    public void ClientRegistrationMenu(Scanner read){
        int option;
        String id = null;

        do {
            System.out.println("Has an account?\n1- Yes\n2- No");
            option = read.nextInt();

            if(option < 0 || option > 2){
                System.out.println("Invalid option, try again\n\n");
            }
        }while(option < 0 || option > 2);

        if (option == 1){
            System.out.println("Enter Client ID:");
            id = read.nextLine();

            //call repository (search and validation)
            clientController.ClientControllerAccount(option, id);

        }else{
            int select;

            do{
                System.out.println("Want create an account?\n1- Yes\n2- No");
                select = read.nextInt();

                if(select < 1 || select > 2){
                    System.out.println("Invalid option, try again\n\n");
                }
            }while(select < 1 || select > 2);

            if (select == 1){
                //call ClientController
                clientController.ClientControllerAccount(option, id);
            }else{
                System.out.println("Returning main menu...\n\n");
                menu.MainMenu(read);
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
