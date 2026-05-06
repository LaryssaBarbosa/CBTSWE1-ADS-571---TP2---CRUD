package gerencia;

import java.util.ArrayList;
import java.util.List;

public class BancoProduto {

    private static List<Produto> lista = new ArrayList<>();
    private static int contador = 1;

    public void adicionar(Produto p) {
        p.setId(contador++);
        lista.add(p);
    }

    public List<Produto> listar() {
        return lista;
    }

    public void remover(int id) {
        lista.removeIf(p -> p.getId() == id);
    }
}