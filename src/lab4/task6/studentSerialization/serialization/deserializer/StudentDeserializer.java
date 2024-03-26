package lab4.task6.studentSerialization.serialization.deserializer;

import lab4.task6.studentSerialization.domain.Student;

import java.io.InputStream;

public interface StudentDeserializer {
    Student deserializer(InputStream inputStream);
}
