package src.model;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Classe abstrata que representa uma transação.
 */
public abstract class Transacao {

    private final int id; // ID da transação, imutável após a criação
    private final LocalDate data; // Data da transação, imutável após a criação
    protected BigDecimal valorTotal; // Valor total da transação

    public Transacao(int id, LocalDate data) {
        this.id = id;
        this.data = data;
        this.valorTotal = BigDecimal.ZERO; // Inicializa o valor total como zero
    }

    public int getId() {
        return id;
    }

    public LocalDate getData() {
        return data;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public abstract void calcularValorTotal();

    @Override
    public String toString() {
        return String.format(
                "Transacao {\n" +
                        "  ID: %d\n" +
                        "  Data: %s\n" +
                        "  Valor Total: %s\n" +
                        "}",
                id,
                data,
                valorTotal
        );
    }
}
