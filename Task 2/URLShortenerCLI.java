import java.util.Scanner;

public class URLShortenerCLI {
    public static void main(String[] args) {
        URLShortener urlShortener = new URLShortener();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Shorten URL");
            System.out.println("2. Expand URL");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (choice == 1) {
                System.out.print("Enter long URL: ");
                String longURL = scanner.nextLine();
                String shortURL = urlShortener.shortenURL(longURL);
                System.out.println("Short URL: " + shortURL);
            } else if (choice == 2) {
                System.out.print("Enter short URL: ");
                String shortURL = scanner.nextLine();
                String longURL = urlShortener.expandURL(shortURL);
                System.out.println("Long URL: " + (longURL != null ? longURL : "Invalid short URL"));
            } else if (choice == 3) {
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
