import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class WatchlistProgram {
    public static void main(String[] args) {
        Watchlist watchlist = new Watchlist();

        // Add some data
        watchlist.addMovie(new Movie("The Shawshank Redemption", 1994, "Drama"));
        watchlist.addMovie(new Movie("The Godfather", 1972, "Crime, Drama"));
        watchlist.addMovie(new Movie("The Dark Knight", 2008, "Action, Crime, Drama"));

        JFrame frame = new JFrame("Watchlist Program");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create components
        JLabel titleLabel = new JLabel("WATCHLIST PROGRAM");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 16));
        titleLabel.setHorizontalAlignment(JLabel.CENTER);

        JButton addMovieButton = new JButton("Add movie");
        JButton removeMovieButton = new JButton("Remove movie");
        JButton printWatchlistButton = new JButton("Print watchlist");
        JButton saveToFileButton = new JButton("Save watchlist to file");
        JButton exitButton = new JButton("Exit");

        JTextArea watchlistTextArea = new JTextArea();
        watchlistTextArea.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(watchlistTextArea);

        // Panel creation
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(2, 2));
        buttonPanel.add(addMovieButton);
        buttonPanel.add(removeMovieButton);
        buttonPanel.add(printWatchlistButton);
        buttonPanel.add(saveToFileButton);

        // Adding components
        frame.add(titleLabel, BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);
        frame.add(exitButton, BorderLayout.EAST);

        // Adding actions
        addMovieButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = JOptionPane.showInputDialog(frame, "Enter movie name:");
                int year = Integer.parseInt(JOptionPane.showInputDialog(frame, "Enter year:"));
                String genre = JOptionPane.showInputDialog(frame, "Enter genre:");

                Movie movie = new Movie(name, year, genre);
                watchlist.addMovie(movie);

                watchlistTextArea.setText(watchlist.toString());
            }
        }
        );

        removeMovieButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int index = Integer.parseInt(JOptionPane.showInputDialog(frame, "Enter index of movie to remove:"));
                watchlist.removeMovie(index - 1);

                watchlistTextArea.setText(watchlist.toString());
            }
        }
        );

        printWatchlistButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                watchlist.printMovies();
            }
        }
        );

        saveToFileButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                int userChoice = fileChooser.showSaveDialog(frame);
                if (userChoice == JFileChooser.APPROVE_OPTION) {
                    String filePath = fileChooser.getSelectedFile().getPath();
                    watchlist.saveToFile(filePath);
                    JOptionPane.showMessageDialog(frame, "Watchlist saved to file: " + filePath);
                }
            }
        }
        );

        exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        //frame properties
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}


