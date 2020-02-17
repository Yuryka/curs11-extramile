import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentReader {

    public List<StudentGrades> readFile(String fileLocation) throws Exception {

        Scanner scanner = new Scanner(new FileReader(fileLocation));
        List<StudentGrades> students = new ArrayList<>();
        while (scanner.hasNextLine()) {
            StudentGrades studentGrades = fetchStudentGrades(scanner.nextLine());
            students.add(studentGrades);
            // System.out.println(studentGrades);
        }
        return students;
    }

    private StudentGrades fetchStudentGrades(String line) {
        String[] tokens = line.split("\\|");

        return new StudentGrades(tokens[0], tokens[1], Integer.parseInt(tokens[2]));
    }


}
