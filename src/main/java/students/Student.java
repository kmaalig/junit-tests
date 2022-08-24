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

    // returns the list of grades
    public ArrayList<Integer> getGrades(){
        return grades;
    }

    // adds the given grade to the grades list
    public void addGrade(int grade){
        grades.add(grade);
    }

    // removes the given grade from the grades list
    public void deleteGrade(int grade) {
       //
        for(int i = 0; i < getGrades().size(); i++) {
            // if the grade at the index is equal
            if(grade == getGrades().get(i)) {
                // remove grade
                grades.remove(i);
                break;
            }
        }
    }

    // updates the given grade based on index in the grades list
    public void updateGrade(int index, int grade) {
        grades.set(index, grade);
    }

    // returns the average of the students grades
    public double getAverage(){
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
