package com.company;

import java.util.ArrayList;
import java.util.List;

public interface Repository {
    public void addStudent(Student s);
    public void doesExist(String name);
    public void getList();
    public String getSortedList();
}
