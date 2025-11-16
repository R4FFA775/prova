package br.cervejaria.model;

import java.io.Serializable;

public class Funcionario extends Pessoa implements Serializable {
    private String cargo;
    private double salario;
    private String dataAdmissao;
    private String departamento;
    private String turno;
    private String supervisor;
    private String pis;
    private String ctps;

    // Construtor com campos obrigatórios
    public Funcionario(String nome, String documento, String telefone, String email, String endereco, String cidade, String estado, String cep, String dataNascimento) {
        super(nome, documento, telefone, email, endereco, cidade, estado, cep, dataNascimento);
        if (nome == null || nome.isEmpty() || documento == null || documento.isEmpty()) {
            throw new IllegalArgumentException("Nome e documento são obrigatórios.");
        }
    }

    // Construtor completo
    public Funcionario(String nome, String documento, String telefone, String email, String endereco, String cidade, String estado, String cep, String dataNascimento, String cargo, double salario, String dataAdmissao, String departamento, String turno, String supervisor, String pis, String ctps) {
        this(nome, documento, telefone, email, endereco, cidade, estado, cep, dataNascimento);
        this.cargo = cargo;
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
        this.departamento = departamento;
        this.turno = turno;
        this.supervisor = supervisor;
        this.pis = pis;
        this.ctps = ctps;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário: " + salario);
    }

    public void aumentarSalario(double percentual) throws Exception {
        if (percentual <= 0) throw new Exception("Percentual inválido.");
        this.salario += this.salario * percentual;
    }

    public String getNome() { return nome; }
    public String getDocumento() { return documento; }
    public String getCargo() { return cargo; }
    public double getSalario() { return salario; }
    public String getDepartamento() { return departamento; }
    // Getters, setters e métodos adicionais
}