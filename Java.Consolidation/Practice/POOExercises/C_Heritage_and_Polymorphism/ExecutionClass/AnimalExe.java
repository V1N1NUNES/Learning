package POOExercises.C_Heritage_and_Polymorphism.ExecutionClass;

import POOExercises.C_Heritage_and_Polymorphism.ModelClass.Dog;
import POOExercises.C_Heritage_and_Polymorphism.ModelClass.Fish;
import POOExercises.C_Heritage_and_Polymorphism.ModelClass.Octopus;

import java.util.Scanner;

public class AnimalExe {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);

        System.out.println("Criando animais -->");
        Dog d = new Dog("Doberman", "Zeus", "Terrestre", 4, "Brincalhão");
        Fish f = new Fish("Nemo", "Zanca", "Molhado", 12, "Azul marinho estrelado brilhante escuro");
        Octopus o = new Octopus("Desconhecida", "Lindison", "Aquático pouco molhado", 2500, 18);

        d.EmitirSom();
        f.EmitirSom();
        o.EmitirSom();

        d.showAnimal();
        f.showAnimal();
        o.showAnimal();
    }
}
