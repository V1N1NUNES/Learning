package POOExercises.C_Heritage_and_Polymorphism.ModelClass;

public abstract class Animal {
    //Attributes
    protected String raca;
    protected String nome;
    protected String habitat;
    protected int idade;

    //constructors and overloading constructors
    public Animal(String raca, String nome, String habitat, int idade) {
        this.raca = raca;
        this.nome = nome;
        this.habitat = habitat;
        this.idade = idade;
    }
    public Animal() {
        //void constructor
    }

    //get and set methods
    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    //other methods
    public abstract void EmitirSom();

    public void showAnimal(){
        System.out.println("----------------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Raca: " + this.raca);
        System.out.println("Habitat: " + this.habitat);
        System.out.println("Idade: " + this.idade);
    }

}
