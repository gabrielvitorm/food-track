package src.service;

import src.model.Estoque;

public class EstoqueService {

    private Estoque estoque;

    public EstoqueService() {
        this.estoque = new Estoque();
    }

    public void adicionarIngrediente(String nome, int quantidadeInicial, int quantidadeMinima) {
        estoque.adicionarIngrediente(nome, quantidadeInicial, quantidadeMinima);
        System.out.println("Ingrediente " + nome + " adicionado com sucesso!");
    }

    public void atualizarQuantidade(String nome, int novaQuantidade) {
        estoque.atualizarIngrediente(nome, novaQuantidade);
        System.out.println("Quantidade do ingrediente " + nome + " atualizada para: " + novaQuantidade);
    }

    public void verificarEstoqueMinimo(String nome) {
        estoque.verificarEstoqueMinimo(nome);
    }

    public void exibirStatusEstoque() {
        estoque.exibirStatusEstoque();
    }


    public void deletar(String produtoApagar) {
    }

    public void verificarEstoqueMinimo() {
    }
}
