package movies;

public class Movie {

    //    private instance variables
    private String name;
    private String category;

    //========================================================

    //constructor
    public Movie(String name, String category){
        this.name=name;
        this.category=category;
    }

    //========================================================

    //getters and setters


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public static void filterMovies(String category){
        for (Movie m : MoviesArray.findAll()){
            if (m.getCategory().equals(category)){
                System.out.println(m.getName() + " -- " + m.getCategory());
            }
        }
    }

}
