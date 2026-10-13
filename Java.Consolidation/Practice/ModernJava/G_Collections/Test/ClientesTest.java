package ModernJava.G_Collections.Test;

import ModernJava.G_Collections.Model.Cliente;

import java.util.*;

public class ClientesTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Cliente> clientes = new ArrayList<>();

        Cliente c1 = new Cliente("Vinícius", "12312312312", "viniciusdealgumacoisa@gmail.com", "61-12121212-12", 20);
        Cliente c2 = new Cliente("Ana Clara", "123123133333", "anaclaradealgumacoisa@gmail.com", "61-1555551212-12", 15);
        Cliente c3 = new Cliente("Vinícius", "12312312312", "viniciusdealgumacoisa@gmail.com", "61-12121212-12", 22);
        Cliente c4 = new Cliente("Arthur Verbas", "34534534534", "ArthurVerbasdealgumacoisa@gmail.com", "61-090909090-12", 55);

        clientes.add(c1);
        clientes.add(c2);
        clientes.add(c3);
        clientes.add(c4);

        System.out.println("-------------------------------------");
        System.out.println("Clientes adicionados com sucesso baby");
        System.out.println("-------------------------------------");

        System.out.println("-------------------------------------");
        System.out.println("Mostrando os clientes");
        clientes.forEach(System.out::println);
        System.out.println("-------------------------------------");

//        System.out.println("-------------------------------------");
//        System.out.println("hash code? ");
//        int result = clientes.hashCode();
//        System.out.println(result);
//        System.out.println("\nhas code de cada?");
//        clientes.forEach(cliente -> System.out.println(cliente.hashCode() + "\n" + cliente.toString()));
//        System.out.println("-------------------------------------");

        System.out.println("-------------------------------------");
        System.out.println("Organizando os elementos");
        clientes.sort(Comparator.comparingInt(Cliente::getIdade));
        clientes.forEach(System.out::println);


        System.out.println("-------------------------------------");
        System.out.println("sei la ");
        System.out.println(clientes.size());
        System.out.println("-------------------------------------");

        List<String> palavrinhas = new ArrayList<>();
        palavrinhas.add("Palavrinhas");
        palavrinhas.add("Mão de brinquedo no negócios");
        palavrinhas.add("Carrinho de controle não remoto");

        Iterator<String> iterator = palavrinhas.iterator();

        

    }
}
