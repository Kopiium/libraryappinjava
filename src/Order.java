public class Order {
    private Student student;
    private Book book;

    public Order(Student student, Book book) {
        this.student = student;
        this.book = book;
    }

    public Student getStudent() {
        return student;
    }

    public Book getBook() {
        return book;
    }
}
