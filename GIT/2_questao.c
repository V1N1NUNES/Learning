//Escreva um programa em C que utilize ponteiros para funções. Crie duas funções que realizem operações matemáticas simples (por exemplo, adição e multiplicação). Use um ponteiro para função para chamar essas funções dinamicamente com base na escolha do usuário.


#include <stdio.h>
#include <math.h>
#include <unistd.h>

//declarações
float soma(float *,float *);
float multiplica(float *, float *);


//funções
float soma(float *a,float *b){
    return *a + *b;
}

float multiplica(float *a, float *b){
    return *a * *b;
}

int main (){
    float n1, n2;
    int opcao;
    float resultado;

//preenchimento 
    printf("Programa que soma ou multiplica dois numeros\n\n");
    sleep(1.5);
    printf("Digite o primeiro numero:\n");
    scanf("%f", &n1);
    printf("Digite o segundo numero:\n");
    scanf("%f", &n2);
    printf("\nDigite 1 para somar os numeros ou 2 para multiplicar os numeros:\n");
    scanf("%d", &opcao);

//verificação de "opcao"
    if(opcao <= 0 || opcao >= 3){
        printf("\nNumero digitado inválido.\n");
        printf("Até logo!\n:)");
        return 1;
    }

    switch(opcao){
        case 1:{
            resultado = soma(&n1, &n2);
            printf("\nSoma dos numeros:%.1f\n",resultado);
            break;
        }
        case 2:{
            resultado = multiplica( &n1, &n2);
            printf("\nMultiplicação dos numeros:%.2f\n", resultado); 
            break;
        }
    }
    return 0;
}