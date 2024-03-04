package lab1.task2;

public class StudentAllocator {
    public static Student[] createStudents(){
        Student[] vec = {
                            new Student("ceva", 5),
                            new Student("ceva2", 7),
                            new Student("ceva3", 10),
                            new Student("ceva4", 3),
                            new Student("ceva5", 4)
                        }  ;
        return vec;
    }
}
