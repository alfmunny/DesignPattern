package Decorator;

/**
 * Created by yzhang on 11.08.17.
 */
public class Pants extends Finery {
    private String name = "Pants";

    @Override
    void Show() {
        super.Show();
        System.out.println("Show " + name);
    }
}
