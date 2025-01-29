package DoublyLinkedList.MovieManagementSystem;

public class Movie {
    String movieTitle;
    String director;
    int yearOfRelease;
    double rating;
    Movie next;
    Movie prev;
    Movie(String movieTitle, String director, int yearOfRelease, double rating){
        this.movieTitle = movieTitle;
        this.director = director;
        this.rating = rating;
        this.yearOfRelease = yearOfRelease;
        this.next = null;
        this.prev = null;
    }


}
