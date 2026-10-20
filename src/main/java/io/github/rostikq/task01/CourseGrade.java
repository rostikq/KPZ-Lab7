package io.github.rostikq.task01;

import java.util.Objects;

public class CourseGrade {
    private final String courseName;
    private final int score;
    private final int ectsCredits;

    public CourseGrade(String courseName, int score, int ectsCredits) {
        this.courseName = Objects.requireNonNull(courseName, "Course name required");
        this.score = score;
        this.ectsCredits = ectsCredits;
    }

    public String getCourseName() { return courseName; }
    public int getScore() { return score; }
    public int getEctsCredits() { return ectsCredits; }
}