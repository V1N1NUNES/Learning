package POOExercises.F_Execptions.Models;

import javax.xml.crypto.Data;

public class Produto {
    private String nome;
    private double preco;
    private String dataValidade;

    public Produto(String nome, double preco, String dataValidade) {
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
    }
    public Produto() {}

    @Override
    public String toString() {
        return "\nNome='" + nome + '\'' +
                ", \npreco=" + preco +
                ", \ndataValidade='" + dataValidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getDataValidade() {
        return dataValidade;
    }
}
