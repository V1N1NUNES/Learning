package POOExercises.F_Execptions.ExecutionClass;

import POOExercises.F_Execptions.Models.CadastrarProduto;
import POOExercises.F_Execptions.Models.Produto;

public class ProdutoTestExpetion {
    public static void main(String[] args) {

        Produto produto = new Produto();
        try {
            System.out.println("Produto cadastrado? " + CadastrarProduto.cadastrarProduto(produto));
        } catch (Exception e) {
            System.out.println("Erro ao cadastrar produto" + e.getMessage());
        }

        Produto produtoTest = null;
            System.out.println("Produto cadastrado? " + CadastrarProduto.cadastrarProduto(produtoTest));
    }
}
