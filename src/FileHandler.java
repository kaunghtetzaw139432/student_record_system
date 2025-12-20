import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileHandler {
    private static final String FILE_PATH = "D:\\java handling\\Student Record System\\src\\students.txt";

    public static String saveToFile(List<Student> students) {
        File file = new File(FILE_PATH);
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            for (Student s : students) {
                bw.write(s.getId() + "," + s.getName() + "," + s.getBirthday());
                bw.newLine();
            }
            return "Student records saved successfully to " + FILE_PATH;
        } catch (IOException e) {
            return "Error saving file: " + e.getMessage();
        }
    }

   
    public static List<Student> loadFromFile() {
        List<Student> students = new ArrayList<>();
        
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length >= 3) {
                    int id = Integer.parseInt(data[0].trim());
                    String name = data[1].trim();
                    String birthday = data[2].trim();
                    students.add(new Student(id, name, birthday));
                }
            }
            System.out.println("Student records loaded successfully from " + FILE_PATH);
            
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + FILE_PATH + ". Starting with empty list.");
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error parsing student ID in file");
        }
        
        return students;
    }

    
    public static void loadFromFile(List<Student> students) {
        students.clear();
        List<Student> loadedStudents = loadFromFile();
        students.addAll(loadedStudents);
    }
}