package SimpleFactory;

/**
 * Created by yzhang on 09.08.17.
 */
public class OperationAdd extends Operation {
    @Override
    public double getResult() {
        double result = 0;
        result = this.getNumberA() + this.getNumberB();
        return result;
    }
}
