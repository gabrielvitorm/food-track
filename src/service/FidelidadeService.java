package src.service;

import src.model.Fidelidade;

import java.util.ArrayList;

public class FidelidadeService {

    private ArrayList<Fidelidade> fidelidades;

    public FidelidadeService() {
        this.fidelidades = new ArrayList<>();
    }

    public void adicionarFidelidade(Fidelidade fidelidade) {
        fidelidades.add(fidelidade);
    }

    public void incrementarContador(int clienteId) {
        for (Fidelidade fidelidade : fidelidades) {
            if (fidelidade.getClienteId() == clienteId) {
                fidelidade.incrementarContador();
                System.out.println("Coxinha comprada! Total de coxinhas: " + fidelidade.getContadorCoxinhas());
                return;
            }
        }
        System.out.println("Cliente não encontrado.");
    }

    public void checarRecompensa(int clienteId) {
        for (Fidelidade fidelidade : fidelidades) {
            if (fidelidade.getClienteId() == clienteId) {
                fidelidade.checarRecompensa();
                return;
            }
        }
        System.out.println("Cliente não encontrado.");
    }

    public void listarFidelidades() {
        for (Fidelidade fidelidade : fidelidades) {
            System.out.println(fidelidade);
        }
    }

    public static void main(String[] args) {
        FidelidadeService fidelidadeService = new FidelidadeService();

        // Adicionando clientes ao programa de fidelidade
        fidelidadeService.adicionarFidelidade(new Fidelidade(1));
        fidelidadeService.adicionarFidelidade(new Fidelidade(2));

        // Simulando compras e verificando recompensas
        for (int i = 0; i < 15; i++) {
            fidelidadeService.incrementarContador(1);
            fidelidadeService.checarRecompensa(1);
        }

        // Listando todos os programas de fidelidade
        fidelidadeService.listarFidelidades();
    }
}
