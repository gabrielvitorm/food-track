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

    public Map<String, Integer> getEstoqueAtual() {
        return estoqueAtual;
    }

    public Map<String, Integer> getEstoqueMinimo() {
        return estoqueMinimo;
    }

    public void setEstoqueAtual(String ingrediente, int quantidade) {
        this.estoqueAtual.put(ingrediente, quantidade);
    }

    public void setEstoqueMinimo(String ingrediente, int quantidadeMinima) {
        this.estoqueMinimo.put(ingrediente, quantidadeMinima);
    }
}
