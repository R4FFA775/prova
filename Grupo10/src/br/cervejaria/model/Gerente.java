package br.cervejaria.model;

public class Gerente extends Funcionario {
    private String nivelAcesso;
    private String setorResponsavel;
    private double bonusAnual;
    private String senhaAcesso;
    private String emailCorporativo;
    private String telefoneCorporativo;
    private String observacao;
    private static int totalGerentes = 0;

    public Gerente(String nome, String documento, String telefone, String email, String endereco, String cidade, String estado, String cep, String dataNascimento, String cargo, double salario, String dataAdmissao, String departamento, String turno, String supervisor, String pis, String ctps, String nivelAcesso, String setorResponsavel, double bonusAnual, String senhaAcesso, String emailCorporativo, String telefoneCorporativo, String observacao) {
        super(nome, documento, telefone, email, endereco, cidade, estado, cep, dataNascimento, cargo, salario, dataAdmissao, departamento, turno, supervisor, pis, ctps);
        this.nivelAcesso = nivelAcesso;
        this.setorResponsavel = setorResponsavel;
        this.bonusAnual = bonusAnual;
        this.senhaAcesso = senhaAcesso;
        this.emailCorporativo = emailCorporativo;
        this.telefoneCorporativo = telefoneCorporativo;
        this.observacao = observacao;
        totalGerentes++;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Nível de Acesso: " + nivelAcesso);
        System.out.println("Setor Responsável: " + setorResponsavel);
        System.out.println("Bônus Anual: " + bonusAnual);
        System.out.println("Email Corporativo: " + emailCorporativo);
        System.out.println("Telefone Corporativo: " + telefoneCorporativo);
    }

    public static int getTotalGerentes() {
        return totalGerentes;
    }

    // Sobrecarga de método
    public double calcularBonus() {
        return bonusAnual;
    }
    public double calcularBonus(double percentual) {
        return bonusAnual * percentual;
    }
    // Getters, setters e métodos adicionais
}
