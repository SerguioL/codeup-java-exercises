package Animal;

public class Cat extends Animal {


    @Override
    public void responseToCommand(String command) {
        System.out.println("Meow... coughs up hairball...");
    }
}
