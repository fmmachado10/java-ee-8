package cdi;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.ApplicationScoped;
import java.io.Serializable;
import java.time.LocalDateTime;

@ApplicationScoped
public class ApplicationBean  implements Serializable {

    public static  Integer contador = 0;

    public ApplicationBean() {

        contador ++;

    }

    public static Integer getContador() {

        return contador;
    }

    public static void setContador(Integer contador) {

        ApplicationBean.contador = contador;

    }

    @PostConstruct
    private void init() {

        System.out.println("Fui criado ApplicationScoped..." + LocalDateTime.now());

    }

    @PreDestroy
    public void destroy() {

        System.out.println("Fui destruido ApplicationScoped..." + LocalDateTime.now());

    }


}
