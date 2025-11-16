package br.cervejaria.model;

import br.cervejaria.interfaces.ITransacao;
import java.util.Date;

public abstract class Transacao implements ITransacao {
    protected String id;
    protected Date data;
    protected double valorTotal;
    protected String responsavel;
    protected String observacao;
    protected String status;
    protected String tipo;
    protected String formaPagamento;
    protected String clienteOuFornecedor;

    public Transacao(String id, Date data, double valorTotal, String responsavel, String observacao, String status, String tipo, String formaPagamento, String clienteOuFornecedor) {
        this.id = id;
        this.data = data;
        this.valorTotal = valorTotal;
        this.responsavel = responsavel;
        this.observacao = observacao;
        this.status = status;
        this.tipo = tipo;
        this.formaPagamento = formaPagamento;
        this.clienteOuFornecedor = clienteOuFornecedor;
    }

    @Override
    public void registrar() {
        System.out.println("Transação registrada: " + id);
    }
}