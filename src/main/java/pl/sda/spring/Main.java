package pl.sda.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

        Knight someKnight = context.getBean("someKnight1", Knight.class);
        someKnight.doQuest();

        for (int i = 0; i < 100; i++) {
            Knight someKnight1 = context.getBean("someKnight1", Knight.class);
            System.out.println(someKnight1);
            someKnight.doQuest();

        }

    }
}
