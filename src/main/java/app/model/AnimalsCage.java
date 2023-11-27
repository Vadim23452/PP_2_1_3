package app.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {

    @Autowired
    @Qualifier("cat")
    private Animal animalCat;

    @Autowired
    @Qualifier("dog")
    private Animal animalDog;

    @Autowired
    private Timer time;

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animalCat.toString() + " " + animalDog.toString());
        System.out.println("At:");
        System.out.println(new Timer().getTime());
        System.out.println("________________________");
    }

    public Timer getTimer() {
        return time;
    }
}
