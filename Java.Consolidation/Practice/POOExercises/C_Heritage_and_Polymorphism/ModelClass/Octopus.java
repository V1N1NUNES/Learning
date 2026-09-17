package POOExercises.C_Heritage_and_Polymorphism.ModelClass;

public class Octopus extends Animal{
    private int tentaculos;

    public Octopus(String raca, String nome, String habitat, int idade, int tentaculos){
        super(raca, nome, habitat, idade);
        this.tentaculos = tentaculos;
    }

    @Override
    public void EmitirSom() {
        System.out.println("???...  🐙🦑");
    }

    public void showAnimal(){
        super.showAnimal();
        System.out.println("Quantidade de tentaculos do bichâo: " +  this.tentaculos);
    }
}
