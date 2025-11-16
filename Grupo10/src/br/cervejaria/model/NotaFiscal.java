package br.cervejaria.model;

public class NotaFiscal {
    private String numero;
    private String serie;
    private String dataEmissao;
    private String chaveAcesso;
    private String destinatario;
    private String emitente;
    private double valorTotal;
    private String observacao;

    public NotaFiscal(String numero, String serie, String dataEmissao, String chaveAcesso, String destinatario, String emitente, double valorTotal, String observacao) {
        this.numero = numero;
        this.serie = serie;
        this.dataEmissao = dataEmissao;
        this.chaveAcesso = chaveAcesso;
        this.destinatario = destinatario;
        this.emitente = emitente;
        this.valorTotal = valorTotal;
        this.observacao = observacao;
    }
    // Getters, setters e métodos adicionais
}