package students;

import org.junit.Before;
import org.junit.Test;

import java.awt.*;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class StudentTest {

    Student student;
    Student newStudent;
    Student passStudent;
    Student failStudent;

    @Before
    public void setUp() {

        // new instance of student class
        student = new Student(11, "Eleven");
        newStudent = new Student(1,"Noob");
        passStudent = new Student(1,"Pass");
        failStudent = new Student(1,"Fail");

        // set grades for students
        passStudent.addGrade(80);
        passStudent.addGrade(90);
        passStudent.addGrade(100);
        failStudent.addGrade(30);
        failStudent.addGrade(40);
        failStudent.addGrade(50);
    }

    @Test
    public void testGetId() {
        // expected long equals actual long
        assertEquals(11,student.getId());
    }

    @Test
    public void testGetName() {
        // expected string equals actual string
        assertEquals("Eleven",student.getName());
    }

    @Test
    public void testAddGrade() {
        // add a grade to arrayList for newStudent so that it is no longer empty
        newStudent.addGrade(75);
        // expected size of grades arrayList equals actual size of grades arrayList
        assertEquals(1,newStudent.getGrades().size());
        // grades arrayList contains added grade
        assertTrue(newStudent.getGrades().contains(75));
    }

    @Test
    public void testDeleteGrade() {
        failStudent.deleteGrade(30);
        // expected average equals actual average after deleteGrade
        assertEquals(45,failStudent.getAverage());
    }

    @Test
    public void testUpdateGrade() {
        passStudent.updateGrade(0,25);
        // expected element at index 0 to update grade to 25
        assertSame(25,passStudent.getGrades().get(0));
    }

    @Test
    public void testGetGrades() {

        // Actual grades
        student.addGrade(75);
        student.addGrade(90);
        student.addGrade(85);

        // ArrayList with expected grades
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(75);
        expected.add(90);
        expected.add(85);

        // Assertion
        assertEquals(expected,student.getGrades());
    }

    @Test
    public void testGetAverage() {
//        assertEquals()
    }
}
