package POOExercises.D_Enums.ModelClass;

public class CadastroPessoa {
    private String nome;
    private double CPF;
    private TipoCliente tipoCliente;

    public CadastroPessoa(String nome, double CPF, TipoCliente tipoCliente) {
        this.nome = nome;
        this.CPF = CPF;
        this.tipoCliente = tipoCliente;
    }

    public String getNome() {
        return nome;
    }

    public double getCPF() {
        return CPF;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", CPF=" + CPF +
                ", tipoCliente=" + tipoCliente +
                '}';
    }
}
