
import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public Student findStudentById(int id) {
        for (Student s : students) {
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }

    public Student findByName(String name) {
        for (Student s : students) {
            if (s.getName().equalsIgnoreCase(name)) {
                return s;
            }
        }
        return null;
    }

    public String updateStudent(int id, String newName, String newBirthday) {
        for (Student s : students) {
            if (s.getId() == id) {
                s.setName(newName);
                s.setBirthday(newBirthday);
                return "Student updated";
            }
        }
        return null;
    }

    public void allStudent() {
        if (students.isEmpty()) {
            System.out.println("No students found");
        }
        for (Student s : students) {
            System.out.println("Student ID :" + s.getId() + " \nStudent Name : " + s.getName() + "\nStudent Birthday :"
                    + s.getBirthday());
            System.out.println();
        }
    }
 
     public String saveToFile(){
        return FileHandler.saveToFile(students);
     }

     public void loadFile(){
               FileHandler.loadFromFile(students);
     }

    public String deleteStudent(int id) {
        for (Student s : students) {
            if (s.getId() == id) {
                students.remove(s);
                return "Delete student";
            }
        }
        return "No students found";
    }

}
