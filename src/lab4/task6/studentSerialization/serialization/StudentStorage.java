package lab4.task6.studentSerialization.serialization;

import lab4.task6.studentSerialization.domain.Student;
import lab4.task6.studentSerialization.serialization.deserializer.StudentDeserializer;
import lab4.task6.studentSerialization.serialization.serializer.StudentSerializer;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class StudentStorage {
    private final StudentSerializer serializer;
    private final StudentDeserializer deserializer;

    public StudentStorage(StudentSerializer serializer, StudentDeserializer deserializer) {
        this.serializer = serializer;
        this.deserializer = deserializer;
    }

    public List<Student> readAllStudents(InputStream inputStream) {
        // TODO 6: Cu ajutorul deserializatorului, cititi din sursa studentii
        ObjectInputStream in = null;
        List<Student> ls = new ArrayList<Student>();
        try{
            in = new ObjectInputStream(inputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        while (true) {
            try {
                Student stud = (Student) in.readObject();
                ls.add(stud);
            } catch (IOException | ClassNotFoundException e) {
                break;
            }
        }
//        try {
//            in.close();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
        return ls;

    }

    public void writeAllStudents(OutputStream outputStream, List<Student> students) {
        // TODO 5: Cu ajutorul serializatorului, scrieti in sursa studentii
        ObjectOutputStream objectOutputStream = null;
        try {
            objectOutputStream = new ObjectOutputStream(outputStream);
            for(var stud:students){
                serializer.serialize(objectOutputStream, stud);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
