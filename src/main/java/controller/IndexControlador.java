package controller;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named("indexController")
@SessionScoped
public class IndexControlador implements Serializable {


    private String nome;

    private String mensagem;

    private Integer contador;

    public void mostrarMensagem() {
        System.out.println(nome);
    }

    public void mudarMensagem() {
        System.out.println("asasdfasdf");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public Integer getContador() {
        return contador;
    }

    public void setContador(Integer contador) {
        this.contador = contador;
    }
}
