package ModernJava.F_Execptions.ExecutionClass;

import ModernJava.F_Execptions.Models.ValidarUsuario;

import java.util.Scanner;

public class ValidacaoUsuario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        if(!ValidarUsuario.validacao(idade)){
            System.out.println("Ja pode consumir coisa adulticas");
        }
        else{
            System.out.println("Sorry kid..");
        }
    }
}
