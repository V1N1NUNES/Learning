package ModernJava.H_Generics.Models;

public class RespostaAPI<T>{
    private int statusAPI;
    private T dadosPedido;

    public RespostaAPI(int statusAPI, T dadosPedido) {
        this.statusAPI = statusAPI;
        this.dadosPedido = dadosPedido;
    }
    public RespostaAPI() {
    }

    public int getStatusAPI() {
        return statusAPI;
    }

    public T getDadosPedido() {
        return dadosPedido;
    }
}
