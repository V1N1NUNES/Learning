package POOExercises.src.Classes;

public class Teacher {
    String name;
    int mat;
    int age;

    //Constructor
    public Teacher(String name, int mat, int age) {
        this.name = name;
        this.mat = mat;
        this.age = age;
    }


    public void RegisterInfo(){
        System.out.println("Name Professor: "+ this.name);
        System.out.println("Mat number:  " + this.mat);
        System.out.println("Age: " + this.age);
    }


}
