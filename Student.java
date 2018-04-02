package com.company;
public class Student implements Comparable <Student> {

    private String surname;
    private String name;
    private String indeks;



    public Student(String surname, String name, String index) {
        this.surname = surname;
        this.name = name;
        this.indeks = indeks;
    }

    public Student() {}


    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String surname) {
        this.name = surname;
    }

    public String getIndeks() {
        return surname;
    }

    public void setIndeks(String surname) {
        this.surname = surname;
    }



    public String toString() {
        return name + " " + surname + " " + indeks;

    }



    public boolean equals(Object object) {
        if (object instanceof Student) {
            Student s = (Student)object;
            return this.indeks.equals(s.indeks);
        }
        return false;
    }



    @Override
    public int compareTo(Student o) {
        if(o instanceof Student) {
            Student s = (Student)o;
            return this.indeks.compareTo(s.indeks);
        }
        return 0;
        // return indeks.compareTo(o.indeks);
    }
}