package ModernJava.G_Collections.Model;

import java.util.UUID;

public class Emails {
    private String email;
    private String codeUniq;

    public Emails(String email) {
        this.email = email;
        this.codeUniq = UUID.randomUUID().toString();
    }

    @Override
    public String toString() {
        return "Emails{" +
                "email='" + email + '\'' +
                ", codeUniq='" + codeUniq + '\'' +
                '}';
    }

    public String getEmail() {
        return email;
    }

    public String getCodeUniq() {
        return codeUniq;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
