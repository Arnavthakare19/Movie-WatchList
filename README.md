# MovieWatchlist Program
A simple program that allows users to create a watchlist of movies and perform various operations on it. The program is written in Java and consists of three classes:
 - Movie
 - Watchlist
 - WatchlistProgram

## Movie Class
The `Movie` class represents a movie and has the following properties:
- `name` - the name of the movie
- `year` - the year of release
- `genre` - the genre of the movie

The class has a constructor to create a new Movie object with the specified values for `name`, `year`, and `genre`. 
It also has getter methods to retrieve the values of these properties, and an overridden `toString()` method to print a string representation of the movie object.

## WatchList Class
The `WatchlistProgram` class is the main class that contains the main() method to run the program. 
It creates a new Watchlist object and adds some movies to it. It then displays a menu of options for the user to choose from:
 - Add a movie
 - Remove a movie
 - Print the watchlist
 - Save the watchlist to a file
 - Exit the program

Based on the user's choice, the program performs the corresponding operation on the watchlist. 
The program uses a `Scanner` object to read user input from the console.

## Usage
To use the program, compile the `WatchlistProgram.java` file and run it from the command line.
Follow the prompts to add, remove, print, and save movies in the `watchlist.txt`

**Note**: The program uses serialization to save and load the watchlist from a file. The saved file will be created in the same directory as the program, with the name watchlist.txt.
