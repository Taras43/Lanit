package animals;

public class Zebra extends Herbvore implements Run, Voice{
    @Override
    public void run(int speed) {
        System.out.println("Зебра бегает со скростью: "+speed);
    }

    @Override
    public String voice(int volume) {
        String answer = new String("Зебра ржёт с громкостью: "+volume);
        return answer;
    }
}