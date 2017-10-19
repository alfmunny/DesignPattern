package Builder;

/**
 * Created by yzhang on 19.10.17.
 */
abstract class PersonBuilder {
    protected String dimension;
    protected String name;

    public PersonBuilder(String dimension, String name) {
        this.dimension = dimension;
        this.name = name;
    };

    public abstract void BuildHead();
    public abstract void BuildBody();
    public abstract void BuildArmLeft();
    public abstract void BuildArmRight();
    public abstract void BuildLegLeft();
    public abstract void BuildLegRight();
}
