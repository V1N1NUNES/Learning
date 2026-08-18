package PracticeProjects.C_Locadora_de_Jogos.Controllers;

import PracticeProjects.C_Locadora_de_Jogos.DataBase.ClientesDB;
import PracticeProjects.C_Locadora_de_Jogos.Models.Clientes.Clientes;
import PracticeProjects.C_Locadora_de_Jogos.Services.ServicesClientes;

public class ClienteController {
    public boolean criacaoCliente(String nome, String cpf, int idade){
        Clientes cliente = new Clientes(nome, cpf,idade);

        if(this.armazenamentoCliente(cliente) && cliente instanceof Clientes){
            return true;
        }else{
            return false;
        }
    }

    private boolean armazenamentoCliente(Clientes cliente){
        ClientesDB clientesDB = new ClientesDB();

        if(clientesDB.addCliente(cliente)){
            return true;
        }else{
            return false;
        }
    }

    public boolean validacaoIdadeCliente(int idade){
        ServicesClientes  servicesClientes  = new ServicesClientes();

        if(servicesClientes.validarIdadeCliente(idade)){
            return true;
        }else{
            return false;
        }
    }
}
