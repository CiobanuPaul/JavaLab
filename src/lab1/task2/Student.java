package lab1.task2;

import static java.lang.String.format;

public class Student {
    private String name;
    private double grade;

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }

    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }

    public String toString(){
        return "("+name+", "+ grade + ")";
    }
}
