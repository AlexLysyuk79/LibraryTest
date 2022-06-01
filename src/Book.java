public class Book extends Publication {
    private String author;

    public Book(String name,int countPages, String author) {
        super(name,countPages);
        this.author = author;
    }

    @Override
    public String print() {
        return "Book{ " + super.print() + ", author : " + author +"}";
    }
}
// “Book{name=<название_книги>,countPages=<количество_страниц>,author=<автор_книги>}”
