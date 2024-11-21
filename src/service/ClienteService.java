package src.service;

import src.model.Cliente;
import src.model.Pessoa;

import java.util.ArrayList;

public class ClienteService {
    private ArrayList<Cliente> clientes = new ArrayList<>();

    public void cadastrarCliente(Cliente cliente){
        clientes.add(cliente);
        System.out.println("Cadastrado com Sucesso!");
    }

    public ArrayList<Cliente>listar(){
        return clientes;
    }

    public void atualizar (String nome, String novoNome) {
        for (Cliente cliente : clientes) {

            if (cliente.getNome().equalsIgnoreCase(nome)) {
                cliente.setNome(novoNome);
                System.out.println("Atualizado com sucesso!");

            } else {
                System.out.println("Pessoa não foi encontrada.");

            }
        }
    }

    public void deletar (String nome){

        for (int i = 0; i < clientes.size(); i++) {

            if (clientes.get(i).getNome().equalsIgnoreCase(nome)) {
                clientes.remove(i);
                System.out.println("Deletado com sucesso!");

            } else{
                System.out.println("Não encontrado");
            }
        }
    }

}
