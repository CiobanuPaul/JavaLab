package lab4.task6.studentSerialization.serialization.serializer;

import lab4.task6.studentSerialization.domain.Student;

import java.io.OutputStream;

public interface StudentSerializer {
    void serialize(OutputStream outputStream, Student student);
}
