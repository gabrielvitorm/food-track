package src.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public abstract class Transacao implements Calculavel {


    private int id;
    private LocalDate data;
    protected BigDecimal valorTotal;

    // Construtor
    public Transacao(int id, LocalDate data) {
        this.id = id;
        this.data = data;
        this.valorTotal = BigDecimal.valueOf(0.0); // Inicializado como 0, calculado posteriormente.
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public LocalDate getData() {
        return data;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    // Método abstrato
    public abstract void calcularValorTotal();

}



