package POOExercises.E_AbstractClasses_and_Interfaces.ExecutionClass;

import POOExercises.E_AbstractClasses_and_Interfaces.ModelClass.Funcionario;
import POOExercises.E_AbstractClasses_and_Interfaces.ModelClass.Gerente;
import POOExercises.E_AbstractClasses_and_Interfaces.ModelClass.TipoServiço;
import POOExercises.E_AbstractClasses_and_Interfaces.ModelClass.Vendedor;

import java.util.Scanner;

public class Contratacao {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);

        //criação dos objetos
        Gerente g = new Gerente("vinicius", 20, 345543345, TipoServiço.CLT, 12000);
        Vendedor v = new Vendedor("Maraise", 26, 234234234, TipoServiço.PJ, 10000);

        g.calcularSalario(g.getSalario());
        v.calcularSalario(v.getSalario());

        g.ToString();
        v.ToString();
    }
}
