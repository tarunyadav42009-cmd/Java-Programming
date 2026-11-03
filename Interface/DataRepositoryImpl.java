// Class names should start with a capital letter
public class DataRepositoryImpl implements DataRepository {

    // @Override ensures you match the interface exactly
    @Override
    public String getData() {
        System.out.println("Fetching data from the repository...");
        return "Sample ML Dataset"; // Returns data as promised by the interface
    }

    @Override
    public void insertData(String data) {
        System.out.println("Inserting new data: " + data);
    }

    @Override
    public void updateData(String data) {
        System.out.println("Updating existing data with: " + data);
    }
}
