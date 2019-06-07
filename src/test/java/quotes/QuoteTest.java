package quotes;

import org.junit.Test;
import static org.junit.Assert.*;


public class QuoteTest {
    Quote quote;

    @Test
    public void init() {
        quote = new Quote(new String[]{}, "forrest gump", "123 likes", "life is like a box of chocolates");
    }

    @Test
    public void checkQuoteProps() {
        init();
        assertEquals("tags should be empty", 0, quote.getTags().length);
        assertEquals("author should be forrest gump", "forrest gump", quote.getAuthor());
        assertEquals("like should be 123 likes", "123 likes", quote.getLikes());
        assertEquals("text is 'life is like a box of chocolates'", "life is like a box of chocolates",
                quote.getText());
    }
}
