package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

import java.util.Objects;

public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public String getGradeLevel(){
        String freshman = "Freshman";
        String sophomore = "Sophomore";
        String junior = "Junior";
        String senior = "Senior";

        if(numberOfCredits <= 29 )
            return freshman;
        else if(numberOfCredits <= 59)
            return sophomore;
        else if (numberOfCredits <= 89)
            return junior;
        else return senior;
    }

    public void addGrade(int courseCredits, double grade){

        double currentTotalQualityScore = gpa * numberOfCredits;
        currentTotalQualityScore += courseCredits * grade;
        numberOfCredits += courseCredits;

        gpa = currentTotalQualityScore / numberOfCredits;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentId=" + studentId +
                ", numberOfCredits=" + numberOfCredits +
                ", gpa=" + gpa +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return studentId == student.studentId &&
                numberOfCredits == student.numberOfCredits &&
                Double.compare(student.gpa, gpa) == 0 &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, studentId, numberOfCredits, gpa);
    }
}