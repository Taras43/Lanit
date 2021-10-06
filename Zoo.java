import animals.*;
import food.*;

public class Zoo {
    public static void main(String[] args) {
        Fish fishFirst = new Fish();
        Fish fishSecond = new Fish();
        Fish fishThird = new Fish();
        Duck duckFirst = new Duck();
        Duck duckSecond = new Duck();
        Duck duckThird = new Duck();
        Zebra zebra = new Zebra();
        Lion lion = new Lion();
        Wolf wolf = new Wolf();
        Tiger tiger = new Tiger();
        Pig pig = new Pig();
        Beef beef = new Beef();
        Visitor visitor = new Visitor();
        Oats oats = new Oats();
        Wheat wheat = new Wheat();
        Rye rye = new Rye();
        Worker worker = new Worker();
        worker.feed(lion,visitor);
        worker.feed(tiger,rye);
        worker.feed(fishFirst,beef);
        worker.feed(wolf,pig);
        worker.feed(duckFirst,wheat);
        worker.feed(zebra,oats);
        worker.getVoice(duckFirst);
        worker.getVoice(zebra);
        worker.getVoice(wolf);
        worker.getVoice(tiger);
        worker.getVoice(lion);

        Swim animals[]={fishFirst,fishSecond,fishThird,duckFirst,duckSecond,duckThird};
        for (Swim animal:animals){
            animal.swim(2);
        }

    }
}
