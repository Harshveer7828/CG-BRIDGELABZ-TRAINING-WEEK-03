package DoublyLinkedList.MovieManagementSystem;

public class MovieManagement {
    Movie head;


    // Add the movie at the beginning
    public void addMovieAtBeginning(String movieTitle, String director, int yearOfRelease, double rating) {
        Movie newMovie = new Movie(movieTitle, director, yearOfRelease, rating);
        if (head == null) {
            head = newMovie;
            return;
        }
        newMovie.next = head;
        head = newMovie;
    }

    // Add movie at specific position
    public void addMovieAtSpecificPos(String movieTitle, String director, int yearOfRelease, double rating, int position) {
        Movie newMovie = new Movie(movieTitle, director, yearOfRelease, rating);
        Movie current = head;
        if (current == null) {
            System.out.println("Movie list is empty add at the beginning");
            addMovieAtBeginning(movieTitle, director, yearOfRelease, rating);
            return;
        }
        int count = 0;

        while (current != null) {
            if (position - 1 == count){
                current.next.prev = newMovie;
                current.next = newMovie;
            }
            count++;
            current = current.next;
        }

    }

    // Display the list of movies
    void displayList() {
        Movie current = head;
        while (current != null) {
            System.out.println("movie :- " + current.movieTitle);
            current = current.next;
            System.out.println("----------------------");
        }
    }
}
