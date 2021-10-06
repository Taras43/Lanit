package animals;

public class Duck extends Herbvore implements Swim, Fly, Run, Voice{

    @Override
    public void fly(int height) {
        System.out.println("Утка летает на высоте: "+height);
    }

    @Override
    public void run(int speed) {
        System.out.println("Утка бегает со скростью: "+speed);
    }

    @Override
    public void swim(int speed) {
        System.out.println("Утка плавает со скростью: "+speed);
    }

    @Override
    public String voice(int volume) {
        String answer = new String("Утка крякает с громкостью: "+volume);
        return answer;
    }
}
