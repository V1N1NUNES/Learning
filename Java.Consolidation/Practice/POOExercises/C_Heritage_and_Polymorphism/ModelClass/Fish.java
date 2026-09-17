package POOExercises.C_Heritage_and_Polymorphism.ModelClass;

public class Fish extends Animal{
    private String color;

    public Fish(String raca, String nome, String habitat, int idade, String color) {
        super(raca, nome, habitat, idade);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void EmitirSom() {
        System.out.println("Blu blu blu 🫧🫧🫧🫧");
    }

    public void showAnimal(){
        super.showAnimal();
        System.out.println("Coloração da peça: " +  this.color);
    }
}
