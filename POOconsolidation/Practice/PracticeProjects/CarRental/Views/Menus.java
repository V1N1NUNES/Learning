package PracticeProjects.CarRental.Views;

import PracticeProjects.CarRental.Controllers.ClientController;

import java.util.Scanner;

public class Menus {
    private Menus menu;
    private ClientController clientController;

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

    }

    //Client Menus
    public void ClientRegistrationMenu(Scanner read){
        int option;

        do {
            System.out.println("Has an account?\n1- Yes\n2- No");
            option = read.nextInt();

            if(option < 0 || option > 2){
                System.out.println("Invalid option, try again\n\n");
            }
        }while(option < 0 || option > 2);
    }

    //Employee Menus
}
