package src.model;

import src.enums.StatusPedido;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pedido extends Transacao implements Calculavel, ProcessoCozinha {

    private List<ItemPedido> itens;
    private StatusPedido statusPedido;
    private Cliente cliente;
    private Funcionario funcionario;

    public void setItens(List<ItemPedido> itens) {
        this.itens = itens;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Pedido(int id, LocalDate data) {
        super(id, data);
        this.itens = new ArrayList<>();
        this.statusPedido = StatusPedido.A_FAZER;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public void adicionarItem(ItemPedido item) {
        itens.add(item);
        calcularValorTotal();
    }

    public StatusPedido getStatusPedido() {
        return statusPedido;
    }

    public void setStatusPedido(StatusPedido statusPedido) {
        this.statusPedido = statusPedido;
    }

    @Override
    public void calcularValorTotal() {
        BigDecimal valorTotal = BigDecimal.ZERO;
        for (ItemPedido item : itens) {
            valorTotal = valorTotal.add(item.calcularValor());
        }
        this.valorTotal = valorTotal;
    }

    @Override
    public void atualizarStatus() {
        // Implementar lógica para atualizar o status do pedido
        if (statusPedido == StatusPedido.A_FAZER) {
            statusPedido = StatusPedido.FEITO;
        } else if (statusPedido == StatusPedido.FEITO) {
            statusPedido = StatusPedido.ENTREGUE;
        }
    }

    @Override
    public String toString() {
        return String.format(
                "Pedido {\n" +
                        "  ID: %d\n" +
                        "  Data: %s\n" +
                        "  Itens: %s\n" +
                        "  Status: %s\n" +
                        "  Valor Total: %s\n" +
                        "}",
                getId(),
                getData(),
                itens,
                statusPedido,
                valorTotal
        );
    }

    @Override
    public BigDecimal calcularTotal() {
        return null;
    }
}
