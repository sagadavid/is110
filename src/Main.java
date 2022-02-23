public class Main {
    public static void main(String[] args) {
        System.out.println("hello av intellij Ide");
        Bibliophile vags = new Bibliophile();
        System.out.println(vags);
        vags.addBook("kolombus and his lies");
        vags.addBook("is it global or flat");
        vags.addBook("a conspiracy on conspiracies");
        vags.countBooks();
        vags.enlistLibrary();
        vags.removeByName("global");
        vags.enlistLibrary();
        vags.removeByIndex(1);
        vags.enlistLibrary();
        vags.addBook("global crisis and you");
        vags.enlistLibrary();
        vags.removeByName("crisis");
        vags.enlistLibrary();

    }
}
