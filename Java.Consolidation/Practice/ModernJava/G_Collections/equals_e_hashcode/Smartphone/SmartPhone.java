package ModernJava.G_Collections.equals_e_hashcode.Smartphone;

import java.util.Objects;

public class SmartPhone implements Comparable<SmartPhone> {
    private String idSerial;
    private String nome;

    public SmartPhone(String idSerial, String nome) {
        this.idSerial = idSerial;
        this.nome = nome;
    }

    public String getIdSerial() {
        return idSerial;
    }

    public void setIdSerial(String idSerial) {
        this.idSerial = idSerial;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "SmartPhone idSerial=" + idSerial + ", nome=" + nome ;
    }

    @Override
    public boolean equals(Object o) {
        if(o == null) return false;  //verifica se o parâmetro é nulo
        if(o == this) return true;  // verifica se é o mesmo objeto em memória
        if(this.getClass() != o.getClass()) return false;  //verifica se são da mesma classe (se não será impossível serem iguais)
        SmartPhone smartPhone = (SmartPhone)o;  //casting do parâmetro para a classe do this
        return Objects.equals(this.idSerial, smartPhone.idSerial) && Objects.equals(this.nome, smartPhone.nome);  //verifica se o serial number do parâmetro não é nulo e faz a comparação de igualdade do número de versão
    }

    @Override
    public int hashCode() {
        return Objects.hash(idSerial, nome);
    }

    @Override
    public int compareTo(SmartPhone o) {
        return this.idSerial.compareTo(o.idSerial);
    }
}
