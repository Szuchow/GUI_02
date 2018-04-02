package com.company;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class StudentRepository implements Repository {
    List<Student> students = new ArrayList<Student>();

    public StudentRepository() {
        List<Student> students = new ArrayList<Student>();
    }
    public void list() {

    }
    @Override
    public void addStudent(Student s) {
        students.add(s);

    }
    /* @Override
    public boolean doesExist(Student s) {
        students.contains(s);
        return false;
    }
    */
@Override
public void doesExist(String name) {
        for (Student item : students) {
            if (item.getName().equals(name)) {
                System.out.println("Taki student istnieje");
            }
        }



    }
    @Override
    public void getList() {
        System.out.println(students);
    }
    @Override
    public String getSortedList() {
        Collections.sort(students);
        System.out.println(students);
        return null;
    }

}
