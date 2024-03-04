package lab1.task2;

import java.util.Random;

public class Course {
    private String name;
    private double minimumGrade;
    private Student[] students;

    public String getName() {
        return name;
    }

    public double getMinimumGrade() {
        return minimumGrade;
    }

    public Student[] getStudents() {
        return students;
    }

    public Course(String name, double minimumGrade, Student[] students) {
        this.name = name;
        this.minimumGrade = minimumGrade;
        this.students = students;
    }

    public Student chooseStudentRandomly(){
        int rnd = new Random().nextInt(students.length);
        return students[rnd];
    }

    public Student[] showAllPassingStudents(){
        var passingStudents = new Student[students.length];
        for(int i=0; i< students.length; i++){
            if(students[i].getGrade() >= minimumGrade)
                passingStudents[i] = students[i];
        }
        return passingStudents;
    }

    public boolean isStudentPassing(Student s){
        for(var stud:students)
            if(stud == s && s.getGrade() >= minimumGrade)
                return true;
        return false;
    }

    public boolean isStudentPassing(int i){
        return students[i].getGrade() >= minimumGrade;
    }
}
