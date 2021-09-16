package Animal;

abstract public class Animal {

    public int age;
    public int weight;
    public String species;
    public String name;

    abstract public void responseToCommand(String command);

    public void rest(int noOfHours) {
        for (int i = 0; i <= noOfHours; i += 1) {
            System.out.println("Zzzzzzz....");
        }
    }

}

