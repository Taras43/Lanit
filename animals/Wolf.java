package animals;

public class Wolf extends Carnivorous implements Run, Voice {

    @Override
    public void run(int speed) {
        System.out.println("Волк бегает со скростью: "+speed);
    }
    @Override
    public String voice(int volume) {
        String answer = new String("Волк воет с громкостью: "+volume);
        return answer;
    }
}