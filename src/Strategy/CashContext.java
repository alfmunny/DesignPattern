package Strategy;

/**
 * Created by yzhang on 10.08.17.
 */
public class CashContext {
    private CashSuper cashSuper = null;

    public CashContext(String type) {
        switch (type) {
            case "Normal":
                cashSuper = new CashNormal();
                break;
            case "300 Return 100":
                cashSuper = new CashReturn("300", "100");
                break;
            case "80%":
                cashSuper = new CashRebate("0.8");
                break;
        }
    }

    public double getResult(double money) {
        double result = 0d;
        try {
            result = cashSuper.acceptCash(money);
        }
        catch (NullPointerException e)
        {
           System.out.println("Can't find the cash strategy");
        }
        return result;
    }
}
