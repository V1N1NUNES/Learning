package PracticeProjects.Hospital.MVCVersion.Models;

public class Patient extends People{

    private String association;
    private String description;


    public Patient(String name, int age, String CPF, String cellphone, String association, String description) {
        super(name, age, CPF, cellphone);
        this.association = association;
        this.description = description;
    }

    //methods for patients

}
