package src;

import src.model.*;
import src.service.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ClienteService cs = new ClienteService();
        PedidoService ps = new PedidoService();
        VendaService vs = new VendaService();
        EstoqueService es = new EstoqueService();
        FidelidadeService fs = new FidelidadeService();

        System.out.println("------------- Sistema de gereciamento de vendas -------------");

        int x,r;
        do {
            System.out.println("1 - Menu de Produto\n2 - Menu de Pedido\n3 - Menu de Venda\n4 - Menu de Fidelidade");
            x = sc.nextInt();

            switch (x){
                case 1:
                    int d,k;
                    do {
                        System.out.println("1 - Cadastrar produto\n2 - Atualizar produto\n3 - Ver estoque\n4 - Apagar produto\5 - Ver produtos acabando");
                        d = sc.nextInt();
                        switch (d){
                            case 1:
                                Produto produto = new Produto();
                                Estoque estoque = new Estoque();
                                ItemPedido itemPedido = new ItemPedido();
                                Transacao pedido = new Pedido();
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                            default:
                                System.out.println("Opção inválida!");
                        }
                        System.out.println("Digite 0 para ver o menu novamente");
                        k = sc.nextInt();
                    }while (k == 0);
                    break;
                case 2:
                    int g,v;
                    do {
                        System.out.println("1 - Fazer Pedido\n2 - Ver pedidos\n3 - Finalizar pedido\n4 - Alterar pedido\n5 - Deletar pedido");
                        g = sc.nextInt();
                        switch (g){
                            case 1:
                                Pessoa funcionario = new Funcionario();
                                Pessoa cliente = new Cliente();

                                System.out.println("Digite o nome do cliente:");
                                ((Cliente)cliente).setNome(sc.next());
                                System.out.println("Digite o telefone do cliente");
                                ((Cliente)cliente).setNumeroTelefone(sc.nextLong());
                                cs.cadastrarCliente((Cliente)cliente);
                                System.out.println("Digite o nome do funcionário:");
                                ((Funcionario)funcionario).setNome(sc.next());
                                System.out.println(cs.listar());
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                            case 5:
                                break;
                            default:
                                System.out.println("Opção Inválida!");
                        }
                        System.out.println("Para ver o menu novamente digite 0");
                        v = sc.nextInt();
                    }while (v == 0);
                    break;
                case 3:
                    Transacao venda = new Venda();
                    break;
                case 4:
                    Fidelidade fidelidade = new Fidelidade();
                    //Gerenciar Fidelidade
                    break;
                default:
                    System.out.println("Opção Inválida!");
            }
            System.out.println("Para ver o menu novamente digite 0");
            r = sc.nextInt();
        }while (r==0);
    }
}
