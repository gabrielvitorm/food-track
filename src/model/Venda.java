package src.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Venda extends Transacao implements Calculavel {

    private Pedido pedido;

    public Venda(int id, LocalDate data, Pedido pedido) {
        super(id, data);
        this.pedido = pedido;
        calcularValorTotal();
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
        calcularValorTotal();
    }

    @Override
    public void calcularValorTotal() {
        if (pedido != null) {
            valorTotal = pedido.calcularTotal();
        } else {
            valorTotal = BigDecimal.ZERO;
        }
    }

    @Override
    public BigDecimal calcularTotal() {
        return valorTotal;
    }

    @Override
    public String toString() {
        return String.format(
                "Venda {\n" +
                        "  ID: %d\n" +
                        "  Data: %s\n" +
                        "  Pedido: %s\n" +
                        "  Valor Total: %s\n" +
                        "}",
                getId(),
                getData(),
                pedido != null ? pedido.toString() : "Nenhum pedido",
                valorTotal
        );
    }
}
