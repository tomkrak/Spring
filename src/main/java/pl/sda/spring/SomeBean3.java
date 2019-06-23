package pl.sda.spring;

import lombok.ToString;

@ToString
public class SomeBean3 {

    public SomeBean3(SomeBean2 someBean2) {
        this.someBean2 = someBean2;
    }

    private SomeBean2 someBean2;
}
