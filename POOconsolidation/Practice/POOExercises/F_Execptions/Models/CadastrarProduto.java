package POOExercises.F_Execptions.Models;

public abstract class CadastrarProduto {

    public static boolean cadastrarProduto(Produto produto) throws ProdutoCadastroExeption {
        if(produto == null){
            throw  new ProdutoCadastroExeption();
        }
        else {
            System.out.println("Produto cadastrado com sucesso!: " + produto.toString());
            return true;
        }
    }
}
