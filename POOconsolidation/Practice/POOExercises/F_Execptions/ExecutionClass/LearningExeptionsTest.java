package POOExercises.F_Execptions.ExecutionClass;

import POOExercises.F_Execptions.Models.Gerente;

import java.io.IOException;
import java.sql.SQLException;

public class LearningExeptionsTest {
    public static void main (String[] args) {
        String nomeBancoDeDados = "Vinícius";
        String rg = "98123321";
        String cpf = "09876565-43";
        float salario = 12.480f;
        boolean valido = true;

        Gerente g = new Gerente(nomeBancoDeDados, rg, cpf, salario);

        System.out.println(g.toString());
        String CPFnovo = "09876565-43";

        if(valido){
            try{
                g.salvarFuncionario(valido);
            }catch(IOException | SQLException e){
                if(e.equals(IOException.class)){
                    e.getMessage();
                }else if(e.equals(SQLException.class)){
                    System.out.println("Erro no acesso ao banco de dados: " + e.getMessage());
                }
            }
        }else System.out.println("Ocorreu um erro no processo...");
    }
}
