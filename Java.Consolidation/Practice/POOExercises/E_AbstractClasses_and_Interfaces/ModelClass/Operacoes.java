package POOExercises.E_AbstractClasses_and_Interfaces.ModelClass;


public interface Operacoes {

    default void operacao(){
        System.out.println("operacao");
    }
}
