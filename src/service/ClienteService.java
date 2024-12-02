package src.service;

import src.model.Cliente;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Optional;

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
        Optional<Cliente> clienteOpt = clientes.stream()
                .filter(cliente -> cliente.getNome().equalsIgnoreCase(nome))
                .findFirst();

        if (clienteOpt.isPresent()) {
            clienteOpt.get().setNome(novoNome);
            mostrarMensagem("Atualizado com sucesso!");
        } else {
            mostrarMensagem("Pessoa não foi encontrada.");
        }
    }

    private void mostrarMensagem(String mensagem) {
        System.out.println(mensagem);
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