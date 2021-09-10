public class Fighter {
    //instance variable
    public String name;
    public int hitPoints;
    public int maxDamage;
    //method
    public void printStats(){
        System.out.println(name + " has " + hitPoints + " hit points and can do " + maxDamage + " damage.");
    }

    // DON'T DO THIS: PUT THE METHOD IN THE CLASS DEFINITION
//    public static void main(String[] args) {
//        Fighter arata = new Fighter();
//        arata.name = "Arata";
//        arata.hitPoints = 17;
//        arata.maxDamage = 14;
//        arata.printStats();
//    }

    public void battleRoar(){
        System.out.println("I am " + name + ", prepare to be defeated");
    }

    //you call a static method with a class name(e.g, D20.roll20())
    // but you call non-static method using a reference variable name
    public int attackRoll(){
        return D20.roll20();
    }

    // default constructor
    public Fighter(){

    }
    public Fighter(String name, int hitPoints, int maxDamage){
        System.out.println("A new fighter emerged");
        this.name = name;
        this.hitPoints = hitPoints;
        this.maxDamage = maxDamage;
        this.printStats();

    }

}
