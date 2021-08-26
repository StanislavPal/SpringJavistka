package stas.paliutin.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class MyJavaConfigBean {

    @PostConstruct
    public void init() {
        System.out.println("MyBean init!");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("MyBean destroy!");
    }
}
