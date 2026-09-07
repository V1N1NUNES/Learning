package POOExercises.D_Enums.ModelClass;

public enum TipoCliente {
    PESSOA_FISICA(1, "Funcionario fisica"),
    PESSOA_JURIDICA(2, "Funcionario juridica");

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
