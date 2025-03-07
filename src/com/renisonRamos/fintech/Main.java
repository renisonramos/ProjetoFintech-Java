package com.renisonRamos.fintech;

import com.renisonRamos.fintech.model.Conta;
import com.renisonRamos.fintech.model.Meta;
import com.renisonRamos.fintech.model.Transacao;
import com.renisonRamos.fintech.model.Usuario;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- Menu Fintech ---");
            System.out.println("1. Testar Usuario");
            System.out.println("2. Testar Conta");
            System.out.println("3. Testar Transacao");
            System.out.println("4. Testar Meta");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    testarUsuario(scanner);
                    break;
                case 2:
                    testarConta(scanner);
                    break;
                case 3:
                    testarTransacao(scanner);
                    break;
                case 4:
                    testarMeta(scanner);
                    break;
                case 0:
                    System.out.println("Saindo do programa.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        scanner.close();
    }

    // Métodos para testar as classes

    static void testarUsuario(Scanner scanner) {
        System.out.print("Digite o nome do usuário: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o email do usuário: ");
        String email = scanner.nextLine();
        System.out.print("Digite a senha do usuário: ");
        String senha = scanner.nextLine();

        Usuario usuario = new Usuario(1, nome, email, senha);
        usuario.cadastrarUsuario();
    }

    static void testarConta(Scanner scanner) {
        System.out.print("Digite o ID do usuário: ");
        int idUsuario = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Digite o saldo inicial: ");
        double saldo = scanner.nextDouble();
        scanner.nextLine();

        Conta conta = new Conta(1, saldo, idUsuario);
        System.out.println("Conta criada com sucesso!");
        System.out.println("Saldo atual: R$ " + conta.getSaldo());
        System.out.print("Deseja depositar? (s/n): ");
        String respostaDeposito = scanner.nextLine();
        if (respostaDeposito.equalsIgnoreCase("s")) {
            System.out.print("Digite o valor do depósito: ");
            double valorDeposito = scanner.nextDouble();
            scanner.nextLine();
            conta.depositar(valorDeposito);
        }

        System.out.print("Deseja sacar? (s/n): ");
        String respostaSaque = scanner.nextLine();
        if (respostaSaque.equalsIgnoreCase("s")) {
            System.out.print("Digite o valor do saque: ");
            double valorSaque = scanner.nextDouble();
            scanner.nextLine();
            conta.sacar(valorSaque);
        }
        System.out.println("Saldo atual: R$ " + conta.getSaldo());
    }

    static void testarTransacao(Scanner scanner) {
        System.out.print("Digite o tipo da transação (deposito, saque, transferencia): ");
        String tipo = scanner.nextLine();
        System.out.print("Digite o valor da transação: ");
        double valor = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Digite o ID da conta: ");
        int idConta = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Digite a data da transação (AAAA-MM-DD): ");
        String data = scanner.nextLine();

        Transacao transacao = new Transacao(1, tipo, valor, idConta, data);
        transacao.registrarTransacao();
    }

    static void testarMeta(Scanner scanner) {
        System.out.print("Digite a descrição da meta: ");
        String descricao = scanner.nextLine();
        System.out.print("Digite o valor da meta: ");
        double valorMeta = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Digite o valor atual: ");
        double valorAtual = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Digite a data de criação (AAAA-MM-DD): ");
        String dataCriacao = scanner.nextLine();
        System.out.print("Digite a data prevista (AAAA-MM-DD): ");
        String dataPrevista = scanner.nextLine();
        System.out.print("Digite o ID do usuário: ");
        int idUsuario = scanner.nextInt();
        scanner.nextLine();


        Meta meta = new Meta(1, descricao, valorMeta, valorAtual, dataCriacao, dataPrevista, idUsuario);
        System.out.println("Meta criada com sucesso!");
        System.out.print("Deseja atualizar o progresso? (s/n): ");
        String resposta = scanner.nextLine();
        if (resposta.equalsIgnoreCase("s")) {
            System.out.print("Digite o valor a adicionar ao progresso: ");
            double valorProgresso = scanner.nextDouble();
            scanner.nextLine();
            meta.atualizarProgresso(valorProgresso);
        }
    }
}