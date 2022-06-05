public class Journal extends Publication {
    private final int publicationYear;
    private final int number;

    Journal (String name, int countPages, int number, int publicationYear){
        super(name, countPages);
        this.publicationYear = publicationYear;
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Journal journal = (Journal) o;

        if (publicationYear != journal.publicationYear) return false;
        return number == journal.number;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + publicationYear;
        result = 31 * result + number;
        return result;
    }

    @Override
    public String print() {
        return "Journal{" + super.print() + " , number = " + number + ", year " + publicationYear + " }";
    }
}
// Journal{name=<название_журнала>,countPages=<количество_страниц>,number=<номер_журнала>,year=<год_публикации>}