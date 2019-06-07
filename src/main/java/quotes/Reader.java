/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package quotes;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Random;


public class Reader {
    //will hold our read-in file of quotes
    private Quote[] quotes;

    public Reader(String theFile){
        this.quotes = readQuote(theFile);
    }

    //Helper - reads in file and saves to array
    private Quote[] readQuote(String file){
        Gson gson = new Gson();

        try {
            JsonReader reader = new JsonReader(new FileReader(file));
            quotes = gson.fromJson(reader, Quote[].class);
        } catch (FileNotFoundException e) {
            throw new IllegalArgumentException("File not found - check file path");
        }

        return quotes;
    }

    /**
     * Getter for array of quotes
     * @return String[] of quotes
     */
    public Quote[] getQuotes() {
        return quotes;
    }

    /**
     * Gets a random quote and author from Quote array.
     * @return String, quote and who stated it
     */
    public String getRandomQuote(){
        int randIndex = new Random().nextInt(quotes.length);
        // use my fancy toString()
        // which is equivalent to = quotes[randIndex].getAuthor() + "\n" + quotes[randIndex].getText();
        return quotes[randIndex].toString();
    }

}
