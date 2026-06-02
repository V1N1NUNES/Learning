package POOExercises.src.Test;

import POOExercises.src.Classes.Teacher;

import java.util.Scanner;

public class TeacherTest {
    public static void main(String[] args) {
        Scanner read =  new Scanner(System.in);

        System.out.println("Text Professor name: \n");
        String name = read.nextLine();
        System.out.println("Text Professor matriculation: \n");
        int matRegister = read.nextInt();
        System.out.println("Text Professor age: \n");
        int age = read.nextInt();

        Teacher professor = new Teacher(name, matRegister,age);
        professor.RegisterInfo();
    }
}
