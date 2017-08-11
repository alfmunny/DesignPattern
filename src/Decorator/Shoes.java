package Decorator;

/**
 * Created by yzhang on 11.08.17.
 */
public class Shoes extends Finery {
    private String name = "Shoes";

    @Override
    void Show() {
        super.Show();
        System.out.println("Show " + name);
    }
}
