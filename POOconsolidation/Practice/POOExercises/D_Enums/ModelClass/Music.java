package POOExercises.D_Enums.ModelClass;

public enum Music {
    MUSICO("É um(a) Músico/Musicista de verdade", 1),
    CANTOR("É um Cantor/(a) de verdade", 1);

    //attributes
    private final String description;
    private final int id;

    //constructor
    Music(String descricao, int numeracao) {
        this.description = descricao;
        this.id = numeracao;
    }

    //methods
    public String getDescription() {
        return description;
    }

    public int getId() {
        return id;
    }
}
