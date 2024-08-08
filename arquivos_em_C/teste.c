#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <string.h>

#define tam 200

int main(){

    FILE *arquivo;
    FILE *arquivo2;
    int cpf,tel;
    char pessoa [tam];
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
    senha[strcspn(senha, "\n")]='\0';

    printf("Nome: %s\n", nome);
    printf("CPF: %d\n", cpf);
    printf("Senha: %s\n", senha);
    printf("Email: %s\n", email);
    
    fprintf(arquivo,"nome: %s\n",nome);
    fprintf(arquivo,"cpf:%d\n", cpf);
    fprintf(arquivo, "senha:%s\n", senha);
    fprintf(arquivo, "email:%s\n", email);

    fclose(arquivo);

    arquivo2= fopen("binario.bin", "wb");

    while(getchar() != '\n');
    printf("Digite o nome de outra pessoa:\n");
    fgets(pessoa, tam, stdin);
    pessoa[strcspn(pessoa, "\n")]= '\0';

    printf("Digite seu numero de telefone:\n");
    scanf("%d", &tel);

    fprintf(arquivo2,"nome:%s\n", pessoa);
    fprintf(arquivo2, "N. telefone:%d\n", tel);
    fclose(arquivo2);

return 0;
}