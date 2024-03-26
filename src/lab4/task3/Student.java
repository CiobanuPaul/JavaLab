package lab4.task3;

import java.util.HashMap;
import java.util.Map;

public class Student implements Cloneable{
    private String fullName;
    private Map<String, Double> courseInformation;

    public String getFullName() {
        return fullName;
    }

    public Map<String, Double> getCourseInformation() {
        return courseInformation;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setCourseInformation(Map<String, Double> courseInformation) {
        this.courseInformation = courseInformation;
    }

    public Student(String fullName, Map<String, Double> courseInformation) {
        this.fullName = fullName;
        this.courseInformation = courseInformation;
    }
    public Object clone() throws CloneNotSupportedException {
        Map<String, Double> newmap= new HashMap<String, Double>(courseInformation);
        return new Student(this.fullName, newmap);
    }

    @Override
    public String toString(){
        return fullName + " " + courseInformation.toString();
    }
}