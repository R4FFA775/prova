package br.cervejaria.gui;

import br.cervejaria.model.Cerveja;
import br.cervejaria.dao.ProdutoDAO;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

public class PainelCadastroCerveja extends JPanel {
    private JTextField tfCodigo, tfDescricao, tfPrecoCusto, tfPrecoVenda, tfQuantidadeEstoque, tfFabricante, tfTipo, tfValidade, tfTeorAlcoolico;
    private JTextField tfOrigem, tfIngredientes, tfCor, tfAroma, tfSabor, tfHarmonizacao, tfEmbalagem, tfTemperaturaIdeal;
    private JButton btnSalvar;
    private static List<Cerveja> cervejas = new ArrayList<>();

    public PainelCadastroCerveja() {
        setLayout(new GridLayout(18, 2, 5, 5));
        add(new JLabel("Código*:")); tfCodigo = new JTextField(); add(tfCodigo);
        add(new JLabel("Descrição*:")); tfDescricao = new JTextField(); add(tfDescricao);
        add(new JLabel("Preço Custo:")); tfPrecoCusto = new JTextField(); add(tfPrecoCusto);
        add(new JLabel("Preço Venda:")); tfPrecoVenda = new JTextField(); add(tfPrecoVenda);
        add(new JLabel("Qtd. Estoque:")); tfQuantidadeEstoque = new JTextField(); add(tfQuantidadeEstoque);
        add(new JLabel("Fabricante:")); tfFabricante = new JTextField(); add(tfFabricante);
        add(new JLabel("Tipo:")); tfTipo = new JTextField(); add(tfTipo);
        add(new JLabel("Validade:")); tfValidade = new JTextField(); add(tfValidade);
        add(new JLabel("Teor Alcoólico:")); tfTeorAlcoolico = new JTextField(); add(tfTeorAlcoolico);
        add(new JLabel("Origem:")); tfOrigem = new JTextField(); add(tfOrigem);
        add(new JLabel("Ingredientes:")); tfIngredientes = new JTextField(); add(tfIngredientes);
        add(new JLabel("Cor:")); tfCor = new JTextField(); add(tfCor);
        add(new JLabel("Aroma:")); tfAroma = new JTextField(); add(tfAroma);
        add(new JLabel("Sabor:")); tfSabor = new JTextField(); add(tfSabor);
        add(new JLabel("Harmonização:")); tfHarmonizacao = new JTextField(); add(tfHarmonizacao);
        add(new JLabel("Embalagem:")); tfEmbalagem = new JTextField(); add(tfEmbalagem);
        add(new JLabel("Temp. Ideal:")); tfTemperaturaIdeal = new JTextField(); add(tfTemperaturaIdeal);
        btnSalvar = new JButton("Salvar Cerveja");
        add(btnSalvar); add(new JLabel());

        btnSalvar.addActionListener(this::salvarCerveja);
    }

    private void salvarCerveja(ActionEvent e) {
        try {
            String codigo = tfCodigo.getText().trim();
            String descricao = tfDescricao.getText().trim();
            double precoCusto = tfPrecoCusto.getText().isEmpty() ? 0 : Double.parseDouble(tfPrecoCusto.getText().trim());
            double precoVenda = tfPrecoVenda.getText().isEmpty() ? 0 : Double.parseDouble(tfPrecoVenda.getText().trim());
            int quantidadeEstoque = tfQuantidadeEstoque.getText().isEmpty() ? 0 : Integer.parseInt(tfQuantidadeEstoque.getText().trim());
            String fabricante = tfFabricante.getText().trim();
            String tipo = tfTipo.getText().trim();
            String validade = tfValidade.getText().trim();
            double teorAlcoolico = tfTeorAlcoolico.getText().isEmpty() ? 0 : Double.parseDouble(tfTeorAlcoolico.getText().trim());
            String origem = tfOrigem.getText().trim();
            String ingredientes = tfIngredientes.getText().trim();
            String cor = tfCor.getText().trim();
            String aroma = tfAroma.getText().trim();
            String sabor = tfSabor.getText().trim();
            String harmonizacao = tfHarmonizacao.getText().trim();
            String embalagem = tfEmbalagem.getText().trim();
            String temperaturaIdeal = tfTemperaturaIdeal.getText().trim();
            Cerveja cerveja = new Cerveja(codigo, descricao, precoCusto, precoVenda, quantidadeEstoque, fabricante, tipo, validade, teorAlcoolico, origem, ingredientes, cor, aroma, sabor, harmonizacao, embalagem, temperaturaIdeal);
            cervejas.add(cerveja);
            ProdutoDAO.salvarCervejas(cervejas);
            JOptionPane.showMessageDialog(this, "Cerveja salva com sucesso!");
            limparCampos();
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Erro de validação", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro ao salvar cerveja: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void limparCampos() {
        tfCodigo.setText(""); tfDescricao.setText(""); tfPrecoCusto.setText(""); tfPrecoVenda.setText("");
        tfQuantidadeEstoque.setText(""); tfFabricante.setText(""); tfTipo.setText(""); tfValidade.setText("");
        tfTeorAlcoolico.setText(""); tfOrigem.setText(""); tfIngredientes.setText(""); tfCor.setText("");
        tfAroma.setText(""); tfSabor.setText(""); tfHarmonizacao.setText(""); tfEmbalagem.setText(""); tfTemperaturaIdeal.setText("");
    }
}
