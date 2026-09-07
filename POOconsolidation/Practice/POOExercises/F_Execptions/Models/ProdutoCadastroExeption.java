package POOExercises.F_Execptions.Models;

public class ProdutoCadastroExeption extends RuntimeException {
    public ProdutoCadastroExeption() {
        super("O produto não foi cadastrado pois não não aponta para nenhum objeto: ProdutoCadastroExeption");
    }
}
