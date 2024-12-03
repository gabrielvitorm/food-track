package src.service;

import src.model.Pedido;
import src.model.ItemPedido;
import src.enums.StatusPedido;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PedidoService {

    private List<Pedido> pedidos;

    public PedidoService() {
        this.pedidos = new ArrayList<>();
    }

    public void criarPedido(int id, LocalDate data) {
        Pedido pedido = new Pedido(id, data);
        pedidos.add(pedido);
        System.out.println("Pedido criado com sucesso!");
    }

    public void adicionarItemAoPedido(int pedidoId, ItemPedido item) {
        for (Pedido pedido : pedidos) {
            if (pedido.getId() == pedidoId) {
                pedido.adicionarItem(item);
                System.out.println("Item adicionado ao pedido com sucesso!");
                return;
            }
        }
        System.out.println("Pedido não encontrado.");
    }

    public void atualizarStatusPedido(int pedidoId, StatusPedido novoStatus) {
        for (Pedido pedido : pedidos) {
            if (pedido.getId() == pedidoId) {
                pedido.setStatusPedido(novoStatus);
                System.out.println("Status do pedido atualizado com sucesso!");
                return;
            }
        }
        System.out.println("Pedido não encontrado.");
    }

    public void listarPedidos() {
        for (Pedido pedido : pedidos) {
            System.out.println(pedido);
        }
    }

    public void criarPedido(Pedido pedido) {
        
    }

    public Pedido buscarPedidoPorId(int idAlterarPedido) {
        for (Pedido pedido : pedidos) {
            if (pedido.getId() == idAlterarPedido) {
                return pedido;
            }
        }
        return null;
    }

    public void deletarPedido(int idDeletarPedido) {
        boolean encontrado = false;

        for (int i = 0; i < pedidos.size(); i++) {
            if (pedidos.get(i).getId() == idDeletarPedido) {
                pedidos.remove(i);
                System.out.println("Pedido com ID " + idDeletarPedido + " deletado com sucesso!");
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Pedido com ID " + idDeletarPedido + " não encontrado.");
        }
    }
}
