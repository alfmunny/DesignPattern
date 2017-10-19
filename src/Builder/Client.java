package Builder;

/**
 * Created by yzhang on 19.10.17.
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("Build Thin Person ...");
        PersonThinBuilder ptb = new PersonThinBuilder("2", "thin person");
        BuildDirector bdThin = new BuildDirector(ptb);
        bdThin.CreatePerson();

        System.out.println("Build Fat Person ...");
        PersonFatBuilder pfb = new PersonFatBuilder("2", "fat person");
        BuildDirector bdFat = new BuildDirector(pfb);
        bdFat.CreatePerson();
    }
}
