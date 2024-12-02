package src.model;

import java.math.BigDecimal;

public class Produto {

    private final int id;
    private BigDecimal preco;
    private String nome;

    public Produto(int id, String nome, BigDecimal preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }
    
    public Produto(){
        id = 0;
    }
    
    public Produto(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return String.format(
                "Produto {\n" +
                        "  ID: %d\n" +
                        "  Nome: %s\n" +
                        "  Preço: %s\n" +
                        "}",
                id,
                nome,
                preco
        );
    }
}
