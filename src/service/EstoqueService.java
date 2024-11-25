package src.service;

import src.model.Estoque;

public class EstoqueService {

    private Estoque estoque;

    public EstoqueService(Estoque estoque) {
        this.estoque = estoque;
    }

    public void adicionarIngrediente(String ingrediente, int quantidadeInicial, int quantidadeMinima) {
        estoque.setEstoqueAtual(ingrediente, quantidadeInicial);
        estoque.setEstoqueMinimo(ingrediente, quantidadeMinima);
        System.out.println("Ingrediente " + ingrediente + " adicionado com sucesso!");
    }

    public void atualizarQuantidade(String ingrediente, int novaQuantidade) {
        if (estoque.getEstoqueAtual().containsKey(ingrediente)) {
            estoque.setEstoqueAtual(ingrediente, novaQuantidade);
            System.out.println("Quantidade do ingrediente " + ingrediente + " atualizada para: " + novaQuantidade);
        } else {
            System.out.println("Ingrediente " + ingrediente + " não encontrado no estoque.");
        }
    }

    public void verificarEstoqueMinimo(String ingrediente) {
        if (estoque.getEstoqueAtual().containsKey(ingrediente)) {
            int quantidadeAtual = estoque.getEstoqueAtual().get(ingrediente);
            int quantidadeMin = estoque.getEstoqueMinimo().get(ingrediente);

            if (quantidadeAtual < quantidadeMin) {
                System.out.println("Atenção! O estoque de " + ingrediente + " está abaixo do mínimo.");
            } else {
                System.out.println("Estoque de " + ingrediente + " está em nível adequado.");
            }
        } else {
            System.out.println("Ingrediente " + ingrediente + " não encontrado no estoque.");
        }
    }

    public void exibirStatusEstoque() {
        System.out.println("\n--- Status Atual do Estoque ---");
        for (String ingrediente : estoque.getEstoqueAtual().keySet()) {
            int quantidadeAtual = estoque.getEstoqueAtual().get(ingrediente);
            int quantidadeMin = estoque.getEstoqueMinimo().get(ingrediente);
            System.out.println("Ingrediente: " + ingrediente);
            System.out.println("Quantidade Atual: " + quantidadeAtual);
            System.out.println("Quantidade Mínima: " + quantidadeMin);
            if (quantidadeAtual < quantidadeMin) {
                System.out.println("Status: Abaixo do mínimo!");
            } else {
                System.out.println("Status: OK!");
            }
            System.out.println("--------------------------------");
        }
    }
}
