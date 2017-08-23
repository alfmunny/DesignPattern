package Facade;

/**
 * Created by yzhang on 23.08.17.
 */
public class Client {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.Method1();
        System.out.println();
        facade.Method2();
    }
}
