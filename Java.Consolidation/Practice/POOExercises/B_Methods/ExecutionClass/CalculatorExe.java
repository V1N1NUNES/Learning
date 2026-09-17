package POOExercises.B_Methods.ExecutionClass;

import POOExercises.B_Methods.Calculator;

import java.util.Scanner;

public class CalculatorExe {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("CALCULATOR BABY!!!!!!\n");
        System.out.println("Digite o valor primeiro a ser calculado:");
        float a = read.nextFloat();
        System.out.println("Digite o valor segundo a ser calculado:");
        float b = read.nextFloat();
        System.out.println("Resultados:\nSoma = " + Calculator.summationTwoNumbers(a, b) + "\nSubstração = " +  Calculator.subtractionTwoNumbers(b, a) + "\nMultiplicação = " + Calculator.multiplicationTwoNumbers(a, b) + "\nDivisão = " + Calculator.divisionTwoNumbers(a, b));
    }
}
