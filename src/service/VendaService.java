package src.service;

import src.model.Pedido;
import src.model.Venda;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class VendaService {

    private List<Venda> vendas;
    private Pedido pedido;
    private Venda venda;
    private int id;
    private LocalDate data;

    public VendaService() {
        this.vendas = new ArrayList<>();
    }

    public void criarVenda() {
        if (pedido == null || pedido.getItens().isEmpty()) {
            System.out.println("Não é possível criar venda sem itens no pedido.");
            return;
        }
        Venda venda = new Venda(id, data, pedido);
        vendas.add(venda);
        System.out.println("Venda criada com sucesso!");
    }

    public void listarVendas() {
        for (Venda venda : vendas) {
            System.out.println(venda);
        }
    }
}
