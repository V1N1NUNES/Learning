package ModernJava.H_Generics.test;

import ModernJava.H_Generics.Models.*;

import java.util.Scanner;

public class genericTest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nomeProduto = "Notebok acer pro";
        Float precoProduto = 20000.0f;

        Integer quantidade = 12345;
        StatusAPI estoque = StatusAPI.PRONTO;

        ProductGeneric productGeneric = new ProductGeneric(nomeProduto, precoProduto);
        System.out.println(productGeneric.toString());

        productGeneric.setT(quantidade);
        productGeneric.setP(estoque);

        System.out.println(productGeneric.toString());


//        int resp;
//        Estoque estoque = new Estoque();
//
//        Produto produto = new Produto("Coisa aleatoria", 111111);
//        Produto produto1 = new Produto("Coisa aleatoria2", 111);
//        Produto produto2 = new Produto("Coisa aleatoria3", 11);
//        Produto produto3 = new Produto("Coisa aleatoria4", 2222);
//        Produto produto4 = new Produto("cachorro", 3333);
//        Produto produto5 = new Produto("pesssoa", 111144411);
//        Produto produto6 = new Produto("outra coisa aae", 55);
//        Produto produto7 = new Produto("comida ne", 6666);
//        Produto produto8 = new Produto("bora bora", 111777111);
//
//        estoque.adicionarAoEstoqueAlimenticio(produto1);
//        estoque.adicionarAoEstoqueEletronico(produto);
//        estoque.adicionarAoEstoqueVestuario(produto2);
//        estoque.adicionarAoEstoqueVestuario(produto3);
//        estoque.adicionarAoEstoqueAlimenticio(produto4);
//        estoque.adicionarAoEstoqueEletronico(produto5);
//        estoque.adicionarAoEstoqueAlimenticio(produto6);
//        estoque.adicionarAoEstoqueAlimenticio(produto7);
//        estoque.adicionarAoEstoqueAlimenticio(produto8);
//
//        estoque.mostrarEstoque();

//        RespostaAPI res = new RespostaAPI();
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
//
//        int repostaServidor = 200;
//        String descricaoPedido = "O pedido esta supionpa bb so aproveitar";
//
//        res = new RespostaAPI(repostaServidor, descricaoPedido);
//
//        System.out.println(res.getDadosPedido());
//        System.out.println(res.getStatusAPI());
    }
}
