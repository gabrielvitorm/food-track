package src.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ItemPedido extends Pedido implements Calculavel {

    private Produto produto;
    private int quantidade;
    private BigDecimal subtotal;

    public BigDecimal calcularValor() {
        calcularSubtotal();
        return subtotal;
    }
    private void calcularSubtotal() {
        if (produto != null) {
            this.subtotal = BigDecimal.valueOf((long) produto.getPreco() * quantidade);
        }
    }
    public Produto getProduto() {
        return produto;
    }
    public void setProduto(Produto produto) {
        this.produto = produto;
        calcularSubtotal();
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
        calcularSubtotal();
    }
    @Override
    public String toString() {
        return String.format(
                "ItemPedido {\n" +
                        "  Produto: %s\n" +
                        "  Quantidade: %d\n" +
                        "  Subtotal: %s\n" +
                        "}",
                produto != null ? produto.getNome() : "Nenhum produto",
                quantidade,
                subtotal
        );
    }
    public BigDecimal getSubtotal() {
        return subtotal;
    }
}
