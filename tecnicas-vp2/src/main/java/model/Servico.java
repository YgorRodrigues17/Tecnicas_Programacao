package model;

public class Servico {

    private Integer id;
    private float maoDeObra;
    private int conjuntoVendido;
    private float precoTotal;

    public Servico() {

    }

    public Servico(float maoDeObra, int conjuntoVendido, float precoTotal) {
        this.maoDeObra = maoDeObra;
        this.conjuntoVendido = conjuntoVendido;
        this.precoTotal = precoTotal;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {

        this.id = id;
    }

    public float getMaoDeObra() {

        return maoDeObra;
    }

    public void setMaoDeObra(float maoDeObra) {

        this.maoDeObra = maoDeObra;
    }

    public int getConjuntoVendido() {

        return conjuntoVendido;
    }

    public void setConjuntoVendido(int conjuntoVendido) {

        this.conjuntoVendido = conjuntoVendido;
    }

    public float getPrecoTotal() {

        return precoTotal;
    }

    public void setPrecoTotal(float precoTotal) {
        this.precoTotal = precoTotal;
    }
}