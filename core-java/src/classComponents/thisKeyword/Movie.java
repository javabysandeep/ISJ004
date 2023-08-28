package classComponents.thisKeyword;

public class Movie {
    int id;
    String movieName;



    public Movie() {
       //call param constructor from zero param con
        this(100,"Python");
        System.out.println("zero param");
    }

    public Movie(int id) {
        //this.id = id;
        //this(10);
    }

    public Movie(int id, String movieName) {
        //call zero param constructor from param con
         // this();
          //this(10);
        this.id = id;
        this.movieName = movieName;
        //  this();//CTE
    }

    public static void main(String[] args) {
        Movie movie = new Movie();
    }
}
