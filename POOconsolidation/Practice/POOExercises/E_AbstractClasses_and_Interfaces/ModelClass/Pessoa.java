package POOExercises.E_AbstractClasses_and_Interfaces.ModelClass;

public abstract class Pessoa {
    protected String nome;
    protected int idade;
    protected double cpf;

    //getters and setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getCpf() {
        return cpf;
    }

    public void setCpf(double cpf) {
        this.cpf = cpf;
    }

    //other methods
    public abstract void falar();
}
