package POOExercises.F_Execptions.Models;

import java.io.IOException;
import java.sql.SQLException;

public abstract class Funcionario {
    private String name;
    private String rg;
    private String cpf;

    public Funcionario(String name, String rg, String cpf) {
        this.name = name;
        this.rg = rg;
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public String getRg() {
        return rg;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        return "\nFuncionario: " + this.name + "\nRG: " + this.rg + "\nCPF: " + this.cpf;
    }

    public void salvarFuncionario(boolean valido) throws IOException, SQLException{
        if(valido){
                throw new IOException("Erro ao salvar Funcionario");
        }
        else if(!valido){
            throw new SQLException("Erro ao acessar o banco de dados");
        }
    }
}
