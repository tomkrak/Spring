package pl.sda.spring.beans;

public abstract class Knight {

    private Quest quest;

    public Knight(Quest quest) {
        this.quest = quest;
    }

    public void doQuest() {
        System.out.println("I do quest: ");
        quest.doQuest();
    }


}
