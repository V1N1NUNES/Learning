package PracticeProjects.HospitalSystem.Models;

import java.time.LocalDateTime;

public class Prescription {
    People people;
    Doctor doctor;
    String prescription;
    LocalDateTime dateTime;

    //constructor
    public Prescription(People people, Doctor doctor, String prescription, LocalDateTime dateTime) {
        this.people = people;
        this.doctor = doctor;
        this.prescription = prescription;
        this.dateTime = dateTime;
    }
}
