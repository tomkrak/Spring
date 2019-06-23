package pl.sda;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.sda.spring.beans.JavaConfig;
import pl.sda.spring.beans.Knight;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

        Knight someKnight = context.getBean("someKnight1", Knight.class);
        Knight someKnight2 = context.getBean("someKnight2", Knight.class);

        someKnight.doQuest();
        someKnight2.doQuest();

    }
}

