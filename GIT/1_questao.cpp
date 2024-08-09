// Escreva um programa em C que receba um array de inteiros e seu tamanho, e depois inverta a ordem dos elementos do array usando ponteiros. O programa deve imprimir o array original e o array invertido.

#include <stdio.h>
#include <unistd.h>
#define tam 6
//declarações
void inversao(int *, int);

//funções
void inversao(int *x, int tamanho){
    int *inicio = x ,*fim= x + tamanho -1, temp;

    while(inicio<fim){
        temp=*inicio;
        *inicio= *fim;
        *fim=temp;
        *inicio++;
        *fim--;
    }
}

int main(){
    int vet[tam];

//preenchendo o vetor (ok)
    for(int i=0;i<tam;i++){
        printf("Digite um numero para o espaço %d do vetor:\n",i+1);
        scanf("%d", &vet[i]);
    }

//mostrando o vetor original (ok)
    printf("\nVetor original:\n");
    for(int i=0;i<tam;i++){
        printf("%d espaço do vetor:%d\n",i+1,vet[i]);
        sleep(1);
    }

//inversão do vetor
    inversao(vet,tam);

//mostrando o vetor invertido
    printf("\nVetor invertido:\n");
    for(int i=0;i<tam;i++){
        printf("%d espaço do vetor invertido:%d\n", i+1,vet[i]);
        sleep(1);
    }
    return 0;
}