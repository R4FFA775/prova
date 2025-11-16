package br.cervejaria.util;

public class CalculadoraFinanceira {
    public static final double IMPOSTO_PADRAO = 0.18;

    public static double calcularLucro(double receita, double custo) {
        return receita - custo;
    }

    public static double calcularMargemLucro(double receita, double custo) {
        if (receita == 0) throw new IllegalArgumentException("Receita não pode ser zero.");
        return ((receita - custo) / receita) * 100;
    }

    public static double calcularImposto(double valor) {
        return valor * IMPOSTO_PADRAO;
    }
}
