package POOExercises.B_Methods.ExecutionClass;

import POOExercises.B_Methods.Floatation;

import java.util.Scanner;

public class FloatationExe {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Floatation f = new Floatation();

        System.out.println("Calculo do financiamento:");
        System.out.println("Digite o valor a ser calculado:");
        f.setValue(read.nextFloat());
        System.out.println("Digite a quantidade de meses:");
        f.setMonths(read.nextInt());
        f.financingCalculator(f.getValue(),f.getMonths());
    }
}
