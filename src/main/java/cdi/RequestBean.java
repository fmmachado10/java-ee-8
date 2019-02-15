package cdi;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.RequestScoped;
import java.io.Serializable;
import java.time.LocalDateTime;

@RequestScoped
public class RequestBean implements Serializable {

    public static Integer contador = 0;

    public RequestBean() {

        contador++;

    }

    public static Integer getContador() {

        return contador;

    }

    public static void setContador(Integer contador) {

        RequestBean.contador = contador;

    }

    @PostConstruct
    private void init() {

        System.out.println("Fui criado RequestScoped..." + LocalDateTime.now());

    }

    @PreDestroy
    public void destroy() {

        System.out.println("Fui destruido RequestScoped..." + LocalDateTime.now());

    }

}
