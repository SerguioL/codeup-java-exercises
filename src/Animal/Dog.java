package Animal;

public class Dog extends Animal{

    @Override
    public void responseToCommand(String command) {
        System.out.println("Obeys " + command + " dutifully...");
    }
}
