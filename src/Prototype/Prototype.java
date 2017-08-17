package Prototype;

/**
 * Created by yzhang on 17.08.17.
 */
abstract public class Prototype {
    protected String name;

    public Prototype(String name) {
        this.name = name;
    }

    public String getId() {
        return this.name;
    }

    public abstract Prototype getClone();
}
