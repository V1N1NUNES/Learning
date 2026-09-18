package ModernJava.D_Enums.ModelClass;

public enum Priorities {
    BAIXA(1, "Prioridade baixa"),
    MEDIA(2, "Prioridade média"),
    ALTA(3, "Prioridade alta, requer atenção!"),
    CRITICA(4, "Prioridade crítica! Requer ação imediata interventiva");

    private final int status;
    private final String description;

    Priorities(int status, String description) {
        this.status = status;
        this.description = description;
    }

    public int getStatus() {
        return status;
    }

    public String getDescription() {
        return description;
    }

    public static Priorities concatenacaoDePrioridade(int prioridade) {
        for (Priorities p : Priorities.values()) {
            if (p.getStatus() == prioridade) {
                return p;
            }
        }
        throw new IllegalArgumentException("Opção de prioridade inválida: " + prioridade);
    }
}
