package POOExercises.C_Heritage_and_Polymorphism.ModelClass;

public abstract class Funcionario {
    private String nome;
    private String CPF;
    private double salarioBase;

    protected Funcionario(String nome, String CPF, double salarioBase){
        this.nome = nome;
        this.CPF = CPF;
        this.salarioBase = salarioBase;
    }
//    public Funcionario(){
//    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    protected float getSalarioBase(){
        //utilização inútil de casting, por preguiça mesmo
        return (float) this.salarioBase;
    }


    public void mostrarFuncionario(){
        System.out.println("--------------------------------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.CPF);
        System.out.println("Salário: " +  this.salarioBase);
    }

    public void reajustarSalario(){

    }

    public abstract void calcularSalario();
}
