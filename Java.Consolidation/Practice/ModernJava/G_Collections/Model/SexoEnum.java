package ModernJava.G_Collections.Model;

public enum SexoEnum {
    M("Masculino", 2),
    F("Feminino", 1);

    private final String nome;
    private final int id;

    SexoEnum(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }
    public static SexoEnum getSexo(int id) {
        for (SexoEnum sexo : SexoEnum.values()) {
            if (sexo.getId() == id) {
                return sexo;
            }
        }
        return null;
    }
}
