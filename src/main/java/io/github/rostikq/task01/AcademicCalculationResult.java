package io.github.rostikq.task01;

import java.math.BigDecimal;

public class AcademicCalculationResult {
    private final double gpa;
    private final BigDecimal scholarshipAmount;
    private final boolean hasFailedCourses;

    public AcademicCalculationResult(double gpa, BigDecimal scholarshipAmount, boolean hasFailedCourses) {
        this.gpa = gpa;
        this.scholarshipAmount = scholarshipAmount;
        this.hasFailedCourses = hasFailedCourses;
    }

    public double getGpa() { return gpa; }
    public BigDecimal getScholarshipAmount() { return scholarshipAmount; }
    public boolean hasFailedCourses() { return hasFailedCourses; }
}