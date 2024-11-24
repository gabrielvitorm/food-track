package src;

import src.model.Estoque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Menu de Gerenciamento de Estoque ---");
            System.out.println("1. Adicionar Ingrediente");
            System.out.println("2. Atualizar Quantidade");
            System.out.println("3. Verificar Estoque Mínimo");
            System.out.println("4. Exibir Status do Estoque");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome do ingrediente: ");
                    String nome = scanner.nextLine();
                    System.out.print("Quantidade inicial: ");
                    int quantidadeInicial = scanner.nextInt();
                    System.out.print("Quantidade mínima: ");
                    int quantidadeMinima = scanner.nextInt();
                    scanner.nextLine();
                    estoque.adicionarIngrediente(nome, quantidadeInicial, quantidadeMinima);
                    break;

                case 2:
                    System.out.print("Nome do ingrediente: ");
                    String ingredienteParaAtualizar = scanner.nextLine();
                    System.out.print("Nova quantidade: ");
                    int novaQuantidade = scanner.nextInt();
                    scanner.nextLine();
                    estoque.atualizarQuantidade(ingredienteParaAtualizar, novaQuantidade);
                    break;

                case 3:
                    System.out.print("Nome do ingrediente: ");
                    String ingredienteParaVerificar = scanner.nextLine();
                    estoque.verificarEstoqueMinimo(ingredienteParaVerificar);
                    break;

                case 4:
                    estoque.exibirStatusEstoque();
                    break;

                case 5:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}
