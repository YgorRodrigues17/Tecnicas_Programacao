package repository;

import model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

    Produto getProdutoByCodigobarras(Long codigobarras);
    List<Produto> findAllByCategoria(String categoria);
    List<Produto> findAllByQuantidadeIs(Integer quantidade);
}
