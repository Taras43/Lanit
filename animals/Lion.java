package animals;

public class Lion extends Carnivorous implements Run, Voice {

    @Override
    public void run(int speed) {
        System.out.println("Лев бегает со скростью: "+speed);
    }
    @Override
    public String voice(int volume) {
        String answer = new String("Лев ревёт с громкостью: "+volume);
        return answer;
    }
}
