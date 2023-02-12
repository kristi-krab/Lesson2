import java.util.Objects;

public class Book implements Printable {
    String name;
    public Book(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public void print() {
        System.out.println("Книги: " + getName());
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book Book = (Book) o;
        return Objects.equals(name, Book.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                '}';
    }
    public static void Books(Printable[] printables) {
        System.out.print("Книги: ");
        for (Printable print : printables) {
            if (print instanceof Book) {
                System.out.println(((Book) print).getName());
            }
        }
    }
}