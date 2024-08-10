#include <stdio.h>
#define tam 200

int main(){
    FILE *arquivo;
    char leitura[tam];

    arquivo=fopen("armazenamento.txt", "r");
    if(arquivo == NULL){
        printf("erro na abertura do arquivo\n");
        return 1;
    }
    while (fgets(leitura, tam, arquivo) != NULL){
        printf("%s", leitura);
    }

    fclose(arquivo);

    return 0;
}