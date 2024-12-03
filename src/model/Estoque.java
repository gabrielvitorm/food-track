package src.model;

import java.util.ArrayList;
import java.util.List;

public class Estoque {

    private List<Ingrediente> ingredientes;
    private int estoqueAtual;

    public Estoque() {
        this.ingredientes = new ArrayList<>();
    }

    public void adicionarIngrediente(String nome, int quantidadeAtual, int quantidadeMinima) {
        Ingrediente ingrediente = new Ingrediente(nome, quantidadeAtual, quantidadeMinima);
        ingredientes.add(ingrediente);
    }

    public void atualizarIngrediente(String nome, int novaQuantidade) {
        for (Ingrediente ingrediente : ingredientes) {
            if (ingrediente.getNome().equals(nome)) {
                ingrediente.setQuantidadeAtual(novaQuantidade);
                return;
            }
        }
        System.out.println("Ingrediente " + nome + " não encontrado no estoque.");
    }

    public void verificarEstoqueMinimo(String nome) {
        for (Ingrediente ingrediente : ingredientes) {
            if (ingrediente.getNome().equals(nome)) {
                if (ingrediente.getQuantidadeAtual() < ingrediente.getQuantidadeMinima()) {
                    System.out.println("Atenção! O estoque de " + nome + " está abaixo do mínimo.");
                } else {
                    System.out.println("Estoque de " + nome + " está em nível adequado.");
                }
                return;
            }
        }
        System.out.println("Ingrediente " + nome + " não encontrado no estoque.");
    }

    public void exibirStatusEstoque() {
        System.out.println("\n--- Status Atual do Estoque ---");
        for (Ingrediente ingrediente : ingredientes) {
            System.out.println("Ingrediente: " + ingrediente.getNome());
            System.out.println("Quantidade Atual: " + ingrediente.getQuantidadeAtual());
            System.out.println("Quantidade Mínima: " + ingrediente.getQuantidadeMinima());
            if (ingrediente.getQuantidadeAtual() < ingrediente.getQuantidadeMinima()) {
                System.out.println("Status: Abaixo do mínimo!");
            } else {
                System.out.println("Status: OK!");
            }
            System.out.println("--------------------------------");
        }
    }

    public void setEstoqueAtual(int i) {
        this.estoqueAtual = i;
    }

    public void setEstoqueMinimo(int i) {
    }

    public int getEstoqueAtual() {
        return 0;
    }

    public int getEstoqueMinimo() {
        return 0;
    }

    private static class Ingrediente {
        private String nome;
        private int quantidadeAtual;
        private int quantidadeMinima;

        public Ingrediente(String nome, int quantidadeAtual, int quantidadeMinima) {
            this.nome = nome;
            this.quantidadeAtual = quantidadeAtual;
            this.quantidadeMinima = quantidadeMinima;
        }

        public String getNome() {
            return nome;
        }

        public int getQuantidadeAtual() {
            return quantidadeAtual;
        }

        public void setQuantidadeAtual(int quantidadeAtual) {
            this.quantidadeAtual = quantidadeAtual;
        }

        public int getQuantidadeMinima() {
            return quantidadeMinima;
        }
    }
}
