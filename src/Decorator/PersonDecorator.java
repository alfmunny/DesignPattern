package Decorator;

/**
 * Created by yzhang on 11.08.17.
 */

public class PersonDecorator {

    public static void main(String[] args)
    {

        Person person = new Person("Alfmunny");
        Suit suit = new Suit();
        Pants pants = new Pants();
        Shoes shoes = new Shoes();

       suit.decorate(person);
       pants.decorate(suit);
       shoes.decorate(pants);
       shoes.Show();
    }
}
