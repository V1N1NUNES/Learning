package PracticeProjects.Hospital.MVCVersion.Models;

public abstract class People{
    private String name;
    private int age;
    private String CPF;
    private String cellphone;

    public People(String name, int age, String CPF, String cellphone) {
        this.name = name;
        this.age = age;
        this.CPF = CPF;
        this.cellphone = cellphone;
    }

    public People getPeople(){
        return this;
    }
}
