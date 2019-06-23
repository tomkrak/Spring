package pl.sda.spring;

import lombok.ToString;

@ToString
public class SomeBean {

    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "SomeBean{" +
                "title='" + title + '\'' +
                '}';
    }

}
