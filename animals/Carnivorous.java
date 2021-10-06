package animals;
import food.Food;
import food.Meat;


public abstract class Carnivorous extends Animal{
@Override
public void eat(Food food) {
        if(food instanceof Meat){
        setSatiety(food.getEnergyValue());
        setJoy(food.getPleasureOfEating());
        food.getPleasureOfEating();
        System.out.println("Хищник съел мясо. Сытость: "+getSatiety()+", радость: "+getJoy());
        }
        else System.out.println("Хищники не едят траву");
        }
        }