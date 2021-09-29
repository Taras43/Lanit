import model.Kotik;

public class Application {
    public static void main(String[] args) {
        Kotik Mars = new Kotik(5,"Mars",9,"meow");
        Kotik Barsik = new Kotik();
        Barsik.setPrettiness(3);
        Barsik.setName("Barsik");
        Barsik.setWeight(5);
        Barsik.setMeow("meow");

        Mars.liveAnotherDay();
        System.out.println("Name: "+Mars.getName());
        System.out.println("Weight: "+Mars.getWeight());
        System.out.println("the voices are similar? "+Mars.getMeow().equals(Barsik.getMeow()));

        System.out.println("QuantityKotik: "+Kotik.getQuantityKotik());
    }
}
