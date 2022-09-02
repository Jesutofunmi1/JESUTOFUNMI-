package Chapter9;

public class Main {
    public static void main(String[] args) {
        Native omotola = new Native();
        omotola.eat();
        omotola.sleep();
        omotola.talk();
        System.out.println(omotola.learnJava());

        Facilitator grace = new Facilitator();
        String result = grace.teachJava();
        System.out.println(result);
    }
}
