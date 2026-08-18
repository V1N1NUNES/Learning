package PracticeProjects.C_Locadora_de_Jogos.Models.Jogos;

public class Jogo {
    private String nome;
    private String descricao;
    private TipoJogo tipoJogo;
    private float preco;

    public Jogo(String nome,  String descricao, TipoJogo tipoJogo, float preco) {
        this.nome = nome;
        this.descricao = descricao;
        this.tipoJogo = tipoJogo;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public TipoJogo getTipoJogo() {
        return tipoJogo;
    }

    public float getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
}
