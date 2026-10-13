package POOExercises.E_AbstractClasses_and_Interfaces.ExecutionClass;

import POOExercises.E_AbstractClasses_and_Interfaces.ModelClass.BatalhaEpicaAnimal;
import POOExercises.E_AbstractClasses_and_Interfaces.ModelClass.Functional;

public class FuncionalInterface {
    public static void main(String[] args) {

        Functional f =  (a, b) -> a*b;
        System.out.println(f);

    }
}
