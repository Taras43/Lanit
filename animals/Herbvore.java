package animals;
import food.Food;
import food.Grass;

public abstract class Herbvore extends Animal{
    @Override
    public void eat(Food food) {
        if(food instanceof Grass){
            System.out.println("Травоядное съело траву. Сытость: "+getSatiety()+", радость: "+getJoy());
            setSatiety(food.getEnergyValue());
            setJoy(food.getPleasureOfEating());
            food.getPleasureOfEating();
            System.out.println("Травоядное съело траву. Сытость: "+getSatiety()+", радость: "+getJoy());
        }
        else System.out.println("Травоядные не едят мясо");
    }
}