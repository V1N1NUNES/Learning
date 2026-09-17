package POOExercises.A_Classes.ExectionClass;

import POOExercises.A_Classes.Students;

import java.util.Scanner;

public class StudentExe {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("<<----------------------------------->>");
        System.out.println("Criação de estudante vazio");
        Students voidStudent = new Students(); //Void student
        System.out.println("<<----------------------------------->>");
        System.out.println("Criação de estudante completo");
        System.out.println("Nome: ");
        String nome = read.nextLine();
        System.out.println("Idade: ");
        int idade = read.nextInt();
        read.nextLine(); //Clean buffer
        System.out.println("id: ");
        String id = read.nextLine();
        System.out.println("Graduação: ");
        String grade = read.nextLine();
        Students students = new Students(nome, idade, id, grade);
        System.out.println("<<----------------------------------->>");
        System.out.println("ESTUDANTES CRIADOS:");
        System.out.println("- Estudante completo:");
        students.showStudent();
        System.out.println("\n- Estudante vazio:");
        voidStudent.showStudent();

    }
}
