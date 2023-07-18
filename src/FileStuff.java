import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class FileStuff {
    public ArrayList<Person> readFile(String path){
        try (BufferedReader reader = new BufferedReader(new FileReader(path))){
            ArrayList<Person> people = new ArrayList<>();
            String line;
            while ((line = reader.readLine())!=null){
                String[] data = line.split(" ");
                people.add(new Person(data[0],data[1], data[2], data[3], data[4], data[5]));
            }
            return people;
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
}
