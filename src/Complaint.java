public class Complaint {
    private Student student;
    private String message;

    public Complaint(Student student, String message) {
        this.student = student;
        this.message = message;
    }

    public Student getStudent() {
        return student;
    }

    public String getMessage() {
        return message;
    }
}
