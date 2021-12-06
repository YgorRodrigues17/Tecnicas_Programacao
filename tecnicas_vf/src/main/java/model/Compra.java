package model;


import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.List;
import java.util.UUID;

@Document
public class Compra {

    @MongoId
    private String id;
    private UUID notafiscal = UUID.randomUUID();
    private List<Produto> produto;
    private String cpfCliente;
    private Double valorcompra;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UUID getNotafiscal() {
        return notafiscal;
    }

    public void setNotafiscal(UUID notafiscal) {
        this.notafiscal = notafiscal;
    }

    public List<Produto> getProduto() {
        return produto;
    }

    public void setProduto(List<Produto> produto) {
        this.produto = produto;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }
    public Double getValorcompra() {
        return valorcompra;
    }

    public void setValorcompra(Double valorcompra) {
        this.valorcompra = valorcompra;
    }
}
