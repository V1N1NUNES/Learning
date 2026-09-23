package ModernJava.G_Collections.Model;

import java.util.*;

public class Colletions {
    private final List<Pessoa> pessoas =  new ArrayList<>();
    private final Set<Emails> emailList =  new HashSet<>();
    private final Queue<Pessoa> filaEspera =  new LinkedList<>();
    private final Map<Pessoa, Emails> cadastros =  new HashMap<>();


    public Pessoa buscarPessoa(String cpf) {
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getCpf().equals(cpf)) {
                return pessoa;
            }
        }
        return null;
    }
    public boolean modificarPessoa(String cpf, String novoNome) {
        Pessoa pessoa = buscarPessoa(cpf);

        if (pessoa != null) {
            pessoa.setNome(novoNome);
            return true;
        }

        return false;
    }
    public void mostrarPessoas() {
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }
    }
    public void adicionarPessoa(Pessoa pessoa) {
        pessoas.add(pessoa);
    }
    public boolean removerPessoa(String cpf) {
        Pessoa pessoa = buscarPessoa(cpf);

        if (pessoa != null) {
            pessoas.remove(pessoa);
            return true;
        }

        return false;
    }


    public Emails buscarEmail(String email) {
        for (Emails emails : emailList) {
            if (emails.getEmail().equals(email)) {
                return emails;
            }
        }

        return null;
    }
    public boolean modificarEmail(String email, String novoEmail) {
        Emails emails = buscarEmail(email);

        if (emails != null) {
            emails.setEmail(novoEmail);
            return true;
        }

        return false;
    }
    public void mostrarEmails() {
        for (Emails emails : emailList) {
            System.out.println(emails);
        }
    }
    public boolean adicionarEmail(Emails email) {
        return emailList.add(email);
    }
    public boolean removerEmail(Emails email) {
        return emailList.remove(email);
    }


    public Pessoa buscarNaFila(String cpf) {
        for (Pessoa pessoa : filaEspera) {
            if (pessoa.getCpf().equals(cpf)) {
                return pessoa;
            }
        }

        return null;
    }
    public boolean modificarPessoaNaFila(String cpf, String novoNome) {
        Pessoa pessoa = buscarNaFila(cpf);

        if (pessoa != null) {
            pessoa.setNome(novoNome);
            return true;
        }

        return false;
    }
    public void mostrarFila() {
        for (Pessoa pessoa : filaEspera) {
            System.out.println(pessoa);
        }
    }
    public boolean adicionarNaFila(Pessoa pessoa) {
        return filaEspera.offer(pessoa);
    }
    public Pessoa removerDaFila() {
        return filaEspera.poll();
    }
    public boolean removerPessoaEspecifica(Pessoa pessoa) {
        return filaEspera.remove(pessoa);
    }


    public Emails buscarCadastro(Pessoa pessoa) {
        return cadastros.get(pessoa);
    }
    public boolean modificarCadastro(Pessoa pessoa, Emails novoEmail) {

        if (cadastros.containsKey(pessoa)) {
            cadastros.put(pessoa, novoEmail);
            return true;
        }

        return false;
    }
    public void mostrarCadastros() {

        for (Map.Entry<Pessoa, Emails> cadastro : cadastros.entrySet()) {

            Pessoa pessoa = cadastro.getKey();
            Emails email = cadastro.getValue();

            System.out.println("Pessoa: " + pessoa);
            System.out.println("Email: " + email);
            System.out.println("--------------------");
        }
    }
    public void adicionarCadastro(Pessoa pessoa, Emails email) {
        cadastros.put(pessoa, email);
    }
    public boolean removerCadastro(Pessoa pessoa) {
        return cadastros.remove(pessoa) != null;
    }
}
