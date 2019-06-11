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
//
//        Reader reader = new Reader("starwars.txt",
//                "http://swquotesapi.digitaljedi.dk/api/SWQuote/RandomStarWarsQuote");

        Reader reader = new Reader("starwars1.txt",
                "doesnwork");
        System.out.println(reader.fetchFromAPI());

    }
}