package ModernJava.G_Collections.equals_e_hashcode.Carro;

import java.util.Objects;

public class Carro implements Comparable<Carro> {
    private String idChassi;
    private String nome;
    private String cor;
    private String marca;

    public Carro(String idChassi, String nome, String cor, String marca) {
        this.idChassi = idChassi;
        this.nome = nome;
        this.cor = cor;
        this.marca = marca;
    }

    public String getIdChassi() {
        return idChassi;
    }

    public void setIdChassi(String idChassi) {
        this.idChassi = idChassi;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public boolean equals(Object o) {
        // 1. Verifica se é a mesma referência na memória (mais rápido)
        if (this == o) return true;

        // 2. Verifica se o objeto é nulo ou de classes diferentes
        if (o == null || getClass() != o.getClass()) return false;

        // 3. Faz o casting seguro
        Carro carro = (Carro) o;

        // 4. Compara os campos usando Objects.equals (que lida bem com nulos)
        return Objects.equals(idChassi, carro.idChassi) &&
                Objects.equals(marca, carro.marca);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idChassi, marca);
    }

    @Override
    public String toString() {
        return "Carro: " + this.nome +
                "\nCor: " + this.cor +
                "\nMarca Fabricante: " + this.marca +
                "\nNúmero do chassi: " + this.idChassi +
                "\n----------------------------\n";
    }

    @Override
    public int compareTo(Carro o) {
        return this.idChassi.compareTo(o.idChassi);
    }
}
