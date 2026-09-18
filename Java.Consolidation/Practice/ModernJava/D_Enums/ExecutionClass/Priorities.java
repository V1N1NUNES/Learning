package ModernJava.D_Enums.ExecutionClass;

import java.util.Scanner;

public class Priorities {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ModernJava.D_Enums.ModelClass.Priorities priorities;

        System.out.println("digite sua ordem de prioridade:\n1- Suave\n2- Tranquilo\n3Pode ver rápido por favor?\n4- EU PRECISO QUE VEJA NESSE EXATO MOMENTO!");
        int option = sc.nextInt();

        if(option > 4 || option < 1){
            System.out.println("Bom... parece que você digitou algo errado ai amigão, tente de novo na próxima ;)");
            return;
        }

        priorities = ModernJava.D_Enums.ModelClass.Priorities.concatenacaoDePrioridade(option);
        System.out.println("Bom parece que sua prioridade é: " + priorities.toString() + "\n" + priorities.getDescription());

    }
}
