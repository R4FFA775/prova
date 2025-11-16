package br.cervejaria.model;

public class Endereco {
    private String rua;
    private String numero;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;
    private String complemento;
    private String referencia;

    public Endereco(String rua, String numero, String bairro, String cidade, String estado, String cep, String complemento, String referencia) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.complemento = complemento;
        this.referencia = referencia;
    }
    // Getters, setters e métodos adicionais
}