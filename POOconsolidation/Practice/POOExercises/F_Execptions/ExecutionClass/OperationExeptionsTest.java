package POOExercises.F_Execptions.ExecutionClass;

import POOExercises.F_Execptions.Models.Operations;

import java.util.Scanner;

public class OperationExeptionsTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("-------------------------");
        System.out.println("Digite agora dois valores:");
        System.out.println("Primeiro valor");
        float value1 = sc.nextFloat();
        System.out.println("Segundo valor");
        float value2 = sc.nextFloat();

        float result = Operations.divisao(value1, value2);
        System.out.println("Resultado da divisão: " + result);

        System.out.println("Digite o valor que deseja sacar:");
        float valorSaque = sc.nextFloat();

        Operations.sacar(valorSaque);


    }
}
