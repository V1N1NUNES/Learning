#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>

#define tam 200

int main(){

    FILE *arquivo;
    int cpf;
    char nome[tam];
    char email[tam];
    char senha[tam];

    arquivo= fopen("armazenamento.txt", "w");
    if(arquivo == NULL){
        printf("erro na abertura do arquivo\n");
        return 1;
    }
    printf("DIgite o seu CPF:\n");
    scanf("%d", &cpf);
    while(getchar() != '\n');

    printf("Digite seu Nome completo:\n");
    fgets(nome, tam,stdin);
    nome[strcspn(nome, "\n")]= '\0';

    printf("Digite seu email:\n");
    fgets(email, tam, stdin);
    email[strcspn(email, "\n")]= '\0';

    printf("Digite sua senha:\n");
    fgets(senha, tam,stdin);
    senha[strcspn(senha, '\n')]= '\0';

    fprintf(arquivo,"nome: %s\n",nome);
    fprintf(arquivo,"cpf:%d\n", cpf);
    fprintf(arquivo, "senha:%s\n", senha);
    fprintf(arquivo, "email:%s\n", email);

    fclose(arquivo);
return 0;
}