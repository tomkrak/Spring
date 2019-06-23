package pl.sda.spring.beans;

import lombok.ToString;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@ToString
@Component
public class SomeQuest2 implements Quest {

    @Override
    public void doQuest() {
        System.out.println("Some Quest Two!!!");
    }
}
