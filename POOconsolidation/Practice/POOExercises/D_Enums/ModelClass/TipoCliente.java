package POOExercises.D_Enums.ModelClass;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa fisica"),
    PESSOA_JURIDICA(2, "Pessoa juridica");

    //attributes
    private int id;
    private String descricao;

    //constructor
    TipoCliente(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    //methods
}
