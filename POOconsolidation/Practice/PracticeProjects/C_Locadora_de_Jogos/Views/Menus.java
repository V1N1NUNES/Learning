package PracticeProjects.C_Locadora_de_Jogos.Views;

import PracticeProjects.C_Locadora_de_Jogos.Controllers.ClienteController;
import PracticeProjects.C_Locadora_de_Jogos.Controllers.JogosController;
import PracticeProjects.C_Locadora_de_Jogos.Models.Clientes.Clientes;

import java.util.Scanner;

public class Menus {
    ClienteController clienteController = new ClienteController();
    JogosController jogosController = new JogosController();

    //ideia de implementação: Adicionar um pré-menu para diferentes acessos (Dono da locadora, clientes, manutenção, etc)

    public void menuPrincipal(Scanner r) {
        int opcao = r.nextInt();

        do {
            System.out.println("---------------------------------");
            System.out.println("🎮 VINIG4M3S 🎮");
            System.out.println("Oque deseja fazer hoje jogador?:");
            System.out.println("1. Cadastrar jogador\n2. Cadastrar novo jogo\n3. Listar jogadores\n4. Lista de jogos\n5. Alugar jogo\n6. Devolver jogo\n7. Listar locações\n8. GameOut");

            //adicionar validação de entrada de entrada

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

    public void menuCliente(Scanner r) {
        int optionMenuCliente;
        do {
            System.out.println("----------------------------");
            System.out.println("MENU CLIENTE");
            System.out.println("1. Cadastrar cliente\n2. Voltar");
            optionMenuCliente = r.nextInt();

            // validação de entrada

            switch (optionMenuCliente) {
                case 1:
                    System.out.println("Digite o nome do cliente: ");
                    String nomeCliente = r.next();
                    System.out.println("Digite o CPF do cliente: ");
                    String cpfCliente = r.next();
                    System.out.println("Digite a idade do cliente: ");
                    int idadeCliente = r.nextInt();

                    //validação de idade do cliente para locação
                    if (clienteController.validacaoIdadeCliente(idadeCliente)) {
                        continue;
                    } else {
                        System.out.println("O cliente não pode ser cadastrado por ser menor de idade");
                        menuCliente(r);
                    }

                    //criação do cliente no sistema
                    if (clienteController.criacaoCliente(nomeCliente, cpfCliente, idadeCliente)) {
                        System.out.println("Cliente criado cadastrado com sucesso!");
                        System.out.println("Voltando ao menu principal\n");
                        this.menuPrincipal(r);
                    } else {
                        System.out.println("Falha ao criar e cadastrar o cliente ao sistema...");
                        this.menuPrincipal(r);
                    }
                    break;
                case 2:
                    System.out.println("Retornando ao menu principal\n");
                    this.menuPrincipal(r);
                    break;
            }
        } while (optionMenuCliente != 2);
    }

    public void menuJogos(Scanner r) {
        int optionMenuJogos;

        do {
            System.out.println("------------------------------");
            System.out.println("MENU DE JOGOS");
            System.out.println("1. Cadastrar jogo\n2. Voltar");
            optionMenuJogos = r.nextInt();

            //adicionar validação de entrada

            switch (optionMenuJogos) {
                case 1:
                    int tipoJogo;

                    System.out.println("Digite o tipo de jogo: 1. Corrida\n2. Mundo aberto\n3. Co-op\n4. Luta\n5. Tiro multiplayer\n6. Voltar");
                    tipoJogo = r.nextInt();

                    if(jogosController.validacaoTipoJogo(tipoJogo)){
                        continue;
                    }else{
                        System.out.println("Opção não encontrada...");
                        System.out.println("Voltando ao menu principal\n");
                        this.menuPrincipal(r);
                    }

                    System.out.println("Digite o nome do jogo: ");
                    String nomeJogo = r.next();
                    System.out.println("Escreva uma breve descrição do jogo: ");
                    String descricaoJogo = r.next();
                    System.out.println("Digite o preço do jogo para alocação: ");
                    float precoJogo = r.nextFloat();

                    if(tipoJogo >= 1 && tipoJogo <= 5){
                        if(jogosController.cadastrarJogo(nomeJogo, descricaoJogo, precoJogo, tipoJogo)){
                            System.out.println("Jogo cadastrado e armazenado com sucesso!");
                        }else{
                            System.out.println("Falha ao cadastrar o jogo...");
                            System.out.println("Voltando ao menu principal\n");
                            this.menuPrincipal(r);
                        }
                    }else{
                        System.out.println("Voltando para o menu principal...");
                        this.menuPrincipal(r);
                    }
                case 2:
                    break;
            }
        }while(optionMenuJogos != 2);
    }

    public void menuAluguel(Scanner r) {
    }
}
