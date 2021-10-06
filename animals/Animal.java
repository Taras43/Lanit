package animals;
import food.Food;

public abstract class Animal {
    private int satiety;
    private int joy;

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    public void setJoy(int joy) {
        this.joy = joy;
    }

    public int getSatiety() {
        return satiety;
    }

    public int getJoy() {
        return joy;
    }

    abstract public void eat(Food food);
};
