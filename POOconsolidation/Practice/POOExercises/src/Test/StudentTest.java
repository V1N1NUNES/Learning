package POOExercises.src.Test;

import POOExercises.src.Classes.Student;

import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Enter Studant Name: ");
        String name = read.nextLine();
        System.out.println("Enter Studant Age: ");
        int age = read.nextInt();

        float[] StudantNotes = new float[3];
        for(int i =0 ; i < 3; i++){
            System.out.println("Enter with the " + (i+1) + " note:");
            StudantNotes[i] = read.nextFloat();
        }

        Student student = new Student(name, age, StudantNotes);
        student.getStudent();
        student.studentAverage();
    }
}
