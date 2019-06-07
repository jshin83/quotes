package quotes;

public class Quote {
    String[] tags;
    String author;
    String likes;
    String text;

    Quote(String[] tags, String author, String likes, String text){
        this.tags = tags;
        this.author = author;
        this.likes = likes;
        this.text = text;
    }

    /** getters for the properties of quote**/
    public String[] getTags() {
        return tags;
    }

    public String getAuthor() {
        return author;
    }

    public String getLikes() {
        return likes;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString(){
        return String.format("%s\n%s", author, text);
    }

}
