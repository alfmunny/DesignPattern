package Builder;

/**
 * Created by yzhang on 19.10.17.
 */
public class BuildDirector {

    private PersonBuilder pb;
    public BuildDirector(PersonBuilder pb) {
        this.pb = pb;
    }

    public void CreatePerson() {
        pb.BuildHead();
        pb.BuildBody();
        pb.BuildArmLeft();
        pb.BuildArmRight();
        pb.BuildLegLeft();
        pb.BuildLegRight();
    }
}
