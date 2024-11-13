package src.model;

import src.enums.StatusPedido;

public class Pedido extends Transacao implements Calculavel, ProcessoCozinha {

    private String itens;
    public StatusPedido statusPedido;

    public String getItens() {
        return itens;
    }

    public void setItens(String itens) {
        this.itens = itens;
    }

    public StatusPedido getStatusPedido() {
        return statusPedido;
    }

    public void setStatusPedido(StatusPedido statusPedido) {
        this.statusPedido = statusPedido;
    }

    @Override
    public void calcularValorPedido() {

    }

    @Override
    public void atualizarStatus() {

    }
}
