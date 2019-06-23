package pl.sda.spring;

import lombok.ToString;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import java.util.Random;

public class Knight {

    private Quest quest;

    public Knight(Quest quest) {
        this.quest = quest;
    }

    public void doQuest() {
        System.out.println("I do quest: ");
        quest.doQuest();
    }


}
