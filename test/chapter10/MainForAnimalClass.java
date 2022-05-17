package chapter10;

public class MainForAnimalClass {
    public static void main(String[] args) {
        Animal rat = new Rat();
        Rat bigRat = new Rat();
        Fish scorpio = new Fish();

        rat.move();
        scorpio.move();
    }
}
