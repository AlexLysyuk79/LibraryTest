import java.util.Arrays;

public class Repository {
    private Publication[] publications;
    private int cursor = 0;
    private static final int DEFAULT_ARRAY_SIZE = 16;

    public Repository() {

        this.publications = new Publication[DEFAULT_ARRAY_SIZE];
    }

    public Repository(int repositorySize) {
        this.publications = new Publication[repositorySize];
    }

    public void add(Publication publication) {
        if (cursor >= publications.length) {
            increaseArraySize();
        }
        publications[cursor] = publication;
        cursor++;
        System.out.println("Publication added");
    }

    public void delete(int index) {
        if (index >= 0 || index < cursor) {
            publications[index] = null;
            System.out.println("publication deleted at index " + index);
        }
    }

    public void delete(Publication publication) {
        for (int i = 0; i < publications.length; i++) {
            if (publications[i] != null && publications[i].equals(publication)) {
                publications[i] = null;
                System.out.println("publication deleted at index " + i);
            }
        }
    }

    public Publication find(int index) {
        if (cursor < index || index < 0) {
            return null;
        }
        return publications[index];
    }

    public boolean contains(Publication publication) {
        for (Publication currentPublication : publications) {
            if (currentPublication != null && currentPublication.equals(publication)) {
                return true;
            }
        }
        return false;
    }

    public void printAll() {
        for (Publication publication : publications) {
            if (publication != null) {
                System.out.println(publication.print());
            }
        }
    }

    public void arrayToString() {
        System.out.println(Arrays.toString(publications));
    }

    private void increaseArraySize() {
        Publication[] publicationsTemp = new Publication[publications.length * 2];
        System.arraycopy(publications, 0, publicationsTemp, 0, publications.length);
        publications = publicationsTemp;
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>size inreased. Size is " + publications.length);
    }
}
