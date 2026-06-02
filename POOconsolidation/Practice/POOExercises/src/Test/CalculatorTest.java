package POOExercises.src.Test;

import java.util.Scanner;
import POOExercises.src.Classes.Calculator;
public class CalculatorTest {

    public static void main(String[] args) {
        Scanner read =  new Scanner(System.in);
        int a;
        int b;
        Calculator calc = new Calculator();

        System.out.println("Text a number for 'A': \n");
        a = read.nextInt();
        System.out.println("Text b number for 'B': \n");
        b = read.nextInt();

        System.out.println("Results:\nadd:" + calc.sum(a,b) + "\nsub: " + calc.sub(a,b) +  "\nmult: " + calc.mult(a,b) + "\ndiv: " +  calc.div(a,b));
    }
}
