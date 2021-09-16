package Animal;

public class AnimalTest {

    public static void main(String[] args) {
        Animal luna = new Dog();
        luna.name = "luna";
        System.out.println(luna.name);
        luna.responseToCommand("bark");

        Animal garfield = new Cat();
        garfield.name = "Garfield";
        System.out.println(garfield.name);
        garfield.responseToCommand("come here");

    }

}
