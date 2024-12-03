package src.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ItemPedido extends Pedido implements Calculavel {

    private Produto produto;
    private int quantidade;
    private BigDecimal subtotal;

    public ItemPedido(int id, LocalDate data) {
        super(id, data);
    }

    public BigDecimal calcularValor() {
        calcularSubtotal();
        return subtotal;
    }
    public void calcularSubtotal() {
        if (produto != null) {
            BigDecimal preco;

            if (produto.getPreco() instanceof BigDecimal) {
                preco = (BigDecimal) produto.getPreco();
            } else {
                preco = (BigDecimal) produto.getPreco();
            }

            BigDecimal quantidadeBigDecimal = BigDecimal.valueOf(quantidade);

            this.subtotal = preco.multiply(quantidadeBigDecimal);
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
