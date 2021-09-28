package warmup;

public class MovieWarmup implements Entertains{

    // 4. Create a class called Movie. The class should define two instance variables of type String named name and director. Add a constructor that takes two strings and sets the name and director properties based on the passed arguments. Make it so the instance variables are not accessible from outside the Movie class. Write getters and setters for the instance variables.
    // Bonus: if the passed name or director arguments are null or empty, the constructor should throw an IllegalArgumentException

    //instance variables
    private String name;
    private String director;

    //constructor


    public MovieWarmup(String name, String director) throws IllegalAccessException {
        if (name == null || name.isBlank() || director == null || director.isBlank() ){
            throw new IllegalAccessException();
        }
        this.name = name;
        this.director = director;
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public String getDirector() {
        return director;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDirector(String director) {
        this.director = director;
    }


    @Override
    public String audienceReaction() {
        return name + " oooooooh";
    }
}
