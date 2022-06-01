public class Journal extends Publication {
    private int publicationYear;
    private int number;

    Journal (String name, int countPages, int number, int publicationYear){
        super(name, countPages);
        this.publicationYear = publicationYear;
        this.number = number;
    }

    @Override
    public String print() {
        return "Journal{" + super.print() + " , number = " + number + ", year " + publicationYear + " }";
    }
}
// Journal{name=<название_журнала>,countPages=<количество_страниц>,number=<номер_журнала>,year=<год_публикации>}