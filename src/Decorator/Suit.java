package Decorator;

/**
 * Created by yzhang on 11.08.17.
 */
public class Suit extends Finery {

    private String name = "Suit";

    @Override
    void Show() {
        super.Show();
        System.out.println("Show " + name);
    }
}
