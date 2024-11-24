package src.model;

import java.util.HashMap;
import java.util.Map;

public class Estoque {

    private Map<String, Integer> estoqueAtual;
    private Map<String, Integer> estoqueMinimo;


    public Estoque() {
        this.estoqueAtual = new HashMap<>();
        this.estoqueMinimo = new HashMap<>();
    }


    public void adicionarIngrediente(String ingrediente, int quantidadeInicial, int quantidadeMinima) {
        estoqueAtual.put(ingrediente, quantidadeInicial);
        estoqueMinimo.put(ingrediente, quantidadeMinima);
        System.out.println("Ingrediente " + ingrediente + " adicionado com sucesso!");
    }


    public void atualizarQuantidade(String ingrediente, int novaQuantidade) {
        if (estoqueAtual.containsKey(ingrediente)) {
            estoqueAtual.put(ingrediente, novaQuantidade);
            System.out.println("Quantidade do ingrediente " + ingrediente + " atualizada para: " + novaQuantidade);
        } else {
            System.out.println("Ingrediente " + ingrediente + " não encontrado no estoque.");
        }
    }


    public void verificarEstoqueMinimo(String ingrediente) {
        if (estoqueAtual.containsKey(ingrediente)) {
            int quantidadeAtual = estoqueAtual.get(ingrediente);
            int quantidadeMin = estoqueMinimo.get(ingrediente);

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
        for (String ingrediente : estoqueAtual.keySet()) {
            int quantidadeAtual = estoqueAtual.get(ingrediente);
            int quantidadeMin = estoqueMinimo.get(ingrediente);
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
