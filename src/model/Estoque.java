package src.model;

public final class Estoque {

    private int qtdProduto, qtdMinima;
    private String produto;

    public Estoque(String produto, int qtdProduto, int qtdMinima){
        this.produto = produto;
        this.qtdProduto = qtdProduto;
        this.qtdMinima = qtdMinima;
    }

    public int getQtdProduto() {
        return qtdProduto;
    }

    public void setQtdProduto(int qtdProduto) {
        this.qtdProduto = qtdProduto;
    }

    public int getQtdMinima() {
        return qtdMinima;
    }

    public void setQtdMinima(int qtdMinima) {
        this.qtdMinima = qtdMinima;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public void atualizarQuantidade(){
        qtdProduto -= qtdProduto;
    }

    public void verificarEstoqueMinimo(){

    }
}
