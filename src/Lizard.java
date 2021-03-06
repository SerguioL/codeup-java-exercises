public class Lizard {

//    Write a class called Lizard with one instance variable, String name, and a constructor that takes one argument, a String name. The constructor should throw an illegal argument exception if the a null value is passed into the name parameter. Optional: find out how to check if a string is empty or blank, and throw an illegal argument exception in that case, too.

//instance variable
public String name;

//constructor
public Lizard (String name) throws IllegalAccessException {
    if (name == null || name.isBlank()){
        throw new IllegalAccessException();
    }
    this.name =name;
}

}
