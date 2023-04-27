import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<Complaint> complaints;
    private List<Order> orders;

    public Library() {
        books = new ArrayList<>();
        complaints = new ArrayList<>();
        orders = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void addComplaint(Complaint complaint) {
        complaints.add(complaint);
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public void displayBookInfo() {
        for (Book book : books) {
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("Rating: " + book.getRating());
            System.out.println();
        }
    }
    public void displayComplaints() {
        for (Complaint complaint : complaints) {
            System.out.println("Student Name: " + complaint.getStudent().getName());
            System.out.println("Student ID: " + complaint.getStudent().getId());
            System.out.println("Complaint: " + complaint.getMessage());
            System.out.println();
        }
    }
}
