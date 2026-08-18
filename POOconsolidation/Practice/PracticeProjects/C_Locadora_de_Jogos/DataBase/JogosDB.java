package PracticeProjects.C_Locadora_de_Jogos.DataBase;

import PracticeProjects.C_Locadora_de_Jogos.Models.Jogos.Jogo;

public class JogosDB {
    private static final Jogo jogosCorrida[] = new Jogo[100];
    private static final Jogo jogosMundoAberto[] = new Jogo[100];
    private static final Jogo jogosCO_OP[] = new Jogo[100];
    private static final Jogo jogosLuta[] = new Jogo[100];
    private static final Jogo jogosTiroMultiPLayer[] = new Jogo[100];

    public boolean armazenarJogo(Jogo jogo){
        //adicionar o jogo ao array adequado para seu tipo

        return true;
    }
}
