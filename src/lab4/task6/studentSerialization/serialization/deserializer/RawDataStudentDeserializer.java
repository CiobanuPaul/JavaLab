package lab4.task6.studentSerialization.serialization.deserializer;

import lab4.task6.studentSerialization.domain.Student;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class RawDataStudentDeserializer implements StudentDeserializer{
    @Override
    public Student deserializer(InputStream inputStream) {
        ObjectInputStream objectInputStream = null;
        Student stud = null;
        try{
            objectInputStream = new ObjectInputStream(inputStream);
            stud = (Student) objectInputStream.readObject();
//            objectInputStream.close();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return stud;
    }
}
