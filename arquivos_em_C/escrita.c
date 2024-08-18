#include <stdio.h>
#include <stdlib.h>

float soma(float *x, float *y)
{
    float soma= *x + *y;
    return soma;
}
int main()
{
    float a, b;
    float somado;

    printf("Digite um numero para A:\n");
    scanf("%f", &a);
    printf("Digite um numero para B:\n");
    scanf("%f", &b);

    somado= soma(&a, &b);

//abertura do arquivo
    FILE *arquivo= fopen("soma.txt", "w");

//mensagem de erro caso o arquivo não abra por algum motivo
    if(arquivo == NULL)
    {
        printf("Não foi possivel abrir o arquivo");
        exit(1);
    }

//escrevendo no arquivo
    fprintf(arquivo, "soma de %.2f + %.2f= %.2f\n",a, b, somado);

//fechamento do arquivo
    fclose(arquivo);
    
    printf("Valores que foram passados para a escrita no arquivo 'soma.txt':\n%.2f \t%.2f\t%.2f\n", a, b, somado);

    return 0;
}