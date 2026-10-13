package ModernJava.G_Collections.equals_e_hashcode.test;

import ModernJava.G_Collections.equals_e_hashcode.Carro.Carro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class test {
    public static void main(String[] args) {

        Carro carro = new Carro("3ZIHu123X", "Yaris", "Branco gelo", "Toyota");
        Carro carro2 = new Carro("zZIHu123X", "Yaris sedã", "Branco gelo", "Toyota");
        Carro carro3 = new Carro("aZIHu123Xas", "Corolla", "Branco grelhado", "Toyota");
        Carro carro4 = new Carro("BZIHu123Xas", "Civic", "Preto meia-noite", "Honda");
        Carro carro5 = new Carro("2ZIHu123Xas", "Ranger", "Azul royal ", "Ford");

        List<Carro> concessionaria = new ArrayList<>();

        concessionaria.add(carro);
        concessionaria.add(carro2);
        concessionaria.add(carro3);
        concessionaria.add(carro4);
        concessionaria.add(carro5);

        System.out.println("\nANTES DA ORDENAÇÃO\n" + concessionaria);

        Collections.sort(concessionaria);
//        for(Carro c : concessionaria){
//            System.out.println(c);
//        }

        System.out.println("\nDEPOIS DA ORDENAÇÃO\n" + concessionaria);


    }
}
