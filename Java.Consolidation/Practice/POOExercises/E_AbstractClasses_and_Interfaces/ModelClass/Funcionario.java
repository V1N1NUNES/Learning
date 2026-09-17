package POOExercises.E_AbstractClasses_and_Interfaces.ModelClass;


public abstract class Funcionario extends Pessoa{
    protected TipoServiço tipoRegime;
    protected double salario;

    public Funcionario(String nome, int idade, double cpf, TipoServiço regime, double salario){
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.tipoRegime = regime;
        this.salario = salario;
    }

    //methods
    public TipoServiço getTipoCliente() {
        return tipoRegime;
    }
    public double getSalario(){
        return salario;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public abstract void calcularSalario(double salario);

    public abstract String ToString();
}
