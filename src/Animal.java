public class Animal {
    public String name;
    public String animal;
    public String sound;

    public void makeNoise(){

        System.out.println("My name is " + name + " I'm a " + animal + ", " + sound);
//        System.out.println(RandomQuote.quote(RandomQuote.random1to4()));
    }

    public Animal() {

    }

    public Animal(String name, String animal,String sound){
        this.name = name;
        this.animal = animal;
        this.sound = sound;
        this.makeNoise();

    }

}
