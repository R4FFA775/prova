package br.cervejaria.model;

import java.util.Date;
import java.util.List;

import java.io.Serializable;

public class Venda extends Transacao implements Serializable {
    private Cliente cliente;
    private List<ItemVenda> itens;
    private double desconto;
    private double acrescimo;
    private double valorPago;
    private String vendedor;
    private String observacaoVenda;
    private String tipoVenda;
    private String canalVenda;

    public Venda(String id, Date data, double valorTotal, String responsavel, String observacao, String status, String tipo, String formaPagamento, String clienteOuFornecedor, Cliente cliente, List<ItemVenda> itens, double desconto, double acrescimo, double valorPago, String vendedor, String observacaoVenda, String tipoVenda, String canalVenda) {
        super(id, data, valorTotal, responsavel, observacao, status, tipo, formaPagamento, clienteOuFornecedor);
        if (cliente == null || itens == null || itens.isEmpty()) {
            throw new IllegalArgumentException("Cliente e itens são obrigatórios.");
        }
        this.cliente = cliente;
        this.itens = itens;
        this.desconto = desconto;
        this.acrescimo = acrescimo;
        this.valorPago = valorPago;
        this.vendedor = vendedor;
        this.observacaoVenda = observacaoVenda;
        this.tipoVenda = tipoVenda;
        this.canalVenda = canalVenda;
    }

    @Override
    public double calcularTotal() {
        double total = 0;
        for (ItemVenda item : itens) {
            total += item.getSubtotal();
        }
        total = total - desconto + acrescimo;
        if (total < 0) throw new IllegalStateException("Total da venda não pode ser negativo.");
        return total;
    }

    @Override
    public void registrar() {
        System.out.println("Venda registrada para cliente: " + cliente.getDocumento());
    }

    // Getters, setters e métodos adicionais
}