package POOExercises.E_AbstractClasses_and_Interfaces.ModelClass;

public class Administrativo extends Funcionario{

    public Administrativo(String nome, int idade, double cpf, TipoServiço regime, double salario) {
        super(nome, idade, cpf, regime, salario);
    }

    @Override
    public void calcularSalario(double salario) {
        this.salario = salario + salario * 0.008;

        //set salario in the same method
        super.setSalario(this.salario);
    }

    @Override
    public String ToString() {
        return "Cargo: Gerente\n" +
                "Nome: " + this.nome +
                "idade: " + this.idade +
                "CPF: " + this.cpf +
                "Tipo de serviço prestado: " + this.tipoRegime +
                "Salario: " + this.salario;
    }

    @Override
    public void falar() {
        System.out.println("Olá, sou o(a) técnico administrativo. Como posso ajudar?");
    }
}
