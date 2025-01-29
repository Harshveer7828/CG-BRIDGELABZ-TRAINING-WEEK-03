package DoublyLinkedList.MovieManagementSystem;

public class Main {
    public static void main(String[] args) {
        MovieManagement Cineplex = new MovieManagement();
        Cineplex.addMovieAtBeginning("puss In the boots","Harsh veer singh",2004,4.1);
        Cineplex.addMovieAtBeginning("Up1","Harsh veer singh",2004,4.1);
        Cineplex.addMovieAtBeginning("harry pottwe","Harsh veer singh",2004,4.1);
        Cineplex.addMovieAtSpecificPos("Up2","Harsh veer singh",2004,4.1,2);
        Cineplex.displayList();

    }
}
