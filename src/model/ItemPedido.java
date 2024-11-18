package src.model;

public class ItemPedido {
    public class ItemPedido implements Calculavel {

        private Produto produto;
        private int quantidade;
        private double subtotal;


        public ItemPedido(Produto produto, int quantidade) {
            this.produto = produto;
            this.quantidade = quantidade;
            calcularSubtotal();
        }

        public double calcularValor() {
            calcularSubtotal();
            return subtotal;
        }

        private void calcularSubtotal() {
            if (produto != null) {
                this.subtotal = produto.getPreco() * quantidade;
            }
        }

        public Produto getProduto() {
            return produto;
        }

        public void setProduto(Produto produto) {
            this.produto = produto;
            calcularSubtotal();
        }

        public int getQuantidade() {
            return quantidade;
        }

        public void setQuantidade(int quantidade) {
            this.quantidade = quantidade;
            calcularSubtotal();
        }

        public double getSubtotal() {
            return subtotal;
        }
    }
