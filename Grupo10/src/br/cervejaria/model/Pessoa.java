package br.cervejaria.model;

import br.cervejaria.interfaces.IPessoa;

public abstract class Pessoa implements IPessoa {
    protected String nome;
    protected String documento;
    protected String telefone;
    protected String email;
    protected String endereco;
    protected String cidade;
    protected String estado;
    protected String cep;
    protected String dataNascimento;

    public Pessoa(String nome, String documento, String telefone, String email, String endereco, String cidade, String estado, String cep, String dataNascimento) {
        this.nome = nome;
        this.documento = documento;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.dataNascimento = dataNascimento;
    }

    @Override
    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Documento: " + documento);
        System.out.println("Telefone: " + telefone);
        System.out.println("Email: " + email);
        System.out.println("Endereço: " + endereco);
        System.out.println("Cidade: " + cidade);
        System.out.println("Estado: " + estado);
        System.out.println("CEP: " + cep);
        System.out.println("Data de Nascimento: " + dataNascimento);
    }

    @Override
    public String getDocumento() {
        return documento;
    }
}