package POOExercises.D_Enums.ExecutionClass;

import POOExercises.D_Enums.ModelClass.CadastroPessoa;
import POOExercises.D_Enums.ModelClass.TipoCliente;

import java.util.Scanner;

public class CadastroExe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do cliente: ");
        String nome = sc.nextLine();
        System.out.println("Digite o CPF do cliente: ");
        double cpf = sc.nextDouble();
        System.out.println("O cliente é pessoa física o jurídica?\n1- Pessoa Física\n2- Pessoa Jurídica");
        int opcao = sc.nextInt();

        TipoCliente tipoCliente = null;
        if(opcao == 1){
            tipoCliente = TipoCliente.PESSOA_FISICA;
        }
        else if(opcao == 2){
            tipoCliente = TipoCliente.PESSOA_JURIDICA;
        }

        CadastroPessoa pessoa = new CadastroPessoa(nome, cpf, tipoCliente);

        System.out.println(pessoa.toString());
    }
}
