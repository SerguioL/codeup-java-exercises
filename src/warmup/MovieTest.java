package warmup;

import movies.Movie;

public class MovieTest {
    public static void main(String[] args) throws IllegalAccessException {
        Comedy funny = new Comedy("funny","Bob", true);
        System.out.println(funny.audienceReaction());
    }
}
