package stas.paliutin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import stas.paliutin.beans.FatBean;
import stas.paliutin.beans.list.BeanWithInterface;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Application {
    public static void main(String[] args) throws IOException {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        Arrays.stream(applicationContext.getBeanDefinitionNames()).forEach(System.out::println);

//        BufferedReader reader = new BufferedReader(new FileReader(new File("lines.txt")));
//
//        ArrayList<String> list = new ArrayList<>();
//        String line;
//        while ((line= reader.readLine()) != null) {
//            if (!list.isEmpty()) {
//                list.add(line);
//            }
//        }
//
//        reader.close();
//
//        String[] strings = list.toArray(new String[0]);
//
//        sort


        final FatBean fatBean = applicationContext.getBean(FatBean.class);
        System.out.println(fatBean.getFirstComponent());
        System.out.println(fatBean.getInnerBean());
        System.out.println(fatBean.getOptionalInnerBean());
        System.out.println(fatBean.getFirstService());
        System.out.println(fatBean.getInjectInnerBean());
        System.out.println(fatBean.getOptionalInjectInnerBean());

        BeanWithInterface beanWithInterface = applicationContext.getBean(BeanWithInterface.class);
        System.out.println(beanWithInterface.getMyInterfaces());
        System.out.println(beanWithInterface.getMyInterfaceMap());
        System.out.println(beanWithInterface.getMyInterface());
    }
}
