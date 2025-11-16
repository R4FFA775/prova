package br.cervejaria.model;

import java.io.Serializable;

public class Cerveja extends Produto implements Serializable {
    private String origem;
    private String ingredientes;
    private String cor;
    private String aroma;
    private String sabor;
    private String harmonizacao;
    private String embalagem;
    private String temperaturaIdeal;

    // Construtor com campos obrigatórios
    public Cerveja(String codigo, String descricao, double precoCusto, double precoVenda, int quantidadeEstoque, String fabricante, String tipo, String validade, double teorAlcoolico) {
        super(codigo, descricao, precoCusto, precoVenda, quantidadeEstoque, fabricante, tipo, validade, teorAlcoolico);
        if (codigo == null || codigo.isEmpty() || descricao == null || descricao.isEmpty()) {
            throw new IllegalArgumentException("Código e descrição são obrigatórios.");
        }
    }

    // Construtor completo
    public Cerveja(String codigo, String descricao, double precoCusto, double precoVenda, int quantidadeEstoque, String fabricante, String tipo, String validade, double teorAlcoolico, String origem, String ingredientes, String cor, String aroma, String sabor, String harmonizacao, String embalagem, String temperaturaIdeal) {
        this(codigo, descricao, precoCusto, precoVenda, quantidadeEstoque, fabricante, tipo, validade, teorAlcoolico);
        this.origem = origem;
        this.ingredientes = ingredientes;
        this.cor = cor;
        this.aroma = aroma;
        this.sabor = sabor;
        this.harmonizacao = harmonizacao;
        this.embalagem = embalagem;
        this.temperaturaIdeal = temperaturaIdeal;
    }

    @Override
    public double calcularPrecoFinal() {
        if (precoVenda <= 0) throw new IllegalStateException("Preço de venda inválido.");
        return precoVenda * 1.1; // Exemplo de cálculo com margem
    }

    // Sobrecarga de método
    public double calcularPrecoFinal(double taxa) {
        if (precoVenda <= 0) throw new IllegalStateException("Preço de venda inválido.");
        return precoVenda * (1 + taxa);
    }
    public String getCodigo() { return codigo; }
    public String getDescricaoCompleta() { return descricao; }
    public double getPrecoVenda() { return precoVenda; }
    public int getQuantidadeEstoque() { return quantidadeEstoque; }
    public String getFabricante() { return fabricante; }
    public String getTipo() { return tipo; }
    // Getters, setters e métodos adicionais
}