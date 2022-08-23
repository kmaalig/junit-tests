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
        // initialize grades as empty arrayList
        this.grades = new ArrayList<>();
    }

    // returns the student's id
    public long getId(){
        return id;
    }

    // returns the student's name
    public String getName(){
        return name;
    }

    // adds the given grade to the grades list
    public void addGrade(int grade){
        grades.add(grade);
    }

    // removes the given grade from the grades list
    public void deleteGrade(int grade) {
        grades.remove(grade);
    }

    // updates the given grade based on index in the grades list
    public void updateGrade(int index, int grade) {
        grades.add(index, grade);
    }

    // returns the list of grades
    public ArrayList<Integer> getGrades(){
        return grades;
    }

    // returns the average of the students grades
    public double getGradeAverage(){
        // Set variable for grade average
        double average = 0;
        // Calculate grade average with for loop
        for (double grade:grades) {
            average += grade;
        }
        // Return average from grades [Arraylist]
        return average / grades.size();
    }

}
