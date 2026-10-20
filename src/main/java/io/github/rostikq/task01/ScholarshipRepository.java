package io.github.rostikq.task01;

import java.math.BigDecimal;

public interface ScholarshipRepository {
    void save(String studentId, String studentName, double gpa, BigDecimal scholarship);
}

