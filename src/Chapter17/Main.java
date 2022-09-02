package Chapter17;

public class Main {
    public static void main(String... args) {

        Human h = ()-> System.out.println("I am a man!");
        h.speak();
        Human woman = ()-> System.out.println("I am a woman!");
        woman.speak();
        Human boy = ()-> System.out.println("My name is Boyo!");
        boy.speak();
        Human girl = ()-> System.out.println("My name is Jummy!");
        girl.speak();

    }
}
