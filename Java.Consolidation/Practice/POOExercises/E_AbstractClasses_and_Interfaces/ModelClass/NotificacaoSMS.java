package POOExercises.E_AbstractClasses_and_Interfaces.ModelClass;

import java.io.Serializable;

public class NotificacaoSMS implements Notification {
    @Override
    public void enviarMensagem(String message) {
        System.out.println("Enviando Mensagem por SMS: " + message);
    }

    public void enviaarSMS(String message) {
        enviarMensagem(message);
    }
}
