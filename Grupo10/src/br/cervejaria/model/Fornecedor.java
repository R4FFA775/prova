package br.cervejaria.model;

import java.io.Serializable;

public class Fornecedor extends Pessoa implements Serializable {
    private String cnpj;
    private String razaoSocial;
    private String inscricaoEstadual;
    private String contato;
    private String categoria;
    private String site;
    private String representante;
    private String observacao;

    // Construtor com campos obrigatórios
    public Fornecedor(String nome, String documento, String telefone, String email, String endereco, String cidade, String estado, String cep, String dataNascimento) {
        super(nome, documento, telefone, email, endereco, cidade, estado, cep, dataNascimento);
        if (nome == null || nome.isEmpty() || documento == null || documento.isEmpty()) {
            throw new IllegalArgumentException("Nome e documento são obrigatórios.");
        }
    }

    // Construtor completo
    public Fornecedor(String nome, String documento, String telefone, String email, String endereco, String cidade, String estado, String cep, String dataNascimento, String cnpj, String razaoSocial, String inscricaoEstadual, String contato, String categoria, String site, String representante, String observacao) {
        this(nome, documento, telefone, email, endereco, cidade, estado, cep, dataNascimento);
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.inscricaoEstadual = inscricaoEstadual;
        this.contato = contato;
        this.categoria = categoria;
        this.site = site;
        this.representante = representante;
        this.observacao = observacao;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Razão Social: " + razaoSocial);
    }

    // Getters, setters e métodos adicionais
}