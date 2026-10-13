package POOExercises.E_AbstractClasses_and_Interfaces.ModelClass;

public interface Animal_Interface  {

    //method de herança
    void emitirSom();

    //mthod de escolha de implementação
    default void getTipoAnimal(TipoAnimal tipoAnimal) {

        if (tipoAnimal == TipoAnimal.MAMIFERO) {
            System.out.println("O animal é um: "+ tipoAnimal.getTipoAnimal());
        }else if (tipoAnimal == TipoAnimal.AVE) {
            System.out.println("O animal é um: "+ tipoAnimal.getTipoAnimal());
        }else  if (tipoAnimal == TipoAnimal.AMFIBIO) {
            System.out.println("O animal é um: "+ tipoAnimal.getTipoAnimal());
        }else if (tipoAnimal == TipoAnimal.PEIXE) {
            System.out.println("O animal é um: "+ tipoAnimal.getTipoAnimal());
        }else if (tipoAnimal == TipoAnimal.REPTIL) {
            System.out.println("O animal é um: "+ tipoAnimal.getTipoAnimal());
        }
    }
    //method static
    public static void animalVoador(TipoAnimal animal) {
        if (animal.equals(TipoAnimal.AVE)) {
            System.out.println("O animal pode voar a vontade");
        }
        else System.out.println("O animal não sabe voar. Apenas de avião");
    }

    //expressões lambda



}
