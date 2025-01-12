package com.mikailexample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Terra terra = (Terra) context.getBean("terra");
        terra.setPercentAwesome(100);
        System.out.println(terra.getPercentAwesome());
        terra.code();
        Love l = (Love) context.getBean("love");
        //l.setLove(0);
        System.out.println(l.getLove());
    }
}
