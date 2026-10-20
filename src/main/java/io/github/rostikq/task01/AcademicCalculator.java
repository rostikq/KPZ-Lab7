package io.github.rostikq.task01;

import java.math.BigDecimal;
import java.util.List;

public class AcademicCalculator {
    public AcademicCalculationResult calculate(List<CourseGrade> grades) {
        double totalWeightedScore = 0;
        int totalCredits = 0;
        boolean hasFailed = false;

        for (CourseGrade g : grades) {
            totalWeightedScore += g.getScore() * g.getEctsCredits();
            totalCredits += g.getEctsCredits();
            if (g.getScore() < 60) {
                hasFailed = true;
            }
        }

        double gpa = totalCredits == 0 ? 0.0 : totalWeightedScore / totalCredits;
        BigDecimal scholarship = BigDecimal.ZERO;

        if (!hasFailed) {
            if (gpa >= 90.0) {
                scholarship = new BigDecimal("2910.00");
            } else if (gpa >= 75.0) {
                scholarship = new BigDecimal("2000.00");
            }
        }

        return new AcademicCalculationResult(gpa, scholarship, hasFailed);
    }
}
