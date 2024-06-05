package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {

    private Animal animal;
    private Animal anotherAnimal;
    private Timer timer;

    @Autowired
    public AnimalsCage(@Qualifier("cat") Animal animal,
                       @Qualifier("dog") Animal anotherAnimal,
                       Timer timer) {
        this.animal = animal;
        this.anotherAnimal = anotherAnimal;
        this.timer = timer;
    }

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString() + "; " + anotherAnimal.toString());
        System.out.println("At:");
        System.out.println(new Timer().getTime());
        System.out.println("________________________");
    }

    public Timer getTimer() {
        return timer;
    }
}
