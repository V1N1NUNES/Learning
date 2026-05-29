package POOExercises.src.Test;

import POOExercises.src.Classes.Estudant;

import java.util.Scanner;

public class EstudantTest {
    public static void main(String... args){
        Scanner read = new Scanner(System.in);
        float[] results = new  float[3];

        System.out.println("Estudant name: ");
        String name = read.nextLine();
        System.out.println("Estudant age: ");
        int age = read.nextInt();

        for (int i =0; i < results.length; i++){
            System.out.println("Text the " + (i+1) + " result Test: \n");
            results[i] = read.nextFloat();
        }

        Estudant people = new Estudant(name, age, results);

        people.getEstudantResult(people);
    }
}
