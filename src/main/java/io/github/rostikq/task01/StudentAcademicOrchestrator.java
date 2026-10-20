package io.github.rostikq.task01;

import java.util.List;

public class StudentAcademicOrchestrator {
    private final AcademicValidator validator;
    private final AcademicCalculator calculator;
    private final TranscriptFormatter formatter;
    private final ScholarshipRepository repository;
    private final CuratorNotifier notifier;

    public StudentAcademicOrchestrator(AcademicValidator validator,
                                       AcademicCalculator calculator,
                                       TranscriptFormatter formatter,
                                       ScholarshipRepository repository,
                                       CuratorNotifier notifier) {
        this.validator = validator;
        this.calculator = calculator;
        this.formatter = formatter;
        this.repository = repository;
        this.notifier = notifier;
    }

    public void processStudentAcademicRecord(String studentId, String studentName, List<CourseGrade> grades, String curatorEmail) {
        validator.validate(studentId, studentName, grades);
        AcademicCalculationResult result = calculator.calculate(grades);
        String transcript = formatter.formatTranscript(studentId, studentName, grades, result);

        repository.save(studentId, studentName, result.getGpa(), result.getScholarshipAmount());
        notifier.notifyCurator(curatorEmail, studentName, transcript);
    }
}