package br.cervejaria.interfaces;

public interface ITransacao {
    double calcularTotal();
    void registrar();
}