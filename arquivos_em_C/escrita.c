#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <string.h>


//declarações
#define tam 200
int cadastro_pessoa();
void limpar_buffer();
typedef struct {
    char nome[tam];
    int idade;
    char sexo[20];
} pessoa;
int pessoa [tam];
int quant=0;


//funções
void limpar_buffer(){
    int clear;
    while((clear = getchar() != '\n' && clear != EOF));
}
int cadastro_pessoa(){
    char resposta[10];
    int i=0;
    while(resposta == 'sim' || resposta == 'Sim'){
        printf("Digite seu nome:\n");
        limpar_buffer();
        fgets(pessoa[i].nome,sizeof(pessoa[i].nome),stdin);
        printf("Digite sua idade:\n");
        scanf("%d", &pessoa[i].idade);
        printf("Digite seu sexo:\n");
    }
    
int main(){

return 0;
}