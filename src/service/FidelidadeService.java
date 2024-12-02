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

        fidelidadeService.adicionarFidelidade(new Fidelidade(1));
        fidelidadeService.adicionarFidelidade(new Fidelidade(2));

        for (int i = 0; i < 15; i++) {
            fidelidadeService.incrementarContador(1);
            fidelidadeService.checarRecompensa(1);
        }

        fidelidadeService.listarFidelidades();
    }

    private Fidelidade buscarFidelidadePorId(int clienteId) {
        return fidelidades.stream()
                .filter(f -> f.getClienteId() == clienteId)
                .findFirst()
                .orElse(null);
    }
}
