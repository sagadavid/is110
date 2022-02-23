import java.util.ArrayList;
import java.util.*;
//modul 4
public class Bibliophile {
    private ArrayList<String> books;

    public Bibliophile() {
        books = new ArrayList<>();
    }

    public void addBook(String bookName) {
        books.add(bookName);
    }

    public int getNumberOfBooks() {
        return books.size();
    }

    public void enlistLibrary() {
        System.out.println(books);
    }

    public void removeByIndex(int index) {
        if (index >= 0 && index < books.size()) {
            books.remove(index);
        }
    }

    public void removeByName(String name) {

        if (books.contains(name) == true) {
            int removalIndex = books.indexOf(name);
            System.out.println(removalIndex);
            books.remove(books.indexOf(name));
            books.remove(removalIndex);
        } else {
            System.out.println("no name, no delete");
        }

        System.out.println("the book which has name "+ name + " is deleted");
    }

    public void countBooks() {
        int counts = 0;
        for (String bookName : books) {
            counts++;
            System.out.println("books counted: " + counts);

        }
    }

    public void emptyLibrary() {
        Iterator iter = books.iterator();
        while (iter.hasNext()) {
            iter.next();
            iter.remove();
        }
        System.out.println("library terminated");

    }


}
