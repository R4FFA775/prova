package br.cervejaria.dao;

import br.cervejaria.model.Cliente;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {
    private static final String FILE_NAME = "clientes.ser";

    public static void salvarClientes(List<Cliente> clientes) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(clientes);
        }
    }

    public static List<Cliente> carregarClientes() throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            return (List<Cliente>) ois.readObject();
        } catch (FileNotFoundException e) {
            return new ArrayList<>();
        }
    }
}
