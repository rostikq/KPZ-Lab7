package io.github.rostikq.task01;

import java.util.List;

public class TranscriptFormatter {
    public String formatTranscript(String studentId, String studentName, List<CourseGrade> grades, AcademicCalculationResult result) {
        StringBuilder transcript = new StringBuilder();
        transcript.append("==========================================\n");
        transcript.append("АКАДЕМІЧНА ДОВІДКА: ").append(studentName).append(" (ID: ").append(studentId).append(")\n");
        transcript.append("==========================================\n");
        for (CourseGrade g : grades) {
            transcript.append(String.format("%-30s | %d Кредитів | Оцінка: %d%n", g.getCourseName(), g.getEctsCredits(), g.getScore()));
        }
        transcript.append("------------------------------------------\n");
        transcript.append(String.format("Середній бал (GPA): %.2f%n", result.getGpa()));
        transcript.append("Призначена стипендія: ").append(result.getScholarshipAmount()).append(" грн\n");
        return transcript.toString();
    }
}