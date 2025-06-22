import java.util.Arrays;
import java.util.Comparator;

public class LibraryManagementSystem {

    Book[] books;
    int count;

    public LibraryManagementSystem(int capacity) {
        books = new Book[capacity];
        count = 0;
    }

    public void addBook(Book book) {
        if (count < books.length) {
            books[count++] = book;
        } else {
            System.out.println("Library is full. Cannot add more books.");
        }
    }

    public Book linearSearch(String title) {
        for (int i = 0; i < count; i++) {
            if (books[i].title.equalsIgnoreCase(title)) {
                return books[i];
            }
        }
        return null;
    }

    public Book binarySearch(String title) {
        int left = 0, right = count - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            int compare = books[mid].title.compareToIgnoreCase(title);
            if (compare == 0) {
                return books[mid];
            } else if (compare < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }

    public void sortBooksByTitle() {
        Arrays.sort(books, 0, count, Comparator.comparing(b -> b.title.toLowerCase()));
    }

    public void displayBooks() {
        for (int i = 0; i < count; i++) {
            System.out.println(books[i]);
        }
    }

    public static void main(String[] args) {
        LibraryManagementSystem library = new LibraryManagementSystem(10);

        // Adding motivational and inspirational books
        library.addBook(new Book(1, "The Power of Positive Thinking", "Norman Vincent Peale"));
        library.addBook(new Book(2, "Think and Grow Rich", "Napoleon Hill"));
        library.addBook(new Book(3, "The 7 Habits of Highly Effective People", "Stephen R. Covey"));
        library.addBook(new Book(4, "Man's Search for Meaning", "Viktor E. Frankl"));
        library.addBook(new Book(5, "Atomic Habits", "James Clear"));

        System.out.println("\nAll Books:");
        library.displayBooks();

        // Linear Search
        System.out.println("\nLinear Search for 'Atomic Habits':");
        Book result1 = library.linearSearch("Atomic Habits");
        if (result1 != null) System.out.println("Found: " + result1);
        else System.out.println("Book not found.");

        // Binary Search (requires sorted list)
        library.sortBooksByTitle();
        System.out.println("\nBinary Search for 'Think and Grow Rich':");
        Book result2 = library.binarySearch("Think and Grow Rich");
        if (result2 != null) System.out.println("Found: " + result2);
        else System.out.println("Book not found.");
    }
}
