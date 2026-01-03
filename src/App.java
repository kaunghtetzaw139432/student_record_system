import java.util.Scanner;

public class App {
    static Scanner input;
    static StudentManager studentManager = new StudentManager();
    static FileHandler fileHandler = new FileHandler();

    public static void main(String[] args) throws Exception {
        input = new Scanner(System.in);
        do {
            int option;
            Helper.banner("Student Record System");
            System.out.println("1. Add Students");
            System.out.println("2. Update Student");
            System.out.println("3.Delete Student");
            System.out.println("4.Find Student By ID");
            System.out.println("5.Find Student By Name");
            System.out.println("6.List All Studesnt");
            System.out.println("7.Save To File");
            System.out.println("8.Load From File");
            System.out.println("9.Exist");
            System.out.print("Enter your option : ");
            option = input.nextInt();
            input.nextLine();
            switch (option) {
                case 1:
                    System.out.print("Enter Student ID : ");
                    int id = input.nextInt();
                    input.nextLine();
                    System.out.print("Enter Student Name : ");
                    String name = input.nextLine();
                    System.out.print("Enter Student DOB (YYYY-MM-DD) : ");
                    String birthday = input.nextLine();
                    String reslult = studentManager.addStudent(new Student(id, name, birthday));
                    System.out.println(reslult);
                    break;
                case 2:
                    System.out.print("Enter ID to update : ");
                    int uid = input.nextInt();
                    input.nextLine();
                    System.out.print("Enter Student New Name : ");
                    String newName = input.nextLine();

                    System.out.print("Enter Student new DOB (YYYY-MM-DD) : ");
                    String newBirth = input.nextLine();
                    System.out.println(studentManager.updateStudent(uid, newName, newBirth));
                    break;
                case 3:
                    System.out.print("Enter ID to delete : ");
                    int did = input.nextInt();
                    System.out.println(studentManager.deleteStudent(did));
                    break;
                case 4:
                    System.out.print("Enter ID to find student : ");
                    int fid = input.nextInt();
                    Student fs = studentManager.findStudentById(fid);
                    if (fs == null) {
                        System.out.println("No Student Found");
                    } else {
                        System.out.println("Student ID :" + fs.getId() + " \nStudent Name : " + fs.getName()
                                + "\nStudent Birthday :"
                                + fs.getBirthday());
                    }
                    break;
                case 5:
                    System.out.print("Enter Student Name to find :");
                    String fname = input.nextLine();
                    Student fn = studentManager.findByName(fname);
                    if (fn == null) {
                        System.out.println("No Student Found");
                    } else {
                        System.out.println("Student ID :" + fn.getId() + " \nStudent Name : " + fn.getName()
                                + "\nStudent Birthday :"
                                + fn.getBirthday());
                    }
                    break;

                case 6:
                    studentManager.allStudent();
                    break;
                case 7:

                    System.out.println(
                            studentManager.saveToFile());
                    break;

                case 8:

                    studentManager.loadFile();
                    System.out.println("Loaded from file");
                    break;

                case 9:
                    System.out.println("Exit program");
                    System.exit(0);
                    return;

                default:

            }
        } while (true);

    }
}
