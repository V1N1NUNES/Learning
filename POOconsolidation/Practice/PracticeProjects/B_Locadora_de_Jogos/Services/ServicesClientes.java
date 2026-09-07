package PracticeProjects.B_Locadora_de_Jogos.Services;

public final class ServicesClientes {

    public boolean validarIdadeCliente(int idadeCliente) {
        return idadeCliente >= 18 ? true : false;
    }
}
