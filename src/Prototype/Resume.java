package Prototype;

/**
 * Created by yzhang on 17.08.17.
 */
public class Resume extends Prototype {

    private String sex;
    private String age;
    private String work;

    public Resume(String name) {
        super(name);
    }

    public void setPersonalProfile(String age, String sex){
        this.sex = sex;
        this.age = age;
    }

    public void setWorkExpirence(String work) {
        this.work = work;
    }

    public void display() {
        System.out.println(name + ", " + sex + ", " + age);
        System.out.println(work);
    }

    @Override
    public Prototype getClone() {
        Resume resume = new Resume(this.name);
        resume.sex = this.sex;
        resume.age = this.age;
        return resume;
    }
}
