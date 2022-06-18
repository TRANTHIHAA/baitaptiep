package NGAYBAY.animal;

import NGAYBAY.animal.edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    String makeSound() {
        return "cuc tac";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
