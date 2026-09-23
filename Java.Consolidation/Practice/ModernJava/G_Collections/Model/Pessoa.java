package ModernJava.G_Collections.Model;

public class Pessoa {
    private String nome;
    private int idade;
    private String cpf;
//    private SexoEnum sexo;

    public Pessoa(String nome, int idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
//        this.sexo = sexo;
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cpf='" + cpf + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

//    public SexoEnum getSexo() {
//        return sexo;
//    }

//    public void setSexo(SexoEnum sexo) {
//        this.sexo = sexo;
//    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
