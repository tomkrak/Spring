package pl.sda.spring.scope;

import lombok.ToString;
import org.springframework.stereotype.Component;
import pl.sda.spring.beans.Quest;

@ToString
@Component
public class SomeQuest3 implements Quest {
    @Override
    public void doQuest() {
        System.out.println("Some Quest Three!!!");
    }
}
