package Decorator;

/**
 * Created by yzhang on 11.08.17.
 */
public abstract class Finery extends Decorable {

    protected Decorable decorable;

    public void decorate(Decorable decorable) {
        this.decorable = decorable;
    }

    @Override
    void Show() {
        if (decorable != null){
            decorable.Show();
        }
    }
}
