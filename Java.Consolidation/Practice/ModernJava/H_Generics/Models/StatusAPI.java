package ModernJava.H_Generics.Models;

public enum StatusAPI {
    PRONTO(200.0f, "Pedido pronto"),
    CRIADO(201, "Pedido criado"),
    PENDENTE(100, "Pedido pendente"),
    CONCLUIDO(200.1f, "Pedido concluído"),
    CANCELADO(404, "Pedido cancelado");

    private float codReturn;
    private String descricao;

    StatusAPI(float codReturn, String descricao){
        this.codReturn = codReturn;
        this.descricao = descricao;
    }

    public float getCodReturn() {
        return codReturn;
    }

    public String getDescricao() {
        return descricao;
    }
}
