package br.edu.uni7.tecnicasapp1.Model;

import br.edu.uni7.tecnicasapp1.TecnicasApp1Application;
import br.edu.uni7.tecnicasapp1.controller.MeuController;

public class Pessoa {
    String nome;
    String cpf;

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }
}
