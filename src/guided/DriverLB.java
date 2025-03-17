package May12.Guided;

public class DriverLB {
    public static void main(String[] args) {
        LibraryBook lb = new LibraryBook();
        lb.setTitle("The Great Gatsby");
        lb.setAuthor("F. Scott Fitzgerald");
        lb.setIsBorrowed(true);
        System.out.println("Title: " + lb.getTitle());
        System.out.println("Author: " + lb.getAuthor());
        System.out.println("Is borrowed: " + lb.getIsBorrowed());
    }
}
