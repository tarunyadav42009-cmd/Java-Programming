// Renamed to follow standard Java PascalCase naming conventions
public class NtrMain {
    public static void main(String[] args) {

        // Polymorphism: Declare as the Interface, instantiate as the Class
        DataRepository repository = new DataRepositoryImpl();

        // 1. Insert some mock AI/ML training data
        repository.insertData("Image_Dataset_V1.csv");

        // 2. Retrieve the data
        String dataset = repository.getData();
        System.out.println("Loaded: " + dataset);

        // 3. Update the data after preprocessing
        repository.updateData("Normalized_Image_Dataset_V1.csv");
    }
}
