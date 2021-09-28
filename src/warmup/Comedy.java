package warmup;

public class Comedy extends MovieWarmup {

    // Create a warmup.Comedy class that inherits from Movie
    //Add a protected instance variable named funny that is boolean
    //Add a protected instance variable named funny that is boolean
    // Write getters and setters for funny. The getter should be named isFunny

    protected boolean funny;

    public boolean isFunny() {
        return funny;
    }

    public void setFunny(boolean funny) {
        this.funny = funny;
    }

    public Comedy(String name, String director, boolean funny) throws IllegalAccessException {
        super(name, director);
        this.funny = funny;
    }
}

