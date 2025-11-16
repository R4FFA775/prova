package br.cervejaria.model;

public class Caixa {
    private double saldo;
    private String responsavel;
    private String dataAbertura;
    private String dataFechamento;
    private String status;
    private String observacao;
    private String tipoCaixa;
    private String localizacao;

    public Caixa(double saldo, String responsavel, String dataAbertura, String dataFechamento, String status, String observacao, String tipoCaixa, String localizacao) {
        this.saldo = saldo;
        this.responsavel = responsavel;
        this.dataAbertura = dataAbertura;
        this.dataFechamento = dataFechamento;
        this.status = status;
        this.observacao = observacao;
        this.tipoCaixa = tipoCaixa;
        this.localizacao = localizacao;
    }
    // Getters, setters e métodos adicionais
}