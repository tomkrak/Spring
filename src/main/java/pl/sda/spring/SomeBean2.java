package pl.sda.spring;

import lombok.ToString;

import java.util.List;

@ToString
public class SomeBean2 {

    private String title;

    private List<String> list;

    public SomeBean2(String title, List<String> list) {
        this.title = title;
        this.list = list;
    }
}
