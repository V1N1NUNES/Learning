package PracticeProjects.Hospital.MVCVersion.Models;

public class Doctor extends People{
    private int Crm;
    String Speciality;

    public Doctor(String name, int age, String CPF, String cellphone, int Crm,  String Speciality) {
        super(name, age, CPF, cellphone);
        this.Crm = Crm;
    }

    //methods for doctors

}
