package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {
    @Test
    public void testImplementation() {
        Instructor instructor1 = new Instructor(1,"Mrs.Puff");
        Assert.assertTrue(instructor1 instanceof Teacher);
    }

    @Test
    public void testInheritance() {
        Instructor instructor2 = new Instructor(1,"Dolio");
        Assert.assertTrue(instructor2 instanceof Person);
    }

    @Test
    public void testTeach () {
        Instructor instruct = new Instructor(2, "Ratburn");
        Student student = new Student(1, "Arthur");
        instruct.teach(student, 10);
        Assert.assertEquals(10,student.getTotalStudyTime(), .00 );
    }

    @Test
    public void testLecture () {
        Instructor instructor3 = new Instructor(1, "Croker");
        Student student1 = new Student (1, "Timmy");
        Student student2 = new Student (2, "Wanda");
        Student student3 = new Student (3, "Cosmo");
        Student[] studentarr = {student1,student2,student3};
        instructor3.lecture(studentarr,30);
        Assert.assertEquals(10, student1.getTotalStudyTime(),.00);
        Assert.assertEquals(10, student2.getTotalStudyTime(),.00);
        Assert.assertEquals(10, student3.getTotalStudyTime(),.00);

    }
}
