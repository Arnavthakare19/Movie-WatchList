import java.util.*;
public class WatchlistProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Watchlist watchlist = new Watchlist();
    
        // Add some movies to the watchlist
        watchlist.addMovie(new Movie("The Shawshank Redemption", 1994, "Drama"));
        watchlist.addMovie(new Movie("The Godfather", 1972, "Crime, Drama"));
        watchlist.addMovie(new Movie("The Dark Knight", 2008, "Action, Crime, Drama"));
    
        while (true) {
            System.out.println("\nWATCHLIST PROGRAM");
            System.out.println("-----------------\n");
            System.out.println("1. Add movie");
            System.out.println("2. Remove movie");
            System.out.println("3. Print watchlist");
            System.out.println("4. Save watchlist to file");
            System.out.println("5. Exit\n");
    
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
    
            switch (choice) {
                case 1:
                    System.out.print("Enter movie name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter year: ");
                    int year = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter genre: ");
                    String genre = sc.nextLine();
    
                    Movie movie = new Movie(name, year, genre);
                    watchlist.addMovie(movie);
    
                    System.out.println("Movie added to watchlist.");
                    break;
    
                case 2:
                    System.out.print("Enter index of movie to remove: ");
                    int index = sc.nextInt();
                    sc.nextLine();
    
                    watchlist.removeMovie(index - 1);
    
                    System.out.println("Movie removed from watchlist.");
                    break;
    
                case 3:
                    watchlist.printMovies();
                    break;
    
                case 4:
                    watchlist.saveToFile("watchlist");
                    break;
    
                case 5:
                    System.exit(0);
                    break;
    
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }
    }    
}
