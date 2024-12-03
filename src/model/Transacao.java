package src.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public abstract class Transacao implements Calculavel {


    private int id;
    private LocalDate data;
    protected BigDecimal valorTotal;

    public Transacao(int id, LocalDate data) {
        this.id = id;
        this.data = data;
        this.valorTotal = BigDecimal.valueOf(0.0);
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

}



