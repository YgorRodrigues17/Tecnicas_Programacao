package model;

public class Estoque {

    private Integer id;
    private String nome;
    private int quantidade;
    private float preco;

    public Estoque() {

    }

    public Estoque(String nome, int quantidade, int preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public Integer getId() {

        return id;
    }

    public void setId(Integer id) {

        this.id = id;
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public int getQuantidade() {

        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getPreco() {

        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
}