package Builder;

/**
 * Created by yzhang on 19.10.17.
 */
public class PersonThinBuilder extends PersonBuilder{

    public PersonThinBuilder(String dimension, String name) {
        super(dimension, name);
    }

    @Override
    public void BuildHead() {
        System.out.println("build thin head");
    }

    @Override
    public void BuildBody() {
        System.out.println("build thin body");
    }

    @Override
    public void BuildArmLeft() {
        System.out.println("build thin left arm");

    }

    @Override
    public void BuildArmRight() {
        System.out.println("build thin right arm");
    }

    @Override
    public void BuildLegLeft() {
        System.out.println("build thin left leg");
    }

    @Override
    public void BuildLegRight() {
        System.out.println("build thin right leg");
    }
}
