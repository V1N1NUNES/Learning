package POOExercises.E_AbstractClasses_and_Interfaces.ModelClass;

public abstract class Animal implements  Animal_Interface {
    private String tipoAnimal;
    private int pontosDeVida;
    public String nome;

    public Animal(String tipoAnimal, int pontosDeVida,  String nome) {
        this.tipoAnimal = tipoAnimal;
        this.pontosDeVida = pontosDeVida;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "tipoAnimal='" + tipoAnimal + '\'' +
                ", pontosDeVida=" + pontosDeVida +
                ", nome='" + nome + '\'' +
                '}';
    }
}
