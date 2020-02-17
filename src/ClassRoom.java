import java.util.ArrayList;
import java.util.List;

public class ClassRoom {
    private final List<StudentGrades> students;

    public ClassRoom(List<StudentGrades> students) {
        this.students = new ArrayList<>(students);
    }

    public List<Integer> getGrades(String discipline) {
        List<Integer> result = new ArrayList<>();
        for (StudentGrades student : students) {
            if (student.getDiscipline().equals(discipline)) {
                result.add(student.getGrade());
            }
        }
        return result;
    }
}
