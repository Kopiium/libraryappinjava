public class Book {
    private String title;
    private String author;
    private int rating;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.rating = 0;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
