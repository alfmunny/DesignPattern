package Decorator;

/**
 * Created by yzhang on 11.08.17.
 */
public class Person extends Decorable {
    public Person() {}
    private String name;
    public Person(String name) {
        this.name = name;
    }

    public void Show()
    {
        System.out.println(name);
    }
}
