package Factory;

/**
 * Created by yzhang on 16.08.17.
 */
public class Client {
    public static void main(String[] args) {
       IFactory factory = new VolunteerFactory();
       LeiFeng student = factory.CreateLeiFeng();

       student.BuyRice();
       student.Sweep();
       student.Wash();
    }
}
