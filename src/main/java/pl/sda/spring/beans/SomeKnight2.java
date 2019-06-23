package pl.sda.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SomeKnight2 extends Knight {

    @Autowired
    public SomeKnight2(@Qualifier("someQuest2") Quest quest) {
        super(quest);
    }
}