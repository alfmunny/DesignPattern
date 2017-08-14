package Proxy;

/**
 * Created by yzhang on 14.08.17.
 */
public class Client {

    public static void main(String[] args) {
        SchoolGirl mm = new SchoolGirl("DD");

        Proxy proxy = new Proxy(mm);

        proxy.GiveDolls();
        proxy.GiveFlowers();
        proxy.GiveChocolate();
    }
}
