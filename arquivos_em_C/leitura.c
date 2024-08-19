#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <string.h>

int main()
{
    printf("Imprimindo arquivos que foram escritos em 'soma.txt':\n");

//abertura do arquivo
    FILE *arq= fopen("soma.txt", "r");

    float num1, num2, somatorio;

//lendo os dados no arquivo
    fscanf(arq, "soma de %.2f + %.2f= %.2f\n",&num1, &num2, &somatorio);

//fechando o arquivo
    fclose(arq);

//mostrando os dados do arquivo
    printf("Soma:%.2f + %.2f = %.2f\n",num1, num2, somatorio);

    return 0;
}