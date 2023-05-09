import java.io.*;
import java.util.*;

public class Watchlist {
    private ArrayList<Movie> movies;

    public Watchlist() {
        movies = new ArrayList<>();
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public void removeMovie(int index) {
        movies.remove(index);
    }

    public void printMovies() {
        System.out.println("Movies in Watchlist:");
        for (int i = 0; i < movies.size(); i++) {
            System.out.println((i+1) + ". " + movies.get(i));
        }
    }

    public void saveToFile(String fileName) {
        try {
            FileWriter fileOut = new FileWriter(fileName + ".txt");
            PrintWriter out = new PrintWriter(fileOut);
            for (Movie movie : movies) {
                out.println(movie);
            }
            out.close();
            fileOut.close();
            System.out.println("Watchlist saved to " + fileName + ".txt");
        } catch (IOException e) {
            System.out.println("Error saving watchlist to file: " + e.getMessage());
        }
    }
      
    public void loadFromFile(String fileName) {
        try {
            FileInputStream fileIn = new FileInputStream(fileName);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            movies = (ArrayList<Movie>) in.readObject();
            in.close();
            fileIn.close();
            System.out.println("Watchlist loaded from " + fileName);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading watchlist from file: " + e.getMessage());
        }
    }
}


