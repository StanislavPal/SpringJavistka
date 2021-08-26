package stas.paliutin;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import stas.paliutin.beans.MyJavaConfigBean;

@Configuration
@ComponentScan("stas.paliutin")
public class AppConfig {

    @Bean
    public MyJavaConfigBean myJavaConfigBean() {
        return new MyJavaConfigBean();
    }

}
