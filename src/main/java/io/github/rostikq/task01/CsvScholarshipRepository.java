package io.github.rostikq.task01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CsvScholarshipRepository implements ScholarshipRepository {
    private final String filePath;

    public CsvScholarshipRepository(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void save(String studentId, String studentName, double gpa, BigDecimal scholarship) {
        String dateStr = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        String csvLine = String.format("%s;%s;%.2f;%s;%s%n", studentId, studentName, gpa, scholarship, dateStr);
        try (FileOutputStream fos = new FileOutputStream(filePath, true)) {
            fos.write(csvLine.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            System.err.println("Помилка експорту у CSV: " + e.getMessage());
        }
    }
}