#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <string.h>

// variavei globais
#define tam 150
typedef struct {
    char nome[tam];
    char sexo[12];
    int idade;
} pessoa;
int quant = 0;
pessoa pessoas[tam];

//declarações
void cadastrar_pessoa();
void mostrar_lista();
void salvar_arquivo();
void limpar_buffer();
void Menu();
void salvar_arquivo();
void ler_arquivo();

// funções
void ler_arquivo(){
    FILE *arquivo= fopen("cadastro.txt", "r");
    pessoa clone[tam];
    if(arquivo == NULL){
        printf("ERRO: Não foi possivel abrir o arquivo.\n");
        return 1;
    }
    else{
        fscanf(arquivo, "%d\n", &quant);
        for(int i=0;i<quant;i++){   
        fgets(clone[i].nome, tam, arquivo);
        fscanf(arquivo, "%s\n", &clone[i].sexo);
        fscanf(arquivo, "%d\n\n", &clone[i].idade);
        }
    }fclose(arquivo);
    printf("Leitura de arquivo bem sucedida!\n");
    sleep(1);
    Menu();
    return;
}
void salvar_arquivo(){
    FILE *arquivo = fopen("cadastro.txt", "w");
    if(arquivo == NULL){
        printf("ERRO: Não foi possivel abrir o arquivo\n");
        return 1;
    }
    else{
        fprintf(arquivo, "%d\n",quant);
        for(int i=0;i<quant;i++){
            fprintf(arquivo, "%s", pessoas[i].nome);
            fprintf(arquivo, "%s\n", pessoas[i].sexo);
            fprintf(arquivo, "%d\n\n", pessoas[i].idade);
        }
        fclose(arquivo);
    }
    printf("Arquivo salvo com sucesso!\n");
    sleep(1);
    Menu();
    return;
}
void limpar_buffer() { //(ok)
    int x;
    while ((x = getchar()) != '\n' && x != EOF);
}

void cadastrar_pessoa() {
    char resp[8];
    do {
        limpar_buffer();
        printf("Digite seu nome: ");
        fgets(pessoas[quant].nome, sizeof(pessoas[quant].nome), stdin);
        printf("Digite seu sexo (Masculino ou Feminino): ");
        scanf("%s", pessoas[quant].sexo);
        printf("Digite sua idade: ");
        scanf("%d", &pessoas[quant].idade);
        quant++;
        printf("Deseja cadastrar mais uma pessoa no sistema? (sim/nao)\n");
        scanf("%s", resp);
        if (strcmp(resp, "nao") == 0 || strcmp(resp, "nao") == 0) {
            Menu();
            return;
        }
    } while (strcmp(resp, "sim") == 0);
}

void mostrar_lista() {
    char resp[8];
    printf("Lista de cadastros do sistema:\n\n");

    for (int i = 0; i < quant; i++) {
        printf("%s", pessoas[i].nome);
        printf("%s\n", pessoas[i].sexo);
        printf("%d\n\n", pessoas[i].idade);
        sleep(0.5);
    }
    printf("Deseja fazer mais alguma alteração? (sim/nao): ");
    scanf("%s", resp);
    if (strcmp(resp, "sim") == 0 || strcmp(resp, "sim") == 0) {
        Menu();
        return;
    } else if (strcmp(resp, "nao") == 0 || strcmp(resp, "nao") == 0) {
        printf("Até logo ;)\n\n");
        sleep(1);
        exit(1);
    }
}

void Menu() {
    int opcao;

    do {
        printf("\tMenu\n\n");
        printf("Escolha uma opção:\n");
        printf("1) cadastrar pessoa\n2) mostrar cadastros\n3)Salvar em arquivo\n4)Ler do arquivo\n5) sair\n");
        scanf("%d", &opcao);
        if (opcao <= 0 || opcao >= 6) {
            printf("Número digitado inválido.\n\n");
        }
    } while (opcao <= 0 || opcao >= 6);

    switch (opcao) {
        case 1:
            cadastrar_pessoa();
            break;
        case 2:
            mostrar_lista();
            break;
        case 3:
            salvar_arquivo();
            break;
        case 4:
            ler_arquivo();
            break;
        case 5:
            printf("\nAté logo ;)\n\n");
            sleep(1);
            return 0;
    }
}

int main() {
    Menu();
    return 0;
}
