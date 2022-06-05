public class Library {
    public void printPublications (Publication[] publications){
        if (publications==null || publications.length == 0 ) {
            System.out.println("Array is null or No publications");
            return;
        }
        for (Publication publication: publications) {
            System.out.println(publication.print());
        }
    }
    public void addBook (Publication[] publications, Book book){

    }
}
