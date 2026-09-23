package ModernJava.D_Enums.ExecutionClass;

import ModernJava.D_Enums.ModelClass.CancelamentoPedidoExeption;
import ModernJava.D_Enums.ModelClass.Pedido;
import ModernJava.D_Enums.ModelClass.StatusPedido;

public class CancelamentoPedidoExe {
    public static void main(String[] args) {

        StatusPedido statusPedido = StatusPedido.PROCESSANDO;
        Pedido pedido = new Pedido("Porção de camarão grandes = R$49,99", statusPedido);

        try {
            pedido.setStatus(statusPedido);
        } catch (CancelamentoPedidoExeption e) {
            System.out.println("Erro: " + e.getMessage());
        }
        StatusPedido statusPedido2 = StatusPedido.ENVIADO;

        try {
            pedido.setStatus(statusPedido2);

        } catch (CancelamentoPedidoExeption e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
