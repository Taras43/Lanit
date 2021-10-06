package animals;

public class Fish extends Herbvore implements Swim{
    @Override
    public void swim(int speed) {
        System.out.println("Рыба плавает со скростью: "+speed);
    }
}