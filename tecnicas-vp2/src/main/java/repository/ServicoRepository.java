package repository;

import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import model.Servico;

@Repository
public class ServicoRepository {

    private final List<Servico> servicos;

    public ServicoRepository() {
        servicos = new ArrayList<>();
    }

    public void create(Servico servico) {

        servicos.add(servico);
    }

    public List<Servico> read() {

        return servicos;
    }

    public void update(Integer id, Servico novoServico) {
        for (int i = 0; i < servicos.size(); i++) {
            if (Objects.equals(servicos.get(i).getId(), id)) {
                servicos.remove(i);
                servicos.add(i, novoServico);
                break;
            }
        }
    }

    public void delete(Integer id) {
        Servico toDelete = null;
        for (Servico servico : servicos) {
            if (Objects.equals(id, servico.getId())) {
                toDelete = servico;
                break;
            }
        }

        if (toDelete != null) {
            servicos.remove(toDelete);
        }
    }

    public Servico findById(Integer id) {
        for (Servico servico : servicos) {
            if (Objects.equals(id, servico.getId())) {
                return servico;
            }
        }

        return null;
    }
}