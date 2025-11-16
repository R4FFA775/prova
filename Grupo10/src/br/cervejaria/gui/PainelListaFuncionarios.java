package br.cervejaria.gui;

import br.cervejaria.model.Funcionario;
import br.cervejaria.dao.FuncionarioDAO;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class PainelListaFuncionarios extends JPanel {
    private JTable tabela;
    private JScrollPane scroll;

    public PainelListaFuncionarios() {
        setLayout(new BorderLayout());
        atualizarTabela();
    }

    private void atualizarTabela() {
        try {
            List<Funcionario> funcionarios = FuncionarioDAO.carregarFuncionarios();
            String[] colunas = {"Nome", "Documento", "Cargo", "Salário", "Departamento"};
            String[][] dados = new String[funcionarios.size()][colunas.length];
            for (int i = 0; i < funcionarios.size(); i++) {
                Funcionario f = funcionarios.get(i);
                dados[i][0] = f.getNome();
                dados[i][1] = f.getDocumento();
                dados[i][2] = f.getCargo();
                dados[i][3] = String.valueOf(f.getSalario());
                dados[i][4] = f.getDepartamento();
            }
            tabela = new JTable(dados, colunas);
            if (scroll != null) remove(scroll);
            scroll = new JScrollPane(tabela);
            add(scroll, BorderLayout.CENTER);
        } catch (Exception ex) {
            add(new JLabel("Erro ao carregar funcionários: " + ex.getMessage()), BorderLayout.CENTER);
        }
    }
}
