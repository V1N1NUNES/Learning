package POOExercises.F_Execptions.Models;

public class Gerente extends Funcionario{
    private float salario;

    public Gerente(String name, String rg, String cpf, float salario) {
        super(name, rg, cpf);
        this.salario = salario;
    }

    public float getSalario() {
        return salario;
    }
}
