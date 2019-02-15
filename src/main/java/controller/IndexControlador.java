package controller;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named("indexController")
@SessionScoped
public class IndexControlador implements Serializable {

    private String mensagem = "Olá! Fabrício";

    private String nome;

    private Integer contador = 0;


    @PostConstruct
    private void init() {

        System.out.println("Pos Construct");

    }


    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public void mostrarMensagem() {

        setMensagem("mudando mensagem..." + contador++);
    }

    public void mudarMensagem() {
        setMensagem("");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
