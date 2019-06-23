package pl.sda.spring.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Configuration
public class JavaConfig {

    @Bean
    public SomeBean someBean() {
        SomeBean someBean = new SomeBean();
        someBean.setTitle("Some title");
        return new SomeBean();
    }

    @Bean
    public SomeBean2 someBean2() {
        List<String> list = new ArrayList<>();
        list.add("Value 1");
        list.add("Value2");
        return new SomeBean2("Some Bean Two", list);
    }

    @Bean
    public SomeBean3 someBean3(SomeBean2 someBean2) {
        return new SomeBean3(someBean2);
    }

//    @Bean
//    public Quest someQuest1() {
//        return new SomeQuest1();
//    }
//
//    @Bean
//    @Primary
//    public Quest someQuest2() {
//        return new SomeQuest2();
//    }

    @Bean
    @Scope(scopeName = "prototype")
    public Knight someKnight1(Quest quest) {
        return new Knight(quest);
    }

    @Bean
    @Scope(scopeName = "prototype")
    public Quest someQuest() {
        int x = new Random().nextInt(10);
        return x > 4 ? new SomeQuest1() : new SomeQuest2();

    }
}