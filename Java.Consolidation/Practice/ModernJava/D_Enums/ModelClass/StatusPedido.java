package ModernJava.D_Enums.ModelClass;

import java.sql.SQLOutput;

public enum StatusPedido {
    FEITO("pedido feito"),
    PRONTO("pedido pronto"),
    CANCELADO("pedido cancelado"),
    PENDENTE("pedido pendente"),
    PROCESSANDO("pedido em processamento"),
    ENVIADO("pedido enviado com sucesso"),
    ENTREGUE("pedido entregue com sucesso");

    private final String descricao;

    StatusPedido(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public StatusPedido cancelamentoPedido(StatusPedido statusPedido) throws CancelamentoPedidoExeption {
        if(statusPedido == StatusPedido.PROCESSANDO|| statusPedido == StatusPedido.PENDENTE) {
        System.out.println("----------------------------------------------------");
            throw new CancelamentoPedidoExeption("O pedido não pode ser cancelado enquanto estiver pendente ou em processamento \nSTATUS DO PEDIDO: " + statusPedido.descricao);
        }
        System.out.println("----------------------------------------------------");
        System.out.println("Pedido cancelado com sucesso:\n" +
                "STATUS DO PEDIDO: " + statusPedido.descricao);
        return StatusPedido.CANCELADO;
    }
}
