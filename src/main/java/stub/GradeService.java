package stub;

import java.util.List;

public class GradeService {
    private final GradeSystem gradeSystem;

    public GradeService(GradeSystem gradeSystem) {
        this.gradeSystem = gradeSystem;
    }

    public double calculateAverageGrades(Student student) {
        List<Double> doubles = gradeSystem.gradesFor(student);

        double averageGrade = doubles.stream()
                .mapToDouble((grade) -> grade)
                .average()
                .orElse(0);

        return averageGrade;
    }
}
