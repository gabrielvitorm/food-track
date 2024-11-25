package src.service;

import src.model.Cliente;
import java.util.ArrayList;
import java.util.Iterator;

public class ClienteService {
    private ArrayList<Cliente> clientes = new ArrayList<>();

    public void cadastrarCliente(Cliente cliente) {
        clientes.add(cliente);
        System.out.println("Cadastrado com Sucesso!");
    }

    public ArrayList<Cliente> listar() {
        return clientes;
    }

    public void atualizar(String nome, String novoNome) {
        boolean encontrado = false;
        for (Cliente cliente : clientes) {
            if (cliente.getNome().equalsIgnoreCase(nome)) {
                cliente.setNome(novoNome);
                System.out.println("Atualizado com sucesso!");
                encontrado = true;
                break; // Sai do loop após encontrar e atualizar
            }
        }
        if (!encontrado) {
            System.out.println("Pessoa não foi encontrada.");
        }
    }

    public void deletar(String nome) {
        boolean encontrado = false;
        Iterator<Cliente> iterator = clientes.iterator();
        while (iterator.hasNext()) {
            Cliente cliente = iterator.next();
            if (cliente.getNome().equalsIgnoreCase(nome)) {
                iterator.remove();
                System.out.println("Deletado com sucesso!");
                encontrado = true;
                break; // Sai do loop após encontrar e deletar
            }
        }
        if (!encontrado) {
            System.out.println("Não encontrado");
        }
    }
}