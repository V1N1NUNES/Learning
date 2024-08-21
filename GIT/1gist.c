#include <stdio.h>

//função para capturar qualquer residuo de memoria deixado no buufer do teclado (útil antes de se utilizar um fgets)
void clean_buffer()
{
    int clean;
    while((clean = getchar()) != '\n' && clean != EOF);

}


//função que remove o caractere "\n" da string dita pelo usuario (útil para evitar de deixar residuos de memoria no buffer do teclado)
void remove_newline(char *str)
{
    int i=0;

    while(str[i] != '\0')
    {
        if(str[i] == '\n')
        {
            str[i] = '\0';
            break;
        }
        i++;
    }
}