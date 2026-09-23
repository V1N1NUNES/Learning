package ModernJava.F_Execptions.ExecutionClass;

import ModernJava.F_Execptions.Models.ContaBancaria;
import ModernJava.F_Execptions.Models.SaldoInsuficienteExeption;

import java.util.Scanner;

public class ContaBancariaEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria(100000.00f);

        float valorSaque;
        System.out.println("Valor do saldo atual:" + conta.getSaldo());
        System.out.println("Digite o valor do saque:");
        valorSaque = sc.nextFloat();
        conta.setSaque(valorSaque);

        try {
            conta.sacar(conta.getSaque(), conta.getSaldo());
        } catch (SaldoInsuficienteExeption e) {
            System.out.println(e.getMessage());
        } finally {
            float  saldo = conta.getResultSaque();
            float saque = conta.getSaque();

            System.out.println("Saldo em conta: " + saldo +
                    "\nValor do saque: " + saque);
        }
    }
}
