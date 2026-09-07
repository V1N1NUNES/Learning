package POOExercises.F_Execptions.Models;

import POOExercises.F_Execptions.ExecutionClass.ErrorStackOverFlow;

public class Errors {
    //Error X exceções
    //runtimeExceptions -> unchecked (Acontece bastante por erro de lógica)
    //Execeptions -> checked (Acontece por erros que não dependem do programador ou da lógica)

    public void estourandoMemoria(){
        this.estourandoMemoria();
    }
}
