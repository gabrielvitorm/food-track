package src;

import src.model.*;
import src.service.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ClienteService clienteService = new ClienteService();
        PedidoService pedidoService = new PedidoService();
        VendaService vendaService = new VendaService();
        EstoqueService estoqueService = new EstoqueService();
        FidelidadeService fidelidadeService = new FidelidadeService();

        System.out.println("------------- Sistema de Gerenciamento de Vendas -------------");

        int opcaoPrincipal;
        do {
            System.out.println("\n1 - Menu de Produto");
            System.out.println("2 - Menu de Pedido");
            System.out.println("3 - Menu de Venda");
            System.out.println("4 - Menu de Fidelidade");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcaoPrincipal = sc.nextInt();

            switch (opcaoPrincipal) {
                case 1:
                    int subMenuProduto;
                    do {
                        System.out.println("\n1 - Cadastrar Produto");
                        System.out.println("2 - Atualizar Produto");
                        System.out.println("3 - Ver Estoque");
                        System.out.println("4 - Apagar Produto");
                        System.out.println("5 - Ver Produtos Acabando");
                        System.out.println("0 - Voltar");
                        System.out.print("Escolha uma opção: ");
                        subMenuProduto = sc.nextInt();

                        switch (subMenuProduto) {
                            case 1:
                                System.out.println("Digite o nome do produto: ");
                                String nomeProduto = sc.next();
                                System.out.println("Digite o preço do produto: ");
                                BigDecimal precoProduto = sc.nextBigDecimal();
                                System.out.println("Digite a quantidade inicial: ");
                                int quantidadeInicial = sc.nextInt();
                                System.out.println("Digite a quantidade mínima: ");
                                int quantidadeMinima = sc.nextInt();
                                Produto produto = new Produto(1, nomeProduto, precoProduto); // ID fixo para exemplo
                                estoqueService.adicionarIngrediente(nomeProduto, quantidadeInicial, quantidadeMinima);
                                break;
                            case 2:
                                System.out.println("Digite o nome do produto a ser atualizado: ");
                                String produtoAtualizar = sc.next();
                                System.out.println("Digite o novo preço do produto: ");
                                BigDecimal novoPreco = sc.nextBigDecimal();
                                estoqueService.atualizarQuantidade(produtoAtualizar, novoPreco.intValue());
                                break;
                            case 3:
                                estoqueService.exibirStatusEstoque();
                                break;
                            case 4:
                                System.out.println("Digite o nome do produto a ser apagado: ");
                                String produtoApagar = sc.next();
                                estoqueService.removerIngrediente(produtoApagar);
                                break;
                            case 5:
                                estoqueService.verificarProdutosAcabando();
                                break;
                            case 0:
                                System.out.println("Voltando ao menu principal...");
                                break;
                            default:
                                System.out.println("Opção inválida!");
                        }
                    } while (subMenuProduto != 0);
                    break;

                case 2:
                    int subMenuPedido;
                    do {
                        System.out.println("\n1 - Fazer Pedido");
                        System.out.println("2 - Ver Pedidos");
                        System.out.println("3 - Finalizar Pedido");
                        System.out.println("4 - Alterar Pedido");
                        System.out.println("5 - Deletar Pedido");
                        System.out.println("0 - Voltar");
                        System.out.print("Escolha uma opção: ");
                        subMenuPedido = sc.nextInt();

                        switch (subMenuPedido) {
                            case 1:
                                Cliente clientePedido = new Cliente();
                                System.out.println("Digite o nome do cliente: ");
                                clientePedido.setNome(sc.next());
                                System.out.println("Digite o telefone do cliente: ");
                                clientePedido.setTelefone(sc.nextLong());
                                clienteService.cadastrarCliente(clientePedido);

                                Funcionario funcionarioPedido = new Funcionario();
                                System.out.println("Digite o nome do funcionário: ");
                                funcionarioPedido.setNome(sc.next());

                                System.out.println("Digite o ID do pedido: ");
                                int pedidoId = sc.nextInt();
                                Pedido pedido = new Pedido(pedidoId, LocalDate.now());
                                pedido.setCliente(clientePedido);
                                pedido.setFuncionario(funcionarioPedido);
                                pedidoService.criarPedido(pedido);
                                break;
                            case 2:
                                pedidoService.listarPedidos();
                                break;
                            case 3:
                                System.out.println("Digite o ID do pedido para finalizar: ");
                                int idFinalizarPedido = sc.nextInt();
                                pedidoService.atualizarStatusPedido(idFinalizarPedido, StatusPedido.ENTREGUE);
                                break;
                            case 4:
                                System.out.println("Digite o ID do pedido para alterar: ");
                                int idAlterarPedido = sc.nextInt();
                                Pedido pedidoAlterado = pedidoService.buscarPedidoPorId(idAlterarPedido);
                                if (pedidoAlterado != null) {
                                    System.out.println("Digite o novo status do pedido: ");
                                    String novoStatus = sc.next();
                                    pedidoAlterado.setStatusPedido(StatusPedido.valueOf(novoStatus));
                                    pedidoService.atualizarStatusPedido(idAlterarPedido, pedidoAlterado);
                                } else {
                                    System.out.println("Pedido não encontrado!");
                                }
                                break;
                            case 5:
                                System.out.println("Digite o ID do pedido para deletar: ");
                                int idDeletarPedido = sc.nextInt();
                                pedidoService.deletarPedido(idDeletarPedido);
                                break;
                            case 0:
                                System.out.println("Voltando ao menu principal...");
                                break;
                            default:
                                System.out.println("Opção inválida!");
                        }
                    } while (subMenuPedido != 0);
                    break;

                case 3:
                    int subMenuVenda;
                    do {
                        System.out.println("\n1 - Criar Venda");
                        System.out.println("2 - Ver Vendas");
                        System.out.println("0 - Voltar");
                        System.out.print("Escolha uma opção: ");
                        subMenuVenda = sc.nextInt();

                        switch (subMenuVenda) {
                            case 1:
                                System.out.println("Digite o ID da venda: ");
                                int vendaId = sc.nextInt();
                                System.out.println("Digite o ID do pedido associado: ");
                                int idPedidoVenda = sc.nextInt();
                                Pedido pedidoVenda = pedidoService.buscarPedidoPorId(idPedidoVenda);
                                if (pedidoVenda != null) {
                                    Venda venda = new Venda(vendaId, LocalDate.now(), pedidoVenda);
                                    vendaService.criarVenda(venda);
                                    System.out.println("Venda criada com sucesso!");
                                } else {
                                    System.out.println("Pedido não encontrado!");
                                }
                                break;
                            case 2:
                                vendaService.listarVendas();
                                break;
                            case 0:
                                System.out.println("Voltando ao menu principal...");
                                break;
                            default:
                                System.out.println("Opção inválida!");
                        }
                    } while (subMenuVenda != 0);
                    break;

                case 4:
                    int subMenuFidelidade;
                    do {
                        System.out.println("\n1 - Adicionar Fidelidade");
                        System.out.println("2 - Incrementar Contador de Fidelidade");
                        System.out.println("3 - Ver Recompensa de Fidelidade");
                        System.out.println("0 - Voltar");
                        System.out.print("Escolha uma opção: ");
                        subMenuFidelidade = sc.nextInt();

                        switch (subMenuFidelidade) {
                            case 1:
                                System.out.println("Digite o ID do cliente para fidelidade: ");
                                int clienteId = sc.nextInt();
                                Fidelidade fidelidade = new Fidelidade(clienteId);
                                fidelidadeService.adicionarFidelidade(fidelidade);
                                System.out.println("Fidelidade adicionada com sucesso!");
                                break;
                            case 2:
                                System.out.println("Digite o ID do cliente para incrementar o contador de fidelidade: ");
                                int idIncrementarFidelidade = sc.nextInt();
                                fidelidadeService.incrementarContador(idIncrementarFidelidade);
                                break;
                            case 3:
                                System.out.println("Digite o ID do cliente para verificar a recompensa: ");
                                int idVerificarFidelidade = sc.nextInt();
                                fidelidadeService.checarRecompensa(idVerificarFidelidade);
                                break;
                            case 0:
                                System.out.println("Voltando ao menu principal...");
                                break;
                            default:
                                System.out.println("Opção inválida!");
                        }
                    } while (subMenuFidelidade != 0);
                    break;

                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção Inválida!");
            }
        } while (opcaoPrincipal != 0);

        sc.close();
    }
}
