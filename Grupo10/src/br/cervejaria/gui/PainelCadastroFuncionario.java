package br.cervejaria.gui;

import br.cervejaria.model.Funcionario;
import br.cervejaria.dao.FuncionarioDAO;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

public class PainelCadastroFuncionario extends JPanel {
    private JTextField tfNome, tfDocumento, tfTelefone, tfEmail, tfEndereco, tfCidade, tfEstado, tfCep, tfDataNascimento;
    private JTextField tfCargo, tfSalario, tfDataAdmissao, tfDepartamento, tfTurno, tfSupervisor, tfPis, tfCtps;
    private JButton btnSalvar;
    private static List<Funcionario> funcionarios = new ArrayList<>();

    public PainelCadastroFuncionario() {
        setLayout(new GridLayout(18, 2, 5, 5));
        add(new JLabel("Nome*:")); tfNome = new JTextField(); add(tfNome);
        add(new JLabel("Documento*:")); tfDocumento = new JTextField(); add(tfDocumento);
        add(new JLabel("Telefone:")); tfTelefone = new JTextField(); add(tfTelefone);
        add(new JLabel("Email:")); tfEmail = new JTextField(); add(tfEmail);
        add(new JLabel("Endereço:")); tfEndereco = new JTextField(); add(tfEndereco);
        add(new JLabel("Cidade:")); tfCidade = new JTextField(); add(tfCidade);
        add(new JLabel("Estado:")); tfEstado = new JTextField(); add(tfEstado);
        add(new JLabel("CEP:")); tfCep = new JTextField(); add(tfCep);
        add(new JLabel("Data Nascimento:")); tfDataNascimento = new JTextField(); add(tfDataNascimento);
        add(new JLabel("Cargo:")); tfCargo = new JTextField(); add(tfCargo);
        add(new JLabel("Salário:")); tfSalario = new JTextField(); add(tfSalario);
        add(new JLabel("Data Admissão:")); tfDataAdmissao = new JTextField(); add(tfDataAdmissao);
        add(new JLabel("Departamento:")); tfDepartamento = new JTextField(); add(tfDepartamento);
        add(new JLabel("Turno:")); tfTurno = new JTextField(); add(tfTurno);
        add(new JLabel("Supervisor:")); tfSupervisor = new JTextField(); add(tfSupervisor);
        add(new JLabel("PIS:")); tfPis = new JTextField(); add(tfPis);
        add(new JLabel("CTPS:")); tfCtps = new JTextField(); add(tfCtps);
        btnSalvar = new JButton("Salvar Funcionário");
        add(btnSalvar); add(new JLabel());

        btnSalvar.addActionListener(this::salvarFuncionario);
    }

    private void salvarFuncionario(ActionEvent e) {
        try {
            String nome = tfNome.getText().trim();
            String documento = tfDocumento.getText().trim();
            String telefone = tfTelefone.getText().trim();
            String email = tfEmail.getText().trim();
            String endereco = tfEndereco.getText().trim();
            String cidade = tfCidade.getText().trim();
            String estado = tfEstado.getText().trim();
            String cep = tfCep.getText().trim();
            String dataNascimento = tfDataNascimento.getText().trim();
            String cargo = tfCargo.getText().trim();
            double salario = tfSalario.getText().isEmpty() ? 0 : Double.parseDouble(tfSalario.getText().trim());
            String dataAdmissao = tfDataAdmissao.getText().trim();
            String departamento = tfDepartamento.getText().trim();
            String turno = tfTurno.getText().trim();
            String supervisor = tfSupervisor.getText().trim();
            String pis = tfPis.getText().trim();
            String ctps = tfCtps.getText().trim();
            Funcionario funcionario = new Funcionario(nome, documento, telefone, email, endereco, cidade, estado, cep, dataNascimento, cargo, salario, dataAdmissao, departamento, turno, supervisor, pis, ctps);
            funcionarios.add(funcionario);
            FuncionarioDAO.salvarFuncionarios(funcionarios);
            JOptionPane.showMessageDialog(this, "Funcionário salvo com sucesso!");
            limparCampos();
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Erro de validação", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro ao salvar funcionário: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void limparCampos() {
        tfNome.setText(""); tfDocumento.setText(""); tfTelefone.setText(""); tfEmail.setText("");
        tfEndereco.setText(""); tfCidade.setText(""); tfEstado.setText(""); tfCep.setText(""); tfDataNascimento.setText("");
        tfCargo.setText(""); tfSalario.setText(""); tfDataAdmissao.setText(""); tfDepartamento.setText("");
        tfTurno.setText(""); tfSupervisor.setText(""); tfPis.setText(""); tfCtps.setText("");
    }
}
