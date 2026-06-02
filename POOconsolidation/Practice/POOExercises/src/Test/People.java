package POOExercises.src.Test;

import java.util.Scanner;

public class People {
    public static void main (String[] args){
        Scanner read = new  Scanner(System.in);
        POOExercises.src.Classes.People people = new POOExercises.src.Classes.People();

        System.out.println("text your Name: \n");
        people.name = read.next();
        System.out.println("text your age: \n");
        people.age = read.nextInt();
        System.out.println("text your height: \n");
        people.height = read.nextInt();

        System.out.println("The people "+ people.name + " height " + people.height + "Kg and age " + people.age +"\n");
    }
}
