package PracticeProjects.C_Locadora_de_Jogos.Services;

import PracticeProjects.C_Locadora_de_Jogos.Models.Clientes.Clientes;

public final class ServicesClientes {

    public boolean validarIdadeCliente(int idadeCliente) {
        return idadeCliente >= 18 ? true : false;
    }
}
