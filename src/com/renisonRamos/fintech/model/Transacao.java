package com.renisonRamos.fintech.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Transacao {
    private int id;
    private String tipo; // "deposito", "saque", "transferencia"
    private double valor;
    private int idConta; // ID da conta envolvida na transação
    private LocalDate data;

    public Transacao() {}

    // Construtor que recebe a data como String e converte para LocalDate.

    public Transacao(int id, String tipo, double valor, int idConta, String data) {
        this.id = id;
        this.tipo = tipo;
        this.valor = valor;
        this.idConta = idConta;
        try {
            this.data = LocalDate.parse(data, DateTimeFormatter.ISO_DATE);
        } catch (DateTimeParseException e) {
            System.err.println("Formato de data inválido: " + data);



            this.data = LocalDate.now(); // Data atual como padrão caso a data passada seja inválida.
        }
    }

    public void registrarTransacao() {
        System.out.println("Registrando transação de tipo: " + tipo + " no valor de R$" + valor + " na data: " + data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getIdConta() {
        return idConta;
    }

    public void setIdConta(int idConta) {
        this.idConta = idConta;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    //Método para setar a data usando uma String
    public void setData(String data) {
        try {
            this.data = LocalDate.parse(data, DateTimeFormatter.ISO_DATE);
        } catch (DateTimeParseException e) {
            System.err.println("Formato de data inválido: " + data);


            this.data = LocalDate.now();
        }
    }

}