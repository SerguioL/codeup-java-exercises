public class VehicleTest {

    public static void main(String[] args) {
        Car challenger = new Car();
        challenger.setName("Challenger");
        System.out.println("This is a " + challenger.getName());
        challenger.makeNoise();
    }

}
