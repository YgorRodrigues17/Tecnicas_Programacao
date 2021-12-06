package service;

import model.*;
import repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import exception.ClienteException;
import exception.ProdutoException;

import java.util.List;
import java.util.UUID;

@Service
public class CompraService {
    private final CompraRepository compraRepository;
    private final ProdutoRepository produtoRepository;
    private final ClienteRepository clienteRepository;
    private final NotaFiscalRepository notaFiscalRepository;
    @Autowired
    public CompraService(CompraRepository compraRepository, ProdutoRepository produtoRepository, ClienteRepository clienteRepository, NotaFiscalRepository notaFiscalRepository){
        this.compraRepository = compraRepository;
        this.produtoRepository = produtoRepository;
        this.clienteRepository = clienteRepository;
        this.notaFiscalRepository = notaFiscalRepository;
    }

    public List<Compra> list() {
        return compraRepository.findAll();
    }

    public Compra findById(Integer id) {
        return compraRepository.findById(id).get();
    }

    public Compra create(Compra compra) {
        double valorTotal = 0;
        Cliente clienteBD = clienteRepository.findByCpf(compra.getCpfCliente());
        if (clienteBD == null){
            throw new ClienteException();
        }
        List<Produto> produtos = compra.getProduto();

        if (produtos != null) {
            for (Produto produto : produtos){
                Produto produtoDatabase = produtoRepository.findById(produto.getId()).get();
                if (produtoDatabase == null){
                    throw new ProdutoException();
                }else{
                    if (produtoDatabase.getQuantidade() < produto.getQuantidade()){
                        throw new ProdutoException();
                    }else{
                        valorTotal = valorTotal + (produtoDatabase.getPreco() * produto.getQuantidade());
                        produtoDatabase.setQuantidade(produtoDatabase.getQuantidade() - produto.getQuantidade());
                    }
                }
            }
        }
        compra.setValorcompra(valorTotal);
        clienteBD.setValorTotal(clienteBD.getValorTotal() + valorTotal);

        NotaFiscal notaFiscal = new NotaFiscal();
        notaFiscal.setValorTotal(valorTotal);
        notaFiscal.setCpfCliente(clienteBD.getCpf());
        notaFiscalRepository.save(notaFiscal);

        return compraRepository.save(compra);
    }

    public Compra update(Compra compra) {
        compraRepository.save(compra);
        return compra;
    }

    public void remove(Integer id) {
        compraRepository.deleteById(id);
    }

    public List<Compra> findAllByCpfCliente(String cpfCliente){
        return compraRepository.findAllByCpfCliente(cpfCliente);
    }

    public Compra findByNotaFiscal(UUID notafiscal){
        return compraRepository.getComprasByNotafiscal(notafiscal);
    }
}
