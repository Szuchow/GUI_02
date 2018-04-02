package com.company;
import java.awt.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Student Eryk = new Student("RedBull", "Sebson", "609");
        Student Patrycja = new Student("Pryk", "Patrycja", "508");
        Student Kapi = new Student("Bernat-Januszkiewicz", "Kacper", "669");
        Student Agata = new Student("Somsiodka", "Agata", "102");
        Student Bombi = new Student("Bombastic", "Bombi", "666");

        StudentRepository Repo = new StudentRepository();
        Repo.addStudent(Eryk);
        Repo.addStudent(Patrycja);
        Repo.addStudent(Kapi);
        Repo.addStudent(Agata);
        Repo.addStudent(Bombi);


        System.out.println("Plain list");
        Repo.getList();


        System.out.println("Sorted list");
        Repo.getSortedList();

        Repo.doesExist("Kacper");

    }
}
