package PracticeProjects.CarRental.Controllers;

import PracticeProjects.CarRental.Views.Menus;

import java.util.Scanner;

public class MenusController {
    //reference variables for workflow
    Scanner read;

    public void MainMenuController(int option, Menus menu) {

        switch(option){
            case 1: //call client Menu
                menu.ClientRegistrationMenu(read);
                break;
            case 2: //call Vehicle Menu
                menu.VehicleRegistrationMenu(read);
                break;
            case 3: // call employee menu
                menu.EmployeeRegistrationMenu(read);
                break;
            case 4: //exit program
                System.out.println("EXIT PROGRAM, See you later!");
                read.close();

                System.exit(0);
                break;
        }
    }
}
