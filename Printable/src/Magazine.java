import java.util.Objects;

public class Magazine implements Printable {
    String name;
    public Magazine(String name) {
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
        System.out.println("Журналы: " + getName());
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Magazine Magazine = (Magazine) o;
        return Objects.equals(name, Magazine.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
    @Override
    public String toString() {
        return "Magazine{" +
                "name='" + name + '\'' +
                '}';
    }
    public static void Magazines(Printable[] printables) {
        System.out.print("Журналы: ");
        for (Printable print : printables) {
            if (print instanceof Magazine) {
                System.out.println(((Magazine) print).getName());
            }
        }
    }
}
