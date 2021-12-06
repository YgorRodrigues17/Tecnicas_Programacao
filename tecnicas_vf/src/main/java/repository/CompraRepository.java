package repository;


import model.Compra;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface CompraRepository extends MongoRepository<Compra,Integer> {
    List<Compra> findAllByCpfCliente(String cpf);
    Compra getComprasByNotafiscal(UUID notafiscal);
}
