package Facade;

import javafx.scene.media.SubtitleTrack;

import javax.annotation.processing.SupportedOptions;

/**
 * Created by yzhang on 23.08.17.
 */
public class Facade {
    SubSystemOne one;
    SubSystemTwo two;
    SubSystemThree three;
    SubSystemFour four;


    public Facade() {
        one = new SubSystemOne();
        two = new SubSystemTwo();
        three = new SubSystemThree();
        four = new SubSystemFour();
    }

    public void Method1() {
        System.out.println("Method 1");
        one.methodOne();
        two.methodTwo();
    }
    public void Method2() {
        System.out.println("Method 2");
        two.methodTwo();
        three.methodThree();
        four.methodFour();
    }

    public void Method3() {
        System.out.println("Method 3");
        one.methodOne();
        four.methodFour();
    }
}
