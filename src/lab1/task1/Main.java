package lab1.task1;

import lab1.task2.Course;
import lab1.task2.Student;
import lab1.task2.StudentAllocator;

public class Main {
    public static void main(String[] args){
        Student[] vec = StudentAllocator.createStudents();
        Course course = new Course("Analiza", 7, vec);
        var passingStudents = course.showAllPassingStudents();
        for (var stud: passingStudents)
            if (stud != null)
                System.out.println(stud);

        System.out.println(course.isStudentPassing(course.chooseStudentRandomly()));
    }
}
