package Strategy;

/**
 * Created by yzhang on 10.08.17.
 */
public class Store {
    public static void main(String[] args) {

        CashContext cashContext = new CashContext("300 Return 100");

        System.out.println(cashContext.getResult(1000));
    }
}
