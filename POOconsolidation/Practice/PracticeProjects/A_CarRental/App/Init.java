package PracticeProjects.A_CarRental.App;

import PracticeProjects.A_CarRental.Views.Menus;

import java.util.Scanner;


public class Init {
    public static void main(String[] Arg){
        final Scanner read = new Scanner(System.in);
        Menus menu = new Menus();

        //program initializer
        menu.MainMenu(read);
    }
}
