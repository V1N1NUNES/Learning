package PracticeProjects.B_Locadora_de_Jogos.Models.Clientes;

import java.util.UUID;

public class Clientes {
    private String nome;
    private String cpf;
    private int idade;
    private String id;


    public Clientes(String nome, String cpf, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.id = UUID.randomUUID().toString();
    }

    //getters and setters
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public int getIdade() {
        return idade;
    }

    public String getId() {
        return id;
    }

    //other methods

}
