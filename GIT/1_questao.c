// 1)	Faça um programa que realize o cadastro de contas bancárias com as seguintes informações: número da conta, nome do cliente e saldo. O banco permitirá o cadastramento de apenas 15 contas e não poderá haver mais do que uma conta com o mesmo número. Crie o menu de opções a seguir:

// 1.	Cadastrar contas
// 2.	Visualizar todas as contas de determinado cliente
// 3.	Excluir a conta com menor saldo (supondo a existência de saldos iguais)
// 4.	Sair

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <unistd.h>

// declarações
#define tam 200

typedef struct
{
    int num;
    char nome[tam];
    float saldo;
}conta;
typedef struct
{
    conta contas[15];
}cliente;
cliente cadastro;

int cadastrados = 0;

// PROTÓTIPOS DE FUNÇÕES
void menu();
// void cadastrar_conta();
// void vizualizar_conta();
// void excluir_menor(char *str);

// FUNÇÕES DE LIMPEZA E FLUIDEZ
void pause()
{
    clean_buffer();
    printf("Pressione qualquer tecla para continuar:\n");
    getchar();
}
void clean_buffer()
{
    int clean;
    while ((clean = getchar()) != '\n' && clean != EOF)
        ;
}
void remove_newline(char *str)
{
    int i = 0;
    while (str[i] != '\0')
    {
        if (str[i] == '\n')
        {
            str[i] = '\0';
            break;
        }
        i++;
    }
}

// FUNÇÕES
void menu()
{
    int opcao;

    do
    {
        printf("-- Menu --\n\n");
        printf("Escolha uma das opções abaixo:\n1- Cadastrar conta\n2- Vizualizar contas\n3- Excluir conta com o menor saldo\n4- Sair\n");
        scanf("%d", &opcao);
        clean_buffer();

        if (opcao <= 0 || opcao >= 5)
        {
            printf("Numero digitado inválido!\n");
            pause();
            continue;
        }
        else
        {
            switch (opcao)
            {
            case 1:
                void cadastrar_conta();
                break;

            case 2:
                void vizualizar_conta();
                break;

            case 3:
                // void excluir_menor();
                break;

            case 4:
                printf("Saindo do programa...\n\n");
                sleep(1.2);
                break;
            }
        }
    } while (opcao != 4);

    printf("Até logo! ;)\n");
    sleep(1.2);
    return;
}

void cadastrar_conta()
{
    char resposta[10];
    
    do
    {
        char nome[50];
    
    printf("Digite o nome para a conta:\n");
    clean_buffer();
    fgets(nome, sizeof(nome), stdin);
    remove_newline(nome);

    //verificação de conta existente
    for(int i=0;i<cadastrados;i++)
    {
        if(strcmp(nome, cadastro.contas[i].nome) == 0)
        {
            printf("Conta ja cadastrada!\nVoltando para o Menu...\n\n");
            sleep(1.2);
            menu();
            return;
        }
        else
        {
            strcpy(cadastro.contas[i].nome, nome);

            printf("Digite o numero da conta:\n");
            scanf("%d", &cadastro.contas[i].num);
            clean_buffer();

            printf("Digite o saldo inicial da conta:\n");
            scanf("%f", &cadastro.contas[i].saldo);
            clean_buffer();  
        }
    }
    cadastrados++;

    printf("Conta cadastrada com sucesso!!\nDeseja cadastrar mais alguma conta?\n");
    fgets(resposta, sizeof(resposta), stdin);
    remove_newline(resposta);

    }while(strcmp(resposta, "sim") == 0 || strcmp(resposta, "Sim") == 0);

    printf("Voltando para o menu...\n\n");
    sleep(1.2);

    menu();
    return;    
}

int main()
{
    menu();
    return 0;
}