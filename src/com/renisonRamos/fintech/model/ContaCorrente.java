package com.renisonRamos.fintech.model;

public class ContaCorrente extends Conta {
    private double limite;

    public ContaCorrente() {
        super(); // Chama o construtor padrão da superclasse Conta
    }

    public ContaCorrente(int id, double saldo, int idUsuario, double limite) {
        super(id, saldo, idUsuario); // Chama o construtor da superclasse Conta
        this.limite = limite;
    }




    // Metodos Depositar e Sacar
    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            double novoSaldo = super.getSaldo() + valor; // Use getter para obter o saldo atual
            super.setSaldo(novoSaldo); // Use setter para atualizar o saldo
            System.out.println("Depositando R$" + valor + " na conta corrente. Saldo atual: R$" + novoSaldo);
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }




    @Override
    public void sacar(double valor) {
        if (valor > 0 && super.getSaldo() + this.limite >= valor) { // Use getter para obter o saldo
            double novoSaldo = super.getSaldo() - valor; // Use getter e calcule novo saldo
            super.setSaldo(novoSaldo); // Use setter para atualizar o saldo
            System.out.println("Sacando R$" + valor + " da conta corrente. Saldo atual: R$" + novoSaldo);
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }

    // Getters e setters
    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }




    // Outros getters e setters (herdados da classe Conta)
    public int getId() { return super.getId(); }
    public void setId(int id) { super.setId(id); }
    public double getSaldo() { return super.getSaldo(); }
    public void setSaldo(double saldo) { super.setSaldo(saldo); }
    public int getIdUsuario() { return super.getIdUsuario(); }
    public void setIdUsuario(int idUsuario) { super.setIdUsuario(idUsuario); }
}