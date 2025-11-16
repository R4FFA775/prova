package br.cervejaria.dao;

import br.cervejaria.model.Funcionario;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioDAO {
    private static final String FILE_NAME = "funcionarios.ser";

    public static void salvarFuncionarios(List<Funcionario> funcionarios) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(funcionarios);
        }
    }

    public static List<Funcionario> carregarFuncionarios() throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            return (List<Funcionario>) ois.readObject();
        } catch (FileNotFoundException e) {
            return new ArrayList<>();
        }
    }
}
