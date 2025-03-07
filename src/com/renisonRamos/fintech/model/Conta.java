package com.renisonRamos.fintech.model;

public class Conta {
    private int id;
    private double saldo;
    private int idUsuario; // ID do usuário dono da conta

    public Conta() {} // Construtor padrão

    public Conta(int id, double saldo, int idUsuario) {
        this.id = id;
        this.saldo = saldo;
        this.idUsuario = idUsuario;
    }

    public void depositar(double valor) {
        System.out.println("Depositando R$" + valor + " na conta.");
        if (valor > 0) { //Verificação básica para valores positivos.
            this.saldo += valor;
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void sacar(double valor) {
        System.out.println("Sacando R$" + valor + " da conta.");
        if (valor > 0 && this.saldo >= valor) { //Verificação para valores positivos e saldo suficiente.
            this.saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
}