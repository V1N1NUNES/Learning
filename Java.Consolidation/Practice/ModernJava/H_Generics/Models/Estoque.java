package ModernJava.H_Generics.Models;

import java.util.ArrayList;
import java.util.List;

public class Estoque <Eletronicos, Comida, Roupas>{

    private final List<Comida> comidas = new ArrayList<>();
    private final List<Roupas> roupas =  new ArrayList<>();
    private final List<Eletronicos> eletronicos =  new ArrayList<>();

    public void adicionarAoEstoqueEletronico(Eletronicos produto){
        eletronicos.add(produto);
        System.out.println("Produto adicionado com sucesso");
    }
    public void adicionarAoEstoqueAlimenticio(Comida produto){
        comidas.add(produto);
        System.out.println("Produto adicionado com sucesso");
    }
    public void adicionarAoEstoqueVestuario(Roupas produto){
        roupas.add(produto);
        System.out.println("Produto adicionado com sucesso");
    }

    public void mostrarEstoque(){
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("                       MOSTRANDO ESTOQUE COMPLETO                             ");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Produtos roupisticos");
        for (Roupas roupa : roupas){
            System.out.println(roupa.toString());
        }

        System.out.println("-------------------");
        System.out.println("Produtos comelisticos");
        for (Comida roupa : comidas){
            System.out.println(roupa.toString());
        }

        System.out.println("-------------------");
        System.out.println("Produtos eletronicos que dão choquinho se colocar o dedo pae");
        for (Eletronicos roupa : eletronicos){
            System.out.println(roupa.toString());
        }
    }

}
