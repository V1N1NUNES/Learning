package ModernJava.H_Generics.test;

import ModernJava.H_Generics.Models.RespostaAPI;
import ModernJava.H_Generics.Models.generic;

import java.util.Scanner;

public class genericTest extends generic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int resp;
        RespostaAPI res = new RespostaAPI();
//        generic test = new generic();
//
//        System.out.println("Digite alguma coisa");
//        float num1 = sc.nextInt();
//        System.out.println("Digite outra alguma coisa");
//        float num2 = sc.nextInt();
//
//        System.out.println("resultado da operação" + test.multiplicar(num1,num2));
//        sc.nextLine();
//
//        System.out.println("Digite mais uma alguma coisa");
//        String alguma = sc.nextLine();
//        System.out.println("Digite mais outra alguma coisa");
//        String coisa = sc.nextLine();
//
//        System.out.println("resultado da operação" + test.multiplicar(num1,num2));
//        do {
//            System.out.println("---------------------------------");
//            System.out.println("Digita uma frase ai boy");
//            String frase = sc.nextLine();
//
//            System.out.println("Digite um numero ae pae (ex: 15.5): ");
//
//            float valor = Float.parseFloat(sc.nextLine().replace(",", "."));
//
//            System.out.println("Digite agora um numerozinho kkk:");
//
//            int numerozinho = Integer.parseInt(sc.nextLine());
//
//            System.out.println("Guardando nos bagui");
//            test.guardaCoisas(valor);
//            test.guardaCoisas(numerozinho);
//            test.guardaCoisas(frase);
//
//            System.out.println("Quer guardar mais coisa pae no deposito?1- si\n2- dont");
//            resp = sc.nextInt();
//
//        } while (resp != 2);

        int repostaServidor = 200;
        String descricaoPedido = "O pedido esta supionpa bb so aproveitar";

        res = new RespostaAPI(repostaServidor, descricaoPedido);

        System.out.println(res.getDadosPedido());
        System.out.println(res.getStatusAPI());
    }
}
