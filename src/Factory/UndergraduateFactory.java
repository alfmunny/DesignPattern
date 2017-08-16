package Factory;

/**
 * Created by yzhang on 16.08.17.
 */
public class UndergraduateFactory implements IFactory {
    @Override
    public LeiFeng CreateLeiFeng() {
        return new Undergraduate();
    }
}

