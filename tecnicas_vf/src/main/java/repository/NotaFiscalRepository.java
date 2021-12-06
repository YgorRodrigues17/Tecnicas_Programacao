package repository;

import model.NotaFiscal;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotaFiscalRepository extends MongoRepository<NotaFiscal, String> {
    NotaFiscal findByCpfCliente(String cpfCliente);
}
