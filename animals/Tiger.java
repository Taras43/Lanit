package animals;

public class Tiger extends Carnivorous implements Run, Voice  {

    @Override
    public void run(int speed) {
        System.out.println("Тигр бегает со скростью: "+speed);
    }

    @Override
    public String voice(int volume) {
        String answer = new String("Тигр ревёт с громкостью: "+volume);
        return answer;
    }
}