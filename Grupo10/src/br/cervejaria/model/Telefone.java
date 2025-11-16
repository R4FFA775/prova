package br.cervejaria.model;

public class Telefone {
    private String ddd;
    private String numero;
    private String tipo;
    private String operadora;
    private String observacao;
    private boolean whatsapp;
    private String ramal;
    private String contato;

    public Telefone(String ddd, String numero, String tipo, String operadora, String observacao, boolean whatsapp, String ramal, String contato) {
        this.ddd = ddd;
        this.numero = numero;
        this.tipo = tipo;
        this.operadora = operadora;
        this.observacao = observacao;
        this.whatsapp = whatsapp;
        this.ramal = ramal;
        this.contato = contato;
    }
    // Getters, setters e métodos adicionais
}