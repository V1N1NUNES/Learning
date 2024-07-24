//enuciado da questão que eu estaria fazendo para não esquecer oque esta pedindo no exemplo



#include <stdio.h>
#include <math.h>

//função para calcular a raiz quadrada
float quad(float a){
    float resultado;
    resultado= sqrt(a);
    return resultado;
}
int main (){
    float num1, num2;
    float result;
    printf("digite um numero:\n");
    scanf("%f", &num1);

    result= quad(num1);
    printf("Raiz quadrada do numero:%.1f\n", result);
    return 0;
}