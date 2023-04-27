import java.util.Scanner;

public class LibraryApp {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Library library = new Library();

        // Add dummy book data
        Book book1 = new Book("Book 1", "Author 1");
        Book book2 = new Book("Book 2", "Author 2");
        book1.setRating(4);
        book2.setRating(5);

        library.addBook(book1);
        library.addBook(book2);

        // Create a student
        Student student = new Student("ss1msim", 1);

        // Add student complaint
        System.out.println("Enter a complaint from the student:");
        String complaintMessage = scanner.nextLine();
        Complaint complaint = new Complaint(student, complaintMessage);
        library.addComplaint(complaint);

        // Add student order
        Order order = new Order(student, book1);
        library.addOrder(order);

        // Display book information and complaints
        library.displayBookInfo();
        library.displayComplaints();

        // Display book information
        library.displayBookInfo();
    }
}
