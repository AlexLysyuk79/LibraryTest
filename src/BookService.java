import java.util.InputMismatchException;
import java.util.Scanner;

public class BookService {
    private final Repository repository;

    public BookService(Repository repository) {
        this.repository = repository;
    }

    public void addBookToRepository(Scanner scanner) {

        System.out.println("PLease enter Book Name : ");
        String bookName = scanner.nextLine();

        int bookPages;
        while (true) {
            try {
                System.out.print("Please enter amount of pages > ");
                bookPages = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Its not integer");
            }
        }
        System.out.println("PLease enter Book Author : ");
        String bookAuthor = scanner.nextLine();
        System.out.println("Author is " + bookAuthor + " |");


        Book book = new Book(bookName, bookPages, bookAuthor);
        repository.add(book);


    }


}
