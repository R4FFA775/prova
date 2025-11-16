package br.cervejaria.model;

import java.io.Serializable;

public class Cliente extends Pessoa implements Serializable {
    private String tipoCliente;
    private int pontosFidelidade;
    private boolean vip;
    private String observacao;
    private String genero;
    private String profissao;
    private String estadoCivil;
    private String nacionalidade;

    // Construtor com campos obrigatórios
    public Cliente(String nome, String documento, String telefone, String email, String endereco, String cidade, String estado, String cep, String dataNascimento) {
        super(nome, documento, telefone, email, endereco, cidade, estado, cep, dataNascimento);
        if (nome == null || nome.isEmpty() || documento == null || documento.isEmpty()) {
            throw new IllegalArgumentException("Nome e documento são obrigatórios.");
        }
    }

    // Construtor completo
    public Cliente(String nome, String documento, String telefone, String email, String endereco, String cidade, String estado, String cep, String dataNascimento, String tipoCliente, int pontosFidelidade, boolean vip, String observacao, String genero, String profissao, String estadoCivil, String nacionalidade) {
        this(nome, documento, telefone, email, endereco, cidade, estado, cep, dataNascimento);
        this.tipoCliente = tipoCliente;
        this.pontosFidelidade = pontosFidelidade;
        this.vip = vip;
        this.observacao = observacao;
        this.genero = genero;
        this.profissao = profissao;
        this.estadoCivil = estadoCivil;
        this.nacionalidade = nacionalidade;
    }

    public void adicionarPontos(int pontos) throws Exception {
        if (pontos < 0) throw new Exception("Pontos não podem ser negativos.");
        this.pontosFidelidade += pontos;
    }

    public void resgatarPontos(int pontos) throws Exception {
        if (pontos > this.pontosFidelidade) throw new Exception("Pontos insuficientes.");
        this.pontosFidelidade -= pontos;
    }

    public String getNome() { return nome; }
    public String getDocumento() { return documento; }
    public String getTelefone() { return telefone; }
    public String getEmail() { return email; }
    public String getCidade() { return cidade; }
    // Getters, setters e métodos adicionais
}