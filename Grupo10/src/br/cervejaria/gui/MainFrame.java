package br.cervejaria.gui;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    public MainFrame() {
        setTitle("Sistema de Cervejaria");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JTabbedPane abas = new JTabbedPane();
        abas.addTab("Bem-vindo", new JLabel("Bem-vindo ao Sistema de Cervejaria!", SwingConstants.CENTER));
        abas.addTab("Cadastro de Cliente", new PainelCadastroCliente());
        abas.addTab("Lista de Clientes", new PainelListaClientes());
        abas.addTab("Cadastro de Funcionário", new PainelCadastroFuncionario());
        abas.addTab("Lista de Funcionários", new PainelListaFuncionarios());
        abas.addTab("Cadastro de Cerveja", new PainelCadastroCerveja());
        abas.addTab("Lista de Cervejas", new PainelListaCervejas());
        add(abas, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new MainFrame().setVisible(true);
        });
    }
}
