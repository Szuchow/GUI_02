package com.company;

import java.util.List;

public interface Repository {
    public void addStudent(Student s);
    public boolean doesExist(Student s);
    public List<Student> getList();
    public String getSortedList();
}
