package PracticeProjects.Hospital.MVCVersion.Views;

import java.util.Scanner;

public abstract class Menus {

    //view methods menu
    public static void MainMenu(Scanner read){
        int option;

        do{
            System.out.println("Welcome to Hospital System!\n\n");
            System.out.println("Chose option: \n1- Patient\n2- Doctor\n3- Exit\n");
            option = read.nextInt();

            //validation for option in Service

            switch(option){
                case 1:
                    PatientMenu(read);
                    break;

                case 2:
                    DoctorMenu(read);
                    break;

                case 3:
                    System.out.println("Thank you for using Hospital System!");
                    System.exit(0);
                    break;
            }
        }while(option > 3 || option < 1);

    }

    private static void PatientMenu(Scanner read){

        System.out.println("Please enter your Patient name: \n");
        String name = read.nextLine();
        System.out.println("Please enter your Patient age: \n");
        int age = read.nextInt();

        //validation for doctor forwarding in controller

        System.out.println("Please enter your Patient association: \n");
        String association = read.next();

        //validation for association in Service

        System.out.println("Please enter your Patient description: \n");
        String description = read.next();
    }

    private static void DoctorMenu(Scanner read){

        System.out.println("Please enter your Doctor name: \n");
        String name = read.nextLine();
        System.out.println("What's your Doctor speciality?: \n");
        String speciality = read.nextLine();
        System.out.println("Adult or pediatric patients?: \n1- Adult\n2- Child\n");
        int option = read.nextInt();

        //verification for option

    }
}
