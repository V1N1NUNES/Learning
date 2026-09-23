package ModernJava.F_Execptions.Models;

public class ContaBancaria {

    private float saldo;
    private float saque;
    private float resultSaque;

    public ContaBancaria(float saldo) {
        this.saldo = saldo;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getSaque() {
        return saque;
    }

    public void setSaque(float saque) {
        this.saque = saque;
    }

    public float getResultSaque() {
        return resultSaque;
    }

    public void sacar(float valorSaque, float saldo) throws SaldoInsuficienteExeption {
        if (valorSaque > saldo) {
            throw new SaldoInsuficienteExeption();
        }

        this.setSaldo(this.getSaldo() - saldo);
        resultSaque = this.saldo - valorSaque;

        System.out.println("Saque efetuado com sucesso\n");
    }
}
