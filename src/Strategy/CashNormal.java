package Strategy;

/**
 * Created by yzhang on 10.08.17.
 */
public class CashNormal extends CashSuper {
    @Override
    public double acceptCash(double money) {
        return money;
    }
}
