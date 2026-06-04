package PracticeProjects.HospitalSystem.Models;

import PracticeProjects.HospitalSystem.Models.Prescription;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Doctor extends People{
    private int Crm;
    private String Speciality;

    public Doctor(String name, int age, String CPF, String cellphone, int Crm,  String Speciality) {
        super(name, age, CPF, cellphone);
        this.Crm = Crm;
    }

    //methods
    @Override
    public People getPeople() {
        return this;
    }

    //methods for doctors
    public Prescription generatePrescription(People people,  Doctor doctor, Scanner read) {

        //add date validation

        System.out.println("Description: ");
        String prescription = read.next();

        System.out.println("Enter with consult date local time: \n");
        System.out.printf("Year: \n");
        int year = read.nextInt();
        System.out.printf("Month: \n");
        int month = read.nextInt();
        System.out.printf("Day: \n");
        int day = read.nextInt();
        System.out.printf("Hour(24h format): \n");
        int hour = read.nextInt();
        System.out.printf("Minute(24h format): \n");
        int minute = read.nextInt();

        LocalDateTime dateConsult = LocalDateTime.of(year, month, day, hour, minute);

        return new Prescription(people, doctor, prescription, dateConsult);
    }
}
