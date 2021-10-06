package model;

import java.util.Random;

public class Kotik {
    private static int numberOfCats =0;
    private int satiety=5;
    private int prettiness;
    private String name;
    private int weight;
    private String meow;
    public Kotik(){
        numberOfCats++;
    }
    public Kotik(int prettiness,String name,int weight,String meow){
        numberOfCats++;
        this.prettiness=prettiness;
        this.name=name;
        this.weight=weight;
        this.meow=meow;

    }
    public static int getQuantityKotik(){
        return numberOfCats;
    }

    public int getPrettiness() {
        return prettiness;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String getMeow() {
        return meow;
    }

    public void setPrettiness(int prettiness) {
        this.prettiness = prettiness;
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setMeow(String meow) {
        this.meow = meow;
    }

    public boolean sleep(){
        boolean answer = false;
        if(satiety<=0){
            answer=true;
            System.out.println("Хочу кушать");
        }
        else{
            System.out.println("Котик спит");
        }
        return answer;
    }
    public boolean running(){
        boolean answer = false;
        if(satiety<=0){
            answer=true;
            System.out.println("Хочу кушать");
        }
        else {
            System.out.println("Котик бегает");
        }
        return answer;
    }
    public boolean play(){
        boolean answer = false;
        if(satiety<=0){
            answer=true;
            System.out.println("Хочу кушать");
        }
        else {
            System.out.println("Котик играет");
        }
        return answer;
    }
    public boolean sit(){
        boolean answer = false;
        if(satiety<=0){
            answer=true;
            System.out.println("Хочу кушать");
        }
        else{
        System.out.println("Котик сидит");
        }
        return answer;
    }
    public boolean chaseMouse(){
        boolean answer = false;
        if(satiety<=0){
            answer=true;
            System.out.println("Хочу кушать");
        }
        else {
            System.out.println("Котик гоняет мышь");
        }
        return answer;
    }

    public void eat(int increaseSatiety){
        satiety=satiety+increaseSatiety;
    }
    public void eat(int increaseSatiety,String food){
        satiety=increaseSatiety;
    }
    public void eat(){
        eat(8,"milk");
    }
    public void liveAnotherDay(){
        for (int i=0; i<24; i++){
            Random r2= new Random();
            int random = r2.nextInt(5);
            if(random==0){
                if(false==sleep()) eat();
            }
            if(random==1){
                if(false==running()) eat();
            }
            if(random==2){
                if(false==play()) eat();
            }
            if(random==3){
                if(false==sit()) eat();
            }

            if(random==4){
                if(false==chaseMouse()) eat();
            }

        }

    }
}
