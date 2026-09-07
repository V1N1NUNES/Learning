package PracticeProjects.B_Locadora_de_Jogos.Controllers;

import PracticeProjects.B_Locadora_de_Jogos.DataBase.JogosDB;
import PracticeProjects.B_Locadora_de_Jogos.Models.Jogos.Jogo;
import PracticeProjects.B_Locadora_de_Jogos.Models.Jogos.TipoJogo;
import PracticeProjects.B_Locadora_de_Jogos.Services.ServicesJogos;

public class JogosController {
    private JogosDB jogosDB =  new JogosDB();
    private ServicesJogos servicesJogos = new ServicesJogos();

    public boolean cadastrarJogo(String nome, String descricao,float preco,  int opcaoJogo){
        boolean result = true;

        switch (opcaoJogo){
            case 1:
                Jogo jogoCorrida = new Jogo(nome, descricao, TipoJogo.CORRIDA,  preco);
                this.armazenarJogo(jogoCorrida);

                if(this.armazenarJogo(jogoCorrida)){
                    result = true;
                }else{
                    result = false;
                }
                break;
            case 2:
                Jogo jogoMundoAberto = new Jogo(nome, descricao, TipoJogo.MUNDO_ABERTO,  preco);
                this.armazenarJogo(jogoMundoAberto);

                if(this.armazenarJogo(jogoMundoAberto)){
                    result = true;
                }else{
                    result = false;
                }
                break;
            case 3:
                Jogo jogoCo_op = new Jogo(nome, descricao, TipoJogo.CO_OP,  preco);
                this.armazenarJogo(jogoCo_op);

                if(this.armazenarJogo(jogoCo_op)){
                    result = true;
                }else{
                    result = false;
                }
                break;
            case 4:
                Jogo jogoLuta = new Jogo(nome, descricao, TipoJogo.LUTA,  preco);
                this.armazenarJogo(jogoLuta);

                if(this.armazenarJogo(jogoLuta)){
                    result = true;
                }else{
                    result = false;
                }
                break;
            case 5:
                Jogo jogoTiroMultiPlayer = new Jogo(nome, descricao, TipoJogo.TIRO_MULTiPLAYER,  preco);
                this.armazenarJogo(jogoTiroMultiPlayer);

                if(this.armazenarJogo(jogoTiroMultiPlayer)){
                    result = true;
                }else{
                    result = false;
                }
                break;
        }
        return result;
    }

    private boolean armazenarJogo(Jogo jogo){
        return jogosDB.armazenarJogo(jogo);
    }

    public boolean validacaoTipoJogo(int TipoJogo){
        return servicesJogos.validacaoJogo(TipoJogo);
    }
}
