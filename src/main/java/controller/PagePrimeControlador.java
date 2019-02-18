package controller;

import negocio.Pessoa;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named("pagePrimeControlador")
@ApplicationScoped
public class PagePrimeControlador implements Serializable {


    private String nome;

    private String endereco;

    ArrayList<Pessoa> listaPessoa = new ArrayList();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }



    private void adicionar() {

        System.out.println("Adicionando...");
        Pessoa pessoa = new Pessoa();
        pessoa.setNome(getNome());
        pessoa.setEndereco(getEndereco());

        listaPessoa.add(pessoa);



    }


}
