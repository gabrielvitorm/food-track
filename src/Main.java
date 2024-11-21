package src;

import src.model.*;
import src.service.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Pessoa funcionario = new Funcionario();
        Pessoa cliente = new Cliente();
        Transacao pedido = new Pedido();
        Transacao venda = new Venda();
        Produto produto = new Produto();
        ItemPedido itemPedido = new ItemPedido();
        Estoque estoque = new Estoque("coxinha", 30, 10);
        Fidelidade fidelidade = new Fidelidade();
        ClienteService cs = new ClienteService();
        PedidoService ps = new PedidoService();
        VendaService vs = new VendaService();
        EstoqueService es = new EstoqueService();
        FidelidadeService fs = new FidelidadeService();

        System.out.println("------------- Sistema de gereciamento de vendas -------------");

        int x,r;
        do {
            System.out.println("1 - Cadastrar Produto\n2 - Atualizar Estoque\n3 - Fazer Pedido\n4 - Consultar Pedidos\n5 - Finalizar Venda\n6 - Gerenciar Fidelidade\n7 - Relatório de Vendas");
            x = sc.nextInt();

            switch (x){
                case 1:
                    //Cadastrar Produto
                    break;
                case 2:
                    //Atualizar Estoque
                    break;
                case 3:
                    System.out.println("Digite o nome do cliente:");
                    ((Cliente)cliente).setNome(sc.next());
                    System.out.println("Digite o Id do cliente:");
                    ((Cliente)cliente).setId(sc.nextInt());
                    System.out.println("Digite o telefone do cliente");
                    ((Cliente)cliente).setNumeroTelefone(sc.nextLong());
                    cs.cadastrarCliente((Cliente)cliente);
                    System.out.println("Digite o nome do funcionário:");
                    ((Funcionario)funcionario).setNome(sc.next());
                    System.out.println(cs.listar());
                    break;
                case 4:
                    //Consultar Pedidos
                    break;
                case 5:
                    //Finalizar Venda
                    break;
                case 6:
                    //Gerenciar Fidelidade
                    break;
                case 7:
                    //Relatório de Vendas
                    break;
                default:
                    System.out.println("Opção Inválida!");
            }
            System.out.println("Para ver o menu novamente digite 0");
            r = sc.nextInt();
        }while (r==0);
    }
}
