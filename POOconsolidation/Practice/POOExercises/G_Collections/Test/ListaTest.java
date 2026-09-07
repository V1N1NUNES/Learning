package POOExercises.G_Collections.Test;

import POOExercises.F_Execptions.Models.Produto;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListaTest {
    public static void main(String[] args) {
//        String produto1 = "Desodorante";
//        String produto2 = "Celular";
//        String produto3 = "Televisão";
//        String produto4 = "Carro";
//        String produto5 = "Picanha";
//        String produto6 = "Desodorante";
//
//        List<String> ListaDeCompras = new ArrayList<>();
//        ListaDeCompras.add(produto1);
//        ListaDeCompras.add(produto2);
//        ListaDeCompras.add(produto3);
//        ListaDeCompras.add(produto4);
//        ListaDeCompras.add(produto5);
//        ListaDeCompras.add(produto6);
//
//        System.out.println(ListaDeCompras.toString());
//        System.out.println(ListaDeCompras.reversed().toString());
//        int result = ListaDeCompras.size();
//        System.out.println(result);
//        System.out.println(ListaDeCompras.hashCode());
//        System.out.println(ListaDeCompras);

        /***
         * list caracterísiticas:
         * - Mantém a ordem de inserção
         * - Permite duplicatas
         * - Acesso aos dados por índice
         * - Principais implementações: ArrayList e linkedList
         */
        double cpf1 = 03534534323d;
        double cpf2 = 12312312312d;
        double cpf3 = 34567834512d;
        double cpf4 = 80000002323d;
        double cpf5 = 03534534323d;

        Set<Double> CPFs = new HashSet<>();
        CPFs.add(cpf1);
        CPFs.add(cpf2);
        CPFs.add(cpf3);
        CPFs.add(cpf4);
        CPFs.add(cpf5);

        /***
         * Set caracterísiticas:
         * - Não garante a ordem de inserção
         * - Não ermite duplicatas
         * - Sem acesso aos dados por índices
         * - Principais implementações: HashSet, TreeSet, LinkedHashSet
         */

          /***
         * Map caracterísiticas:
         * - Por chave / valor
         * - Chaves únicas, valores repetidos
         * - Acesso aos dados Pela chave
         * - Principais implementações: HashMap, TreeMap, LinkedHashMap
         */


        /***
         * Queue caracterísiticas:
         * - Ordem de processamento (FIFO / Prioridade)
         * - Permite duplicatas
         * - Acesso aos dados pelas extremidades (Início/Fim)
         * - Principais implementações: PriorityQueue, ArrayDeque
         */
    }
}
