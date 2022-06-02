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
    public void addPublication (Publication publication){
        int publicationsStorageSize = publications.length;
        increaseArraySize();
        publications[cursor] = publication;
        cursor ++;
        System.out.println("Publication added");
    }

    private void increaseArraySize() {
        if (cursor>=publications.length) {
            Publication[] publicationsTemp = new Publication[publications.length*2];
            for (int i =0; i< publications.length;i++) {
                publicationsTemp[i]=publications[i];
                publications=publicationsTemp;
            }
        }
    }
}
