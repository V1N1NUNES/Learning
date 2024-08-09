//Escreva um programa em C que aloque dinamicamente memória para um array de inteiros usando malloc. O programa deve permitir ao usuário inserir valores no array e, em seguida, calcular e imprimir a média dos valores inseridos. Certifique-se de liberar a memória alocada no final do programa.

#include <stdio.h>
#include <unistd.h>
#include <stdlib.h>//obtem a função malloc

//declarações

//funções


int main(){
    int tamanho;
    float soma=0;
    float media;

//preenchimento
    printf("Digite quantos elementos inteiros você precisa:\n");
    scanf("%d", &tamanho);

    int* vet= (int*)malloc(tamanho * sizeof(int));
    if(vet ==NULL){
        printf("erro na alocação de memoria.\n");
        return 1;
    }
    
    for(int i=0;i<tamanho;i++){
        printf("Digite um numero (inteiro) para o %d espaço do vetor:\n",i+1);
        scanf("%d",&vet[i]);
        //verificação de numero inteiro ***
    }
//calculando a media
    for(int i=0;i<tamanho;i++){
        soma += vet[i];
    }
    media= soma/tamanho;
//mostrandoa media
    printf("Media dos numeros digitados:%.2f\n",media);

    free(vet);
    return 0;

}
