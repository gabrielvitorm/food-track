package src.model;
import java.time.LocalDate;

public abstract class Transacao {

    public abstract class transacao {
        private int id;
        private LocalDate data;
        protected double valorTotal;

        // Construtor
        public transacao(int id, LocalDate data) {
            this.id = id;
            this.data = data;
            this.valorTotal = 0.0;
        }

        public int getId() {
            return id;
        }

        public LocalDate getData() {
            return data;
        }

        public double getValorTotal() {
            return valorTotal;
        }
        public void calcularvalortotal() {
            System.out.println("O valor total atual na transação é: " + valorTotal);
        }
    }
}