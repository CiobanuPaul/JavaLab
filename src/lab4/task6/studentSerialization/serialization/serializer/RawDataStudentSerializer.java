package lab4.task6.studentSerialization.serialization.serializer;

import lab4.task6.studentSerialization.domain.Student;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class RawDataStudentSerializer implements StudentSerializer {
    @Override
    public void serialize(OutputStream outputStream, Student student) {
        try {
            ((ObjectOutputStream)outputStream).writeObject(student);
//            objectOutputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
