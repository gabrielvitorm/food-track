package src.model;

public class Fidelidade {
    private int clienteId;
    private int contadorCoxinhas;

    public Fidelidade(int clienteId) {
        this.clienteId = clienteId;
        this.contadorCoxinhas = 0;
    }

    public Fidelidade() {

    }

    public void incrementarContador() {
        contadorCoxinhas++;
    }

    public void checarRecompensa() {
        if (contadorCoxinhas >= 10) {
            System.out.println("Parabéns, você ganhou uma coxinha gratuita!");
            contadorCoxinhas -= 10;
        }
    }

    public int getClienteId() {
        return clienteId;
    }

    public int getContadorCoxinhas() {
        return contadorCoxinhas;
    }

    @Override
    public String toString() {
        return String.format(
                "Fidelidade {\n" +
                        "  Cliente ID: %d\n" +
                        "  Contador de Coxinhas: %d\n" +
                        "}",
                clienteId,
                contadorCoxinhas
        );
    }
}
