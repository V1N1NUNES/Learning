package POOExercises.C_Heritage_and_Polymorphism.ExecutionClass;

import POOExercises.C_Heritage_and_Polymorphism.ModelClass.Funcionario;
import POOExercises.C_Heritage_and_Polymorphism.ModelClass.FuncionarioCLT;
import POOExercises.C_Heritage_and_Polymorphism.ModelClass.FuncionarioPJ;
import POOExercises.C_Heritage_and_Polymorphism.ModelClass.Gerente;

import java.util.Scanner;

public class FuncionarioExe {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        Funcionario[] rh = new Funcionario[3];

        System.out.println("Adicionando funcionários");
        FuncionarioCLT fclt = new FuncionarioCLT("Vinicius", "123123123-23", 12000, 2500);
        FuncionarioPJ fpj = new FuncionarioPJ("Sophia", "234456678-87", 7899, 42, 47.017f);
        Gerente g = new Gerente("Robertinha", "023423432-23", 45000, 0.012f);

        fclt.mostrarFuncionario();
        fpj.mostrarFuncionario();
        g.mostrarFuncionario();

//        //looop para percorrer e mostrar o array
//        for (Funcionario f : rh) {
//        }
    }
}
