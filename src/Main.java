public class Main {


    public static void main(String[] args) {
        Publication publication = new Publication("Book",60);
        System.out.println("publication created >>>>>>>>>>>>>");
        System.out.println(publication.print());

        Book book = new Book("nazvanie",500, "AuthorBooks");
        System.out.println("Book created >>>>>>>>>>>>>");
        System.out.println(book.print());


    }
}
