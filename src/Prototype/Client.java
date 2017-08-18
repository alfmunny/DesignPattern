package Prototype;

/**
 * Created by yzhang on 17.08.17.
 */
public class Client {
    public static void main(String[] args) {
        Resume a = new Resume("Alfmunny Zhang");
        a.setPersonalProfile("30", "man");
        a.setWorkExperience("2017 Work at Google");

        Resume b = (Resume) a.getClone();
        b.setWorkExperience("2016 Work at Microsoft");

        Resume c = (Resume) a.getClone();
        c.setWorkExperience("2016 Work at Microsoft");

        a.display();
        b.display();
        c.display();
    }
}
