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
}
