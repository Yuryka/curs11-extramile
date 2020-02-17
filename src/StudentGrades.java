import java.util.Objects;

public class StudentGrades {
    private final String name;
    private final String discipline;
    private final int grade;

    public StudentGrades(String name, String discipline, int grade) {
        this.name = name;
        this.discipline = discipline;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public String getDiscipline() {
        return discipline;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "StudentGrades{" +
                "name='" + name + '\'' +
                ", discipline='" + discipline + '\'' +
                ", grade=" + grade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentGrades that = (StudentGrades) o;
        return grade == that.grade &&
                Objects.equals(name, that.name) &&
                Objects.equals(discipline, that.discipline);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, discipline, grade);
    }
}

