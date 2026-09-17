package POOExercises.C_Heritage_and_Polymorphism.ModelClass;

public class Dog extends Animal{
    private String humor;

    public Dog(String raca, String nome, String habitat, int idade , String humor){
        super(raca, nome, habitat, idade);
        this.humor = humor;
    }

    public void setHumor(String humor) {
        this.humor = humor;
    }

    @Override
    public void EmitirSom() {
        System.out.println("Au au 😎");
    }

    public void showAnimal(){
        super.showAnimal();
        System.out.println("humor: " +  this.humor);
    }
}
