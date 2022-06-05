public class Book extends Publication {
    private final String author;

    public Book(String name,int countPages, String author) {
        super(name,countPages);
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Book book = (Book) o;

        return author.equals(book.author);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + author.hashCode();
        return result;
    }

    @Override
    public String print() {
        return "Book{ " + super.print() + ", author : " + author +"}";
    }
}

