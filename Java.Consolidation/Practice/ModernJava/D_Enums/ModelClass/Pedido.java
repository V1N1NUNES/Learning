package ModernJava.D_Enums.ModelClass;

import java.util.UUID;

public class Pedido {
    private Integer id;
    private String descricao;
    private StatusPedido status;

    public Pedido(String descricao, StatusPedido status) {
        this.id = UUID.randomUUID().hashCode();
        this.descricao = descricao;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) throws CancelamentoPedidoExeption {
        this.status.cancelamentoPedido(status);
        this.status = status;
    }
}
