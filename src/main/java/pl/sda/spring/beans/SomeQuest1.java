package pl.sda.spring.beans;

import lombok.ToString;
import org.springframework.stereotype.Component;

@ToString
@Component
public class SomeQuest1 implements Quest {

    @Override
    public void doQuest() {
        System.out.println("Some Quest One!!!");
    }
}
