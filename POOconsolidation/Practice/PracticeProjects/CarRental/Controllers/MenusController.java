package PracticeProjects.CarRental.Controllers;

import PracticeProjects.CarRental.Views.Menus;

import java.util.Scanner;

public class MenusController {
    //reference variables for workflow
    Menus menu;
    Scanner read;

    public void MainMenuController(int option){

        switch(option){
            case 1: //call client Menu
                menu.ClientRegistrationMenu(read);
                break;

            case 2: //call Vehicle Menu
            case 3: // call employee menu
            case 4: //exit program
        }
    }
}
