package br.cervejaria.dao;

import br.cervejaria.model.Cerveja;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO {
    private static final String FILE_NAME = "cervejas.ser";

    public static void salvarCervejas(List<Cerveja> cervejas) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(cervejas);
        }
    }

    public static List<Cerveja> carregarCervejas() throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            return (List<Cerveja>) ois.readObject();
        } catch (FileNotFoundException e) {
            return new ArrayList<>();
        }
    }
}
