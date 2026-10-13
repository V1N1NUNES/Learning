package POOExercises.E_AbstractClasses_and_Interfaces.ExecutionClass;

import POOExercises.E_AbstractClasses_and_Interfaces.ModelClass.NotificacaoEmail;
import POOExercises.E_AbstractClasses_and_Interfaces.ModelClass.NotificacaoSMS;

import java.util.Scanner;

public class Notification {
    public static void main(String[] args) {
        NotificacaoEmail email = new NotificacaoEmail();
        NotificacaoSMS sms = new NotificacaoSMS();
        Scanner reader = new Scanner(System.in);

        System.out.println("Digite a mensagem que será enviada por email: ");
        String mensagem = reader.nextLine();

        System.out.println("Digite a mensagem que será enviada por SMS:");
        String mensagem2 = reader.nextLine();

        email.enviarEmail(mensagem);
        sms.enviaarSMS(mensagem2);
    }
}
