package Proxy;

/**
 * Created by yzhang on 14.08.17.
 */
public class Pursuit implements IGiveGift {
    private SchoolGirl mm;

    public Pursuit(SchoolGirl mm) {
        this.mm = mm;
    }

    @Override
    public void GiveDolls() {
        System.out.println(mm.name + ", Dolls");
    }

    @Override
    public void GiveFlowers() {
        System.out.println(mm.name + ", Flowers");
    }

    @Override
    public void GiveChocolate() {
        System.out.println(mm.name + ", Chocolate");
    }
}
