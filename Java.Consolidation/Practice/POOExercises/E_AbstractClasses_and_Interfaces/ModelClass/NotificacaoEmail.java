package POOExercises.E_AbstractClasses_and_Interfaces.ModelClass;

public class NotificacaoEmail implements Notification {
    public void enviarMensagem(String message) {
        System.out.println("enviando mensagem por gmail: " + message);
    }

    public void enviarEmail(String email) {
        enviarMensagem(email);
    }
}
