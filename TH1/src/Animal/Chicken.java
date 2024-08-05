package Animal;

import Edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cuccuc-cuccuc!";
    }

    @Override
    public String howToEat() {
        return " an cuc";
    }
}

