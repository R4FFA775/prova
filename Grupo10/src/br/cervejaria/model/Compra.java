package br.cervejaria.model;

import java.util.Date;
import java.util.List;

public class Compra extends Transacao {
    private Fornecedor fornecedor;
    private List<ItemCompra> itens;
    private double desconto;
    private double frete;
    private double imposto;
    private String comprador;
    private String observacaoCompra;
    private String tipoCompra;
    private String canalCompra;

    public Compra(String id, Date data, double valorTotal, String responsavel, String observacao, String status, String tipo, String formaPagamento, String clienteOuFornecedor, Fornecedor fornecedor, List<ItemCompra> itens, double desconto, double frete, double imposto, String comprador, String observacaoCompra, String tipoCompra, String canalCompra) {
        super(id, data, valorTotal, responsavel, observacao, status, tipo, formaPagamento, clienteOuFornecedor);
        this.fornecedor = fornecedor;
        this.itens = itens;
        this.desconto = desconto;
        this.frete = frete;
        this.imposto = imposto;
        this.comprador = comprador;
        this.observacaoCompra = observacaoCompra;
        this.tipoCompra = tipoCompra;
        this.canalCompra = canalCompra;
    }

    @Override
    public double calcularTotal() {
        double total = 0;
        for (ItemCompra item : itens) {
            total += item.getSubtotal();
        }
        total = total - desconto + frete + imposto;
        return total;
    }
    // Getters, setters e métodos adicionais
}