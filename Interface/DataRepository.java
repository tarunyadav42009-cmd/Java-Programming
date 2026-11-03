// Named as a descriptive noun. 
// "Repository" is a standard professional term for data handling.
public interface DataRepository {

    // Retrieves and returns a piece of text data
    String getData();

    // Saves new text data into the system
    void insertData(String data);

    // Updates existing data
    void updateData(String data);
}
