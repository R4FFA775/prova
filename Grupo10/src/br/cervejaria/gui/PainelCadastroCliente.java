package br.cervejaria.gui;

import br.cervejaria.model.Cliente;
import br.cervejaria.dao.ClienteDAO;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

public class PainelCadastroCliente extends JPanel {
    private JTextField tfNome, tfDocumento, tfTelefone, tfEmail, tfEndereco, tfCidade, tfEstado, tfCep, tfDataNascimento;
    private JButton btnSalvar;
    private static List<Cliente> clientes = new ArrayList<>();

    public PainelCadastroCliente() {
        setLayout(new GridLayout(10, 2, 5, 5));
        add(new JLabel("Nome*:")); tfNome = new JTextField(); add(tfNome);
        add(new JLabel("Documento*:")); tfDocumento = new JTextField(); add(tfDocumento);
        add(new JLabel("Telefone:")); tfTelefone = new JTextField(); add(tfTelefone);
        add(new JLabel("Email:")); tfEmail = new JTextField(); add(tfEmail);
        add(new JLabel("Endereço:")); tfEndereco = new JTextField(); add(tfEndereco);
        add(new JLabel("Cidade:")); tfCidade = new JTextField(); add(tfCidade);
        add(new JLabel("Estado:")); tfEstado = new JTextField(); add(tfEstado);
        add(new JLabel("CEP:")); tfCep = new JTextField(); add(tfCep);
        add(new JLabel("Data Nascimento:")); tfDataNascimento = new JTextField(); add(tfDataNascimento);
        btnSalvar = new JButton("Salvar Cliente");
        add(btnSalvar); add(new JLabel());

        btnSalvar.addActionListener(this::salvarCliente);
    }

    private void salvarCliente(ActionEvent e) {
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
            Cliente cliente = new Cliente(nome, documento, telefone, email, endereco, cidade, estado, cep, dataNascimento);
            clientes.add(cliente);
            ClienteDAO.salvarClientes(clientes);
            JOptionPane.showMessageDialog(this, "Cliente salvo com sucesso!");
            limparCampos();
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Erro de validação", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro ao salvar cliente: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void limparCampos() {
        tfNome.setText(""); tfDocumento.setText(""); tfTelefone.setText(""); tfEmail.setText("");
        tfEndereco.setText(""); tfCidade.setText(""); tfEstado.setText(""); tfCep.setText(""); tfDataNascimento.setText("");
    }
}
