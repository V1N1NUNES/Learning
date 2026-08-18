package POOExercises.E_AbstractClasses_and_Interfaces.ModelClass;

public class Vendedor extends Funcionario{
    private final int vendas = 55;
    private int quantVendas;

    public Vendedor(String nome, int idade, double cpf, TipoServiço regime, double salario) {
        super(nome, idade, cpf, regime, salario);
    }

    public int getVendas() {
        return quantVendas;
    }
    public void setVendas(int vendas) {
        this.quantVendas = vendas;
    }

    @Override
    public void calcularSalario(double salario){
        this.calcularSalario(salario, this.getVendas());
    }

    @Override
    public String ToString() {
        return "Cargo: Gerente\n" +
                "Nome: " + this.nome +
                "idade: " + this.idade +
                "CPF: " + this.cpf +
                "Tipo de serviço prestado: " + this.tipoRegime +
                "Salario: " + this.salario +
                "Quantidade de vendas feitas: " +  this.quantVendas;
    }

    private void calcularSalario(double salario, int vendas) {

        if (vendas == 0) {
            System.out.println("A quantidade de vendas do funcionário não está registrada. Coloque abaixo a quantidade de vendas feitas por ele:");
            int vendinhas = this.quantVendas;
        }

        float comissao = this.quantVendas + vendas;
        this.salario = salario + comissao;

        //set salario in the same method
        super.setSalario(this.salario);
    }

    @Override
    public void falar() {
        System.out.println("Olá, sou o vendedor, como posso te ajudar?");
    }
}
