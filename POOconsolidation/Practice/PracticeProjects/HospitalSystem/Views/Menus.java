package PracticeProjects.HospitalSystem.Views;

import PracticeProjects.HospitalSystem.Models.Doctor;

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
        int option;

        do{
            System.out.println("Sing in or create a new register?: \n1- Sing In\n2- Register new\n");
            option = read.nextInt();

            if(option == 1){
                System.out.println("Please enter your CRM:\n");
                int crm = read.nextInt();

                //search in database
            }
            else if(option == 2){
                System.out.println("Please enter your name:\n");
                String name = read.next();
                System.out.println("Please enter your Doctor speciality: \n");
                String speciality = read.nextLine();
                System.out.println("Please enter your CRM:\n");
                int crm = read.nextInt();
                System.out.println("Please enter your CPF:\n");
                String CPF = read.next();
                System.out.println("Please enter your cellphone:\n");
                String cellphone = read.next();
                System.out.println("Please enter your age:\n");
                int age = read.nextInt();

                Doctor doctor = new Doctor(name, age, CPF, cellphone, crm, speciality);
            }
        }while(option > 2 || option < 1);
    }
}
