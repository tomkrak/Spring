package pl.sda.spring.beans;

import lombok.ToString;

@ToString
public class SomeQuest2 implements Quest {

    @Override
    public void doQuest() {
        System.out.println("Some Quest Two!!!");
    }
}
