package POOExercises.E_AbstractClasses_and_Interfaces.ExecutionClass;

import POOExercises.E_AbstractClasses_and_Interfaces.ModelClass.Animal;
import POOExercises.E_AbstractClasses_and_Interfaces.ModelClass.TipoAnimal;

public class Galinha extends Animal {
    public Galinha(String tipoAnimal, int pontosDeVida, String nome) {
        super(tipoAnimal, pontosDeVida, nome);
    }

    @Override
    public void emitirSom() {
        System.out.println("PO PO PO PO PO PO PO PO ");
    }

    @Override
    public void getTipoAnimal(TipoAnimal tipoAnimal) {
        super.getTipoAnimal(tipoAnimal);
    }

}
