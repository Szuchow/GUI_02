package com.company;
import java.util.List;
import java.util.ArrayList;

public class StudentRepository implements Repository {
    List<Student> students = new ArrayList<Student>();
    public void list() {

    }
    @Override
    public void addStudent(Student s) {
        students.add(s);

    }
    @Override
    public boolean doesExist(Student s) {
        students.contains(s);
        return false;
    }
    @Override
    public List<Student> getList() {
        // TODO Auto-generated method stub
        return students;
    }
    @Override
    public String getSortedList() {
        // TODO Auto-generated method stub
        return null;
    }

}
