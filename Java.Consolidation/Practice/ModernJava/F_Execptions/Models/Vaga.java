package ModernJava.F_Execptions.Models;

public class Vaga {
    private VagaDisponibilidade vaga;

    public Vaga(VagaDisponibilidade vaga) {
        this.vaga = vaga;
    }

    public String getVagaStatus() {
        return vaga.getDescricao();
    }
}
