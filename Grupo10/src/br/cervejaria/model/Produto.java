package br.cervejaria.model;

import br.cervejaria.interfaces.IProduto;

public abstract class Produto implements IProduto {
    protected String codigo;
    protected String descricao;
    protected double precoCusto;
    protected double precoVenda;
    protected int quantidadeEstoque;
    protected String fabricante;
    protected String tipo;
    protected String validade;
    protected double teorAlcoolico;

    public Produto(String codigo, String descricao, double precoCusto, double precoVenda, int quantidadeEstoque, String fabricante, String tipo, String validade, double teorAlcoolico) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
        this.quantidadeEstoque = quantidadeEstoque;
        this.fabricante = fabricante;
        this.tipo = tipo;
        this.validade = validade;
        this.teorAlcoolico = teorAlcoolico;
    }

    @Override
    public String getDescricao() {
        return descricao;
    }
}