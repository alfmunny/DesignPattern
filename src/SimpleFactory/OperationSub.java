package SimpleFactory;

/**
 * Created by yzhang on 09.08.17.
 */
public class OperationSub extends Operation {
    @Override
    public double getResult() {
        double result = 0;
        result = getNumberA() - getNumberB();
        return result;
    }
}
