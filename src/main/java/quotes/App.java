package quotes;

/**
 * This is a class that is the entry way to my program.
 */
public class App {

    /**
     * This is the entry point to my program.
     * @param args command line arguments
     */
    public static void main(String[] args) {
        String file = "src/main/resources/recentquotes.json";

        Reader reader = new Reader(file);
        System.out.println(reader.getRandomQuote());
    }
}