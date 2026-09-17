package POOExercises.C_Heritage_and_Polymorphism.ModelClass;

public final class FuncionarioPJ extends Funcionario{
    private int horasTrabalhadas;
    private float valorHora;

    public FuncionarioPJ(String nome, String CPF, double salarioBase,  int horasTrabalhadas, float valorHora){
        super(nome,CPF,salarioBase);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public void mostrarFuncionario(){
        super.mostrarFuncionario();
        System.out.println("Horas trabalhadas: " + this.horasTrabalhadas);
        System.out.println("Valor da hora trabalhada: " +  this.valorHora);
    }
    @Override
    public void calcularSalario() {
    }
}
