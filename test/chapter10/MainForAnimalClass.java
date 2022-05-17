package chapter10;

import chapter10.CodeForAnimal.Animal;
import chapter10.CodeForAnimal.Fish;
import chapter10.CodeForAnimal.Rat;

public class MainForAnimalClass {
    public static void main(String[] args) {
        Animal rat = new Rat();
        Rat bigRat = new Rat();
        Fish scorpio = new Fish();

        rat.move();
        scorpio.move();
    }
}
