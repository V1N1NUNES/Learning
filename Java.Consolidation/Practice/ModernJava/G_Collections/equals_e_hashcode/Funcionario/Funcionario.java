package ModernJava.G_Collections.equals_e_hashcode.Funcionario;

import java.lang.invoke.StringConcatFactory;
import java.util.Objects;

public class Funcionario {
    private String nome;
    private String CPF;
    private String email;

    public Funcionario(String nome, String CPF, String email) {
        this.nome = nome;
        this.CPF = CPF;
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Funcionario that = (Funcionario) o;
        return Objects.equals(CPF, that.CPF) && Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(CPF, email);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
