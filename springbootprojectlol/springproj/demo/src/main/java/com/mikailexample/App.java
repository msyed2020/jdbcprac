package com.mikailexample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.mikailexample.config.AppConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {

        //ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ApplicationContext context = SpringApplication.run(App.class);

        Terra t = context.getBean(Terra.class);
        t.code();
        
        // ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        // Terra terra = (Terra) context.getBean("terra");
        // terra.setPercentAwesome(100);
        // System.out.println(terra.getPercentAwesome());
        // terra.code();
        // Love l = (Love) context.getBean("love");
        // //l.setLove(0);
        // System.out.println(l.getLove());
    }
}
