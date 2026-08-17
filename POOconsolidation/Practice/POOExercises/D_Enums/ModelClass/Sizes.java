package POOExercises.D_Enums.ModelClass;

public enum Sizes{
    CHILD("Tamanho criança(child)"),
    P("Tamanho adulto pequeno(small)"),
    M("Tamanho adulto médio(medium)"),
    G("Tamanho grande(Large)"),
    GG("Tamanho adulto Extra-grande(Extra Large)"),
    GGG("Tamanho adulto gordox(Extra Extra Large)"),
    WTF("Tamanho adulto obeso(Hell no?)");

    //attributes
    private String description = "";

    //constructors
    Sizes(String descricao){
        description = description;
    }

    //methods
    public String getDescription(){
        return description;
    }
}
