package week1.day2.exercise8;

public class Main {
    public static void main(String[] args) {
        DataStorage<String> memoryStorage = new MemoryStorage<>();
        String data = "Sample Data";
        String id = memoryStorage.store(data);
        String retrievedData = memoryStorage.retrieve(id);
        System.out.println("Data retrieved from MemoryStorage: " + retrievedData);

        System.out.println();

        DataStorage<Integer> fileStorage = new FileStorage<>("C:\\Users\\baban\\OneDrive\\Skrivebord\\Datamatiker\\3 Tredje Semester\\BackEndExercisesByAhmad\\BackEndExercisesByAhmad\\src\\main\\java\\week1\\day2\\exercise8\\test.txt");
        Integer data2 = 42;
        String filename2 = String.valueOf(fileStorage.store(data2));
        Integer retrievedData2 = fileStorage.retrieve(filename2);
        System.out.println("Data retrieved from FileStorage: " + retrievedData2);
    }
}
