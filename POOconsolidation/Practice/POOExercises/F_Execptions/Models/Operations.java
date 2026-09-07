package POOExercises.F_Execptions.Models;

public abstract class Operations {
    private static float saldo = 100000f;

    public float getSaldo() {
        return saldo;
    }

    public static float divisao(float  num1, float num2) throws RuntimeException{
        if(num1==0 || num2==0){
            throw new ArithmeticException("Não é possível dividir por zero");
        }else{
            return num1/num2;
        }
    }

    public static void sacar(float valorSaque) throws SaldoInsuficienteExeption {
        if(valorSaque>saldo){
            throw new SaldoInsuficienteExeption();
        }
        else{
            saldo -= valorSaque;
            System.out.println("Saque realizado com sucesso");
            System.out.println("Valor do saldo atual: " + Operations.saldo);
        }
    }
}
