package src.service;

public class FidelidadeService {

    private int clienteId;
    private int contadorCoxinhas;

    public FidelidadeService() {
        this.clienteId = 0;
        this.contadorCoxinhas = 0;
    }

    public FidelidadeService(int clienteId) {
        this.clienteId = clienteId;
        this.contadorCoxinhas = 0;
    }

    public void incrementarContador() {
        contadorCoxinhas++;
        System.out.println("Coxinha comprada! Total de coxinhas: " + contadorCoxinhas);
    }

    public void checarRecompensa() {
        if (contadorCoxinhas >= 10) {
            System.out.println("Parabéns, você ganhou uma coxinha gratuita!");
            contadorCoxinhas -= 10;
        } else {
            System.out.println("Você ainda não tem direito à recompensa. Faltam " + (10 - contadorCoxinhas) + " coxinhas.");
        }
    }

    public int getClienteId() {
        return clienteId;
    }

    public static void main(String[] args) {
        FidelidadeService fs = new FidelidadeService();
        FidelidadeService fidelidade = new FidelidadeService(1);

        for (int i = 0; i < 15; i++) {
            fidelidade.incrementarContador();
            fidelidade.checarRecompensa();
        }
    }
}
