package br.cervejaria.model;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private List<Cerveja> cervejas;
    private int capacidadeMaxima;
    private String localizacao;
    private String responsavel;
    private String observacao;
    private String tipoEstoque;
    private String dataUltimaEntrada;
    private String dataUltimaSaida;

    public Estoque(int capacidadeMaxima, String localizacao, String responsavel, String observacao, String tipoEstoque, String dataUltimaEntrada, String dataUltimaSaida) {
        this.cervejas = new ArrayList<>();
        this.capacidadeMaxima = capacidadeMaxima;
        this.localizacao = localizacao;
        this.responsavel = responsavel;
        this.observacao = observacao;
        this.tipoEstoque = tipoEstoque;
        this.dataUltimaEntrada = dataUltimaEntrada;
        this.dataUltimaSaida = dataUltimaSaida;
    }

    public void adicionarCerveja(Cerveja cerveja) {
        cervejas.add(cerveja);
    }

    public List<Cerveja> getCervejas() {
        return cervejas;
    }
    // Getters, setters e métodos adicionais
}