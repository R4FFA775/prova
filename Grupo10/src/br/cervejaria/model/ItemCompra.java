package br.cervejaria.model;

public class ItemCompra {
    private Cerveja cerveja;
    private int quantidade;
    private double precoUnitario;
    private double desconto;
    private double subtotal;
    private String lote;
    private String validade;
    private String observacao;

    public ItemCompra(Cerveja cerveja, int quantidade, double precoUnitario, double desconto, String lote, String validade, String observacao) {
        this.cerveja = cerveja;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
        this.desconto = desconto;
        this.lote = lote;
        this.validade = validade;
        this.observacao = observacao;
        this.subtotal = calcularSubtotal();
    }

    public double calcularSubtotal() {
        return (precoUnitario * quantidade) - desconto;
    }

    public double getSubtotal() {
        return subtotal;
    }
    // Getters, setters e métodos adicionais
}