package br.cervejaria.gui;

import br.cervejaria.model.Cliente;
import br.cervejaria.dao.ClienteDAO;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class PainelListaClientes extends JPanel {
    private JTable tabela;
    private JScrollPane scroll;

    public PainelListaClientes() {
        setLayout(new BorderLayout());
        atualizarTabela();
    }

    private void atualizarTabela() {
        try {
            List<Cliente> clientes = ClienteDAO.carregarClientes();
            String[] colunas = {"Nome", "Documento", "Telefone", "Email", "Cidade"};
            String[][] dados = new String[clientes.size()][colunas.length];
            for (int i = 0; i < clientes.size(); i++) {
                Cliente c = clientes.get(i);
                dados[i][0] = c.getNome();
                dados[i][1] = c.getDocumento();
                dados[i][2] = c.getTelefone();
                dados[i][3] = c.getEmail();
                dados[i][4] = c.getCidade();
            }
            tabela = new JTable(dados, colunas);
            if (scroll != null) remove(scroll);
            scroll = new JScrollPane(tabela);
            add(scroll, BorderLayout.CENTER);
        } catch (Exception ex) {
            add(new JLabel("Erro ao carregar clientes: " + ex.getMessage()), BorderLayout.CENTER);
        }
    }
}
