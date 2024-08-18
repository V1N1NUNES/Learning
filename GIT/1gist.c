#include <stdio.h>


void clean_buffer()
{
    int clean;
    while((clean = getchar()) != '\n' && clean != EOF);

}



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