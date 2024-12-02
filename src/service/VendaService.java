package src.service;

import src.model.Venda;
import src.model.Pedido;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class VendaService {

    private List<Venda> vendas;

    public VendaService() {
        this.vendas = new ArrayList<>();
    }

    public void criarVenda(int id, LocalDate data, Pedido pedido) {
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
