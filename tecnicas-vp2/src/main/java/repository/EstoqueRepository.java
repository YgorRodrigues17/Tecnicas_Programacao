package repository;

import org.springframework.stereotype.Repository;
import model.Estoque;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class EstoqueRepository {

    private static Integer contador = 1;
    private final Map<Integer, Estoque> estoqueMap;

    public EstoqueRepository() {

        estoqueMap = new HashMap<>();
    }

    public List<Estoque> list() {

        return new ArrayList<>(estoqueMap.values());
    }

    public Estoque findById(Integer id) {

        return estoqueMap.get(id);
    }

    public Estoque update(Integer id, Estoque estoque) {
        if (!estoqueMap.containsKey(id)) {
            throw new IllegalArgumentException("estoque inexistente");
        }

        estoqueMap.put(id, estoque);
        return estoque;
    }

    public Estoque create(Estoque estoque) {
        int id = contador;
        contador++;

        estoqueMap.put(id, estoque);
        estoque.setId(id);

        return estoque;
    }

    public void delete(Integer id) {

        estoqueMap.remove(id);
    }
}