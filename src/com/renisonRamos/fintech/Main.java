package com.renisonRamos.fintech;


import com.renisonRamos.fintech.model.Meta;
import com.renisonRamos.fintech.model.Transacao;
import com.renisonRamos.fintech.model.Usuario;
import com.renisonRamos.fintech.model.ContaCorrente;
import com.renisonRamos.fintech.model.ContaInvestimento;

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
            System.out.println("4. Testar Investimento");
            System.out.println("5. Testar Meta");

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
                    testarInvestimento(scanner);
                    break;
                case 5:
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
        scanner.nextLine(); //Consumir a quebra de linha
        System.out.print("Digite o saldo inicial: ");
        double saldo = scanner.nextDouble();
        scanner.nextLine(); //Consumir a quebra de linha
        System.out.print("Digite o limite da conta corrente: ");
        double limite = scanner.nextDouble();
        scanner.nextLine(); //Consumir a quebra de linha

        ContaCorrente contaCorrente = new ContaCorrente(1, saldo, idUsuario, limite); // Crie uma ContaCorrente
        System.out.println("Conta corrente criada com sucesso!");
        System.out.println("Saldo atual: R$ " + contaCorrente.getSaldo());
        System.out.println("Limite atual: R$ " + contaCorrente.getLimite()); //Mostra o limite

        System.out.print("Deseja depositar? (s/n): ");
        String respostaDeposito = scanner.nextLine();
        if (respostaDeposito.equalsIgnoreCase("s")) {
            System.out.print("Digite o valor do depósito: ");
            double valorDeposito = scanner.nextDouble();
            scanner.nextLine();
            contaCorrente.depositar(valorDeposito);
        }

        System.out.print("Deseja sacar? (s/n): ");
        String respostaSaque = scanner.nextLine();
        if (respostaSaque.equalsIgnoreCase("s")) {
            System.out.print("Digite o valor do saque: ");
            double valorSaque = scanner.nextDouble();
            scanner.nextLine();
            contaCorrente.sacar(valorSaque);
        }
        System.out.println("Saldo atual: R$ " + contaCorrente.getSaldo());
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


    static void testarInvestimento(Scanner scanner) {
        System.out.print("Digite o ID do usuário: ");
        int idUsuario = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Digite o saldo inicial: ");
        double saldo = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Digite o rendimento mensal (em %): ");
        double rendimento = scanner.nextDouble();
        scanner.nextLine();

        ContaInvestimento contaInv = new ContaInvestimento(1, saldo, idUsuario, rendimento);
        System.out.println("Conta de investimento criada com sucesso!");
        System.out.println("Saldo inicial: R$ " + contaInv.getSaldo());
        System.out.println("Rendimento mensal: " + contaInv.getRendimentoMensal() + "%");

        contaInv.calcularJuros();
        System.out.println("Saldo após cálculo de juros: R$ " + contaInv.getSaldo());
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