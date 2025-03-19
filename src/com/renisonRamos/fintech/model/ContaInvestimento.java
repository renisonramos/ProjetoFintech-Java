package com.renisonRamos.fintech.model;

public class ContaInvestimento extends Conta {
    private double rendimentoMensal;

    public ContaInvestimento() {
        super();
    }

    public ContaInvestimento(int id, double saldo, int idUsuario, double rendimentoMensal) {
        super(id, saldo, idUsuario);
        this.rendimentoMensal = rendimentoMensal;
    }



    // Metodo para calcular os juros
    public void calcularJuros() {
        double juros = super.getSaldo() * (this.rendimentoMensal / 100); // Usa o getter para acessar o saldo
        double novoSaldo = super.getSaldo() + juros;
        super.setSaldo(novoSaldo); // Usa o setter para atualizar o saldo
        System.out.println("Juros calculados: R$ " + juros + " Saldo atualizado: R$ " + novoSaldo);
    }



    // Getters e setters
    public double getRendimentoMensal() {
        return rendimentoMensal;
    }

    public void setRendimentoMensal(double rendimentoMensal) {
        this.rendimentoMensal = rendimentoMensal;
    }



    // Outros getters e setters (herdados da classe Conta)
    public int getId() {
        return super.getId();
    }

    public void setId(int id) {
        super.setId(id);
    }

    public double getSaldo() {
        return super.getSaldo();
    }

    public void setSaldo(double saldo) {
        super.setSaldo(saldo);
    }

    public int getIdUsuario() {
        return super.getIdUsuario();
    }

    public void setIdUsuario(int idUsuario) {
        super.setIdUsuario(idUsuario);
    }
}