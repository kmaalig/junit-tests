package students;

import java.util.ArrayList;

public class Student {

    // fields for student class
    long id;
    String name;
    ArrayList<Integer> grades;

    // constructor to set name and id
    public Student(long id, String name) {
        this.id = id;
        this.name = name;
    }

    // initialize grades as empty arrayList
    public Student(ArrayList<Integer> grades) {
        this.grades = grades;
    }

    // returns the student's id
    public long getId(){

    }

    // returns the student's name
    public String getName(){

    }

    // adds the given grade to the grades list
    public void addGrade(int grade){

    }

    // returns the list of grades
    public ArrayList<Integer> getGrades(){

    }

    // returns the average of the students grades
    public double getGradeAverage(){

    }

}
