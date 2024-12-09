import java.util.Scanner;

public class SongDetails {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the Year
        System.out.print("Enter the year: ");
        int year = scanner.nextInt();  // Read integer input for the year
        scanner.nextLine();  // Consume the newline character left by nextInt()

        // Ask the user for the Genre
        System.out.print("Enter the genre: ");
        String genre = scanner.nextLine();  // Read string input for genre

        // Ask the user for the Album
        System.out.print("Enter the album: ");
        String album = scanner.nextLine();  // Read string input for album

        // Ask the user for the Song Title
        System.out.print("Enter the song title: ");
        String title = scanner.nextLine();  // Read string input for song title

        // Ask the user for the Artist
        System.out.print("Enter the artist: ");
        String artist = scanner.nextLine();  // Read string input for artist

        // Print the details as per the format
        System.out.println("\nSONG DETAILS");
        System.out.println("Year Released: " + year);
        System.out.println("Genre: " + genre);
        System.out.println("Album: " + album);
        System.out.println("Title: \"" + title + "\"");
        System.out.println("Artist: " + artist);

        // Close the scanner object to prevent resource leak
        scanner.close();
    }
}
