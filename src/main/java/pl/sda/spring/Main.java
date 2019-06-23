package pl.sda.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Spring!");

        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        Object someBean = context.getBean("someBean");
        SomeBean someBean1 = context.getBean("someBean", SomeBean.class);
        SomeBean2 someBean2 = context.getBean("someBeanTwo", SomeBean2.class);
        SomeBean3 someBean3 = context.getBean("someBeanThree", SomeBean3.class);

        System.out.println(someBean);
        System.out.println(someBean1);
        System.out.println(someBean2);
        System.out.println(someBean3);



    }
}
