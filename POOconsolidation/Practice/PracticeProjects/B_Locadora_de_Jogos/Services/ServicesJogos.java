package PracticeProjects.B_Locadora_de_Jogos.Services;

public class ServicesJogos {
    public boolean validacaoJogo(int tipo){
        return tipo >= 1 && tipo <= 5;
    }
}
