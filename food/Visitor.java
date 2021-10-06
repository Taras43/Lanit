package food;

import animals.Voice;

public class Visitor extends Meat implements Voice {
    public Visitor(){
        setEnergyValue(10);
        setPleasureOfEating(10);
    }

    @Override
    public String voice(int volume) {
        String string = "не ешьте меня";
        return string;
    }
}