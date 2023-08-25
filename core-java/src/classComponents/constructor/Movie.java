package classComponents.constructor;

public class Movie {
    int movieId;
    String movieName;


    //no-args con
    public Movie() {
    }

    //all-args con
    public Movie(int movieId, String movieName) {
        this.movieId = movieId;
        this.movieName = movieName;
    }

    public static void main(String[] args) {
        Movie movie = new Movie(1,"Java");
    }
}
