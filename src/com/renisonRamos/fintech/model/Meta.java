package com.renisonRamos.fintech.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Meta {
    private int id;
    private String descricao;
    private double valorMeta;
    private double valorAtual;
    private LocalDate dataCriacao; // Usando LocalDate
    private LocalDate dataPrevista; // Usando LocalDate
    private int idUsuario; // ID do usuário que criou a meta

    public Meta() {} // Construtor padrão

    // Construtor com tratamento de exceções para datas
    public Meta(int id, String descricao, double valorMeta, double valorAtual, String dataCriacao, String dataPrevista, int idUsuario) {
        this.id = id;
        this.descricao = descricao;
        this.valorMeta = valorMeta;
        this.valorAtual = valorAtual;
        this.idUsuario = idUsuario;
        try {
            this.dataCriacao = LocalDate.parse(dataCriacao, DateTimeFormatter.ISO_DATE);
            this.dataPrevista = LocalDate.parse(dataPrevista, DateTimeFormatter.ISO_DATE);
        } catch (DateTimeParseException e) {
            System.err.println("Formato de data inválido. Usando data atual.");
            this.dataCriacao = LocalDate.now();
            this.dataPrevista = LocalDate.now(); // Define a data prevista como hoje caso o formato esteja errado.
        }
    }

    public void atualizarProgresso(double valor) {
        if (valor >= 0) { //Verifica se o valor adicionado é positivo
            this.valorAtual += valor;
            System.out.println("Atualizando progresso da meta: " + descricao + ". Valor adicionado: R$" + valor);
        } else {
            System.out.println("Valor inválido para atualização de progresso.");
        }

    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValorMeta() {
        return valorMeta;
    }

    public void setValorMeta(double valorMeta) {
        this.valorMeta = valorMeta;
    }

    public double getValorAtual() {
        return valorAtual;
    }

    public void setValorAtual(double valorAtual) {
        this.valorAtual = valorAtual;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public LocalDate getDataPrevista() {
        return dataPrevista;
    }

    public void setDataPrevista(LocalDate dataPrevista) {
        this.dataPrevista = dataPrevista;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
}