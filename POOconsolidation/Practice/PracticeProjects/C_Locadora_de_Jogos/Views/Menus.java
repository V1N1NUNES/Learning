package PracticeProjects.C_Locadora_de_Jogos.Views;

import java.util.Scanner;

public class Menus {

    //ideia de implementação: Adicionar um pré-menu para diferentes acessos (Dono da locadora, clientes, manutenção, etc)

    public void menuPrincipal(Scanner r) {
        int opcao = r.nextInt();

        do {
            System.out.println("---------------------------------");
            System.out.println("🎮 VINIG4M3S 🎮");
            System.out.println("Oque deseja fazer hoje jogador?:");
            System.out.println("1. Cadastrar jogador\n2. Cadastrar novo jogo\n3. Listar jogadores\n4. Lista de jogos\n5. Alugar jogo\n6. Devolver jogo\n7. Listar locações\n8. GameOut");

            //adicionar verificação de entrada

            switch (opcao) {
                case 1:
                    //chamar o menu de clientes
                    break;
                case 2:
                    //chamar menu de jogos
                    break;
                case 3:
                    //chamar controller para chamar database e mostrar a lista de clientes
                    break;
                case 4:
                    //chamar controller para chamar Database e mostrar a lista de jogos cadastrados
                    break;
                case 5:
                    //chamar menu de aluguel
                    break;
                case 6:
                    //chamar menu de aluguel
                    break;
                case 7:
                    //chamar controller para chamar database e mostrar locações
                    break;
                case 8:
                    System.out.println("Aposto que alguma hora achará oque precisa para distrair. Até a próxima 😎");
                    break;
            }
        } while (opcao != 8);
    }

    public void menuCliente(Scanner r) {}

    public void menuJogos(Scanner r) {}

    public void menuAluguel(Scanner r) {}
}
