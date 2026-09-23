package ModernJava.F_Execptions.Models;

public enum VagaDisponibilidade {
    DISPONIVEL("Vaga ocupada e indisponível"),
    INDISPONIVEL("Vaga disponível e pronta para uso");

    private final String descricao;
    VagaDisponibilidade(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
