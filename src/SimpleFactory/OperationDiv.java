package SimpleFactory;

import java.io.IOException;

/**
 * Created by yzhang on 09.08.17.
 */
public class OperationDiv extends Operation {
    @Override
    public double getResult() {
        double result = 0;
        if (getNumberB() == 0) throw new ArithmeticException("Divider can't be 0. ");
        result = getNumberA() / getNumberB();
        return result;
    }
}
