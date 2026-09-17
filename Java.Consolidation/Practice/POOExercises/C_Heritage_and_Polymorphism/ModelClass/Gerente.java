package POOExercises.C_Heritage_and_Polymorphism.ModelClass;

import POOExercises.C_Heritage_and_Polymorphism.ExecutionClass.FuncionarioExe;

public final class Gerente extends FuncionarioCLT{
    private float bonificação;
    private float salarioBonificado;

    public Gerente(String nome, String CPF, double salarioBase, float bonificação){
        super(nome, CPF, salarioBase);
        this.bonificação = bonificação;
    }

    public float getBonificação() {
        return bonificação;
    }

    public void setBonificação(float bonificação) {
        this.bonificação = bonificação;
    }

    @Override
    public void mostrarFuncionario(){
        super.mostrarFuncionarioSemVale();
        System.out.println("Adicional de bonificação: " + this.bonificação + "%");

        salarioBonificado = super.getSalarioBase() * bonificação;
        System.out.println("Salário com bonificação: " + salarioBonificado);
    }
}
