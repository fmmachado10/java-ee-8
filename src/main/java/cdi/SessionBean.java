package cdi;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.time.LocalDateTime;

@SessionScoped
public class SessionBean implements Serializable {

    public static  Integer contador = 0;

    public SessionBean() {

        contador ++;
    }

    public static Integer getContador() {
        return contador;
    }

    public static void setContador(Integer contador) {

        SessionBean.contador = contador;

    }

    @PostConstruct
    private void init() {

        System.out.println("Fui criado SessionScoped..." + LocalDateTime.now());

    }

    @PreDestroy
    public void destroy() {

        System.out.println("Fui destruido SessionScoped..." + LocalDateTime.now());

    }

}
