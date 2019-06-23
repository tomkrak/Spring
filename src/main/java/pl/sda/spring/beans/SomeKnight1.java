package pl.sda.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SomeKnight1 extends Knight {

    @Autowired
    public SomeKnight1(@Qualifier("someQuest1") Quest quest) {
        super(quest);
    }
}
