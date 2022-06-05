import java.util.Scanner;

public class Main {
    private static final String HELP_COMMAND = "help";
    private static final String EXIT_COMMAND = "exit";
    private static final String ADD_BOOK_COMMAND = "add";



    public static void main(String[] args) {
        String input;
        Scanner scanner = new Scanner(System.in);
        Repository repository = new Repository();

        label:
        while (true) {
            System.out.println("waiting for input");
            input = scanner.nextLine();
            switch (input) {
                case HELP_COMMAND:
                    System.out.println("enter HELP to see all Commands");
                    System.out.println("enter EXIT to Exit");
                    System.out.println("enter " + ADD_BOOK_COMMAND + " to add a Book");
                    break;
                case ADD_BOOK_COMMAND:
                    System.out.println("Now we try to add new book");
                    BookService bookService = new BookService(repository);
                    bookService.addBookToRepository(scanner);
                    break label;
                case EXIT_COMMAND:
                    System.out.println("buy");
                    break label;
                default:
                    System.out.println("Command not found");
                    break;
            }
        }
        scanner.close();
        repository.printAll();
        repository.arrayToString();

    }
}
