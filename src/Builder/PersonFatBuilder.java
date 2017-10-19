package Builder;

/**
 * Created by yzhang on 19.10.17.
 */
public class PersonFatBuilder extends PersonBuilder{

    public PersonFatBuilder(String dimension, String name) {
        super(dimension, name);
    }

    @Override
    public void BuildHead() {
        System.out.println("build head");
    }

    @Override
    public void BuildBody() {
        System.out.println("build fat body");
    }

    @Override
    public void BuildArmLeft() {
        System.out.println("build fat left arm");
    }

    @Override
    public void BuildArmRight() {
        System.out.println("build fat right arm");
    }

    @Override
    public void BuildLegLeft() {
        System.out.println("build fat left leg");
    }

    @Override
    public void BuildLegRight() {
        System.out.println("build fat right leg");
    }
}
