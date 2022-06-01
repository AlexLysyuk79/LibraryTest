public class Repository {
    private Publication[] publicationsStorage;
    private static final int DEFAULT_ARRAY_SIZE = 16;
    public Repository() {

        this.publicationsStorage = new Publication[DEFAULT_ARRAY_SIZE];
    }

    public Repository(int repositorySize) {
        this.publicationsStorage = new Publication[repositorySize];
    }
}
