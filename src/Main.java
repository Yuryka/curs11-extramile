import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        StudentReader reader = new StudentReader();
        List<StudentGrades> students = reader.readFile("grades.txt");
        System.out.println(students);
        ClassRoom classroom = new ClassRoom(students);
        System.out.println(classroom.getGrades("Computer Science"));
    }
}
