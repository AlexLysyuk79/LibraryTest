import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
//     Publication publication = new Publication("Book",60);
//     System.out.println("publication created >>>>>>>>>>>>>");
//     System.out.println(publication.print());
//
//        Book book = new Book("nazvanie",500, "AuthorBooks");
//        System.out.println("\nBook created >>>>>>>>>>>>>");
//        System.out.println(book.print());
//
//        Journal journal = new Journal("Around the world", 345, 2, 1979);
//        System.out.println("\nJournal created >>>>>>>>>>>>>");
//        System.out.println(journal.print());
//
//        Publication[] pArray = {};

//        Library library = new Library();
//        System.out.println("\nLibrary created >>>>>>>>>>>>>");
//      library.printPublications(null);
//      library.printPublications(new Publication[0]);
//      library.printPublications(new Publication[] {new Journal("PC", 100, 1, 2021)});
//      library.printPublications(new Publication[]{new Book("Witcher", 200, "Andrzej Sapkowski")});
//      library.printPublications(new Publication[]{new Book("Master & Margarita", 300, "Mikhail Bulgakov"),
//              new Journal("Gamer", 101, 10, 2018)});

      Repository repository = new Repository(1);

        System.out.println("Repository Created");
        repository.addPublication (new Journal("PC", 100, 1, 2021));
        repository.addPublication (new Journal("PC", 100, 1, 2021));


    }
}
