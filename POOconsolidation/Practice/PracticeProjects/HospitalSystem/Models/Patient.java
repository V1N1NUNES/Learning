package PracticeProjects.HospitalSystem.Models;

public class Patient extends People{

    private String association;


    public Patient(String name, int age, String CPF, String cellphone, String association) {
        super(name, age, CPF, cellphone);
        this.association = association;
    }

    //methods
    @Override
    public People getPeople() {
        return this;
    }

    //patient methods
    public Consults markConsult(Patient patient, Doctor doctor) {
        System.out.println("");

        //chose Speciality from consult

        return new Consults(patient, doctor);
    }
}
