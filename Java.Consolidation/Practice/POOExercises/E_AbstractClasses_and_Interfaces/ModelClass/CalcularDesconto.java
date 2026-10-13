package POOExercises.E_AbstractClasses_and_Interfaces.ModelClass;

public interface CalcularDesconto {
    double aplicarDesconto(double valor);

    static boolean valorValido(double valor) {
        return valor > 0;
    }
}
