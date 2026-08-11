package PracticeProjects.A_GradingSystem.App;

import PracticeProjects.A_GradingSystem.Class.Manager;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Init {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int option;

        do {
            do {
                System.out.println("---------------------------------------------");
                System.out.println("SISTEMA DE GERENCIAMENTO DE NOTAS\n");
                System.out.println("Escolha uma opção:\n1- Ver notas\n2- Calcular nota\n3- Sair");
                option = read.nextInt();

                if(option < 1 || option > 3){
                    System.out.println("Entrada inválida.\nTente novamente...\n");
                }
                //Add exception for float entrance

            } while (option < 1 || option > 3);

            switch (option) {
                case 1:
                    Manager.showNotes();
                    break;

                case 2:
                    //calcular notas e armazenar no array
                    int n1, n2, n3;

                    System.out.println("Digite a primeira nota: ");
                    n1 = read.nextInt();
                    System.out.println("Digite a segunda nota: ");
                    n2 = read.nextInt();
                    System.out.println("Digite a terceira nota: ");
                    n3 = read.nextInt();

                    System.out.println("Nota final calculada é: " + Manager.finalNote(n1, n2, n3));
                    break;

                case 3:
                    read.close();
                    System.out.println("Até logo! ;)\n\n");
                    break;
            }
        } while (option != 3);
        System.exit(0);

    }
}
