package POOExercises.C_Heritage_and_Polymorphism.ModelClass;

import java.security.PublicKey;

public class FuncionarioCLT extends Funcionario{
    private float vale;

    public FuncionarioCLT(String nome, String CPF, double salarioBase, float vale){
        super(nome,CPF,salarioBase);
        this.vale = vale;
    }

    protected FuncionarioCLT(String nome, String CPF, double salarioBase){
        super(nome,CPF,salarioBase);
    }

    public float getVale() {
        return vale;
    }

    public void setVale(float vale) {
        this.vale = vale;
    }

    @Override
    public void mostrarFuncionario(){
        super.mostrarFuncionario();
        System.out.println("Valor do vale: " +  this.vale);
    }

    //Criação de método para tirar a parte do vale na herança
    public void mostrarFuncionarioSemVale(){
        super.mostrarFuncionario();
    }

    @Override
    public void calcularSalario() {

    }
}
