package br.cervejaria.gui;

import br.cervejaria.model.Cerveja;
import br.cervejaria.dao.ProdutoDAO;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class PainelListaCervejas extends JPanel {
    private JTable tabela;
    private JScrollPane scroll;

    public PainelListaCervejas() {
        setLayout(new BorderLayout());
        atualizarTabela();
    }

    private void atualizarTabela() {
        try {
            List<Cerveja> cervejas = ProdutoDAO.carregarCervejas();
            String[] colunas = {"Código", "Descrição", "Preço Venda", "Qtd. Estoque", "Fabricante", "Tipo"};
            String[][] dados = new String[cervejas.size()][colunas.length];
            for (int i = 0; i < cervejas.size(); i++) {
                Cerveja c = cervejas.get(i);
                dados[i][0] = c.getCodigo();
                dados[i][1] = c.getDescricaoCompleta();
                dados[i][2] = String.valueOf(c.getPrecoVenda());
                dados[i][3] = String.valueOf(c.getQuantidadeEstoque());
                dados[i][4] = c.getFabricante();
                dados[i][5] = c.getTipo();
            }
            tabela = new JTable(dados, colunas);
            if (scroll != null) remove(scroll);
            scroll = new JScrollPane(tabela);
            add(scroll, BorderLayout.CENTER);
        } catch (Exception ex) {
            add(new JLabel("Erro ao carregar cervejas: " + ex.getMessage()), BorderLayout.CENTER);
        }
    }
}
