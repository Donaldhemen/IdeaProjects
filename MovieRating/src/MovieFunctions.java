import java.time.LocalDateTime;
import java.util.ArrayList;

public class MovieFunctions {

    private String movieName;
    private LocalDateTime dateAdded;
    private ArrayList<Integer> ratings;

    public MovieFunctions(String movieName) {
        this.movieName = movieName;
        this.dateAdded = LocalDateTime.now();
        this.ratings = new ArrayList<>();
    }

    public String getMovieName(){

        return movieName;
    }

    public LocalDateTime getDateAdded() {
        return dateAdded;
    }


    public void addRating(int rating) {

        if(rating >= 1 && rating <= 5) {
            ratings.add(rating);
        }
    }

    public double getAverageRating() {

        if(ratings.isEmpty()){
            return 0;
        }

        double total = 0.0;

        for(int rating : ratings) {
            total += rating;
        }
        return total / ratings.size();
    }

    public int getNumberOfRatings() {
        return ratings.size();
    }
}
