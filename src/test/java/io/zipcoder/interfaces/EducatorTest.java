package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class EducatorTest {
    @Test
    public void testImplemntation() {
        Assert.assertTrue(Educator.DOLIO instanceof Teacher);
    }

    @Test
    public void testTeach() {
        Student student = new Student(1, "Arthur");
        Educator.DOLIO.teach(student, 10);
        Assert.assertEquals(10, student.getTotalStudyTime(), .00);
    }

    @Test
    public void testLecture() {
        Students students = Students.getInstance();
        Educator.FROILAN.lecture(Students.getInstance().toArray(), 30);
        Assert.assertEquals(10, Students.getInstance().findById(1).getTotalStudyTime(), .00);
        Assert.assertEquals(10, Students.getInstance().findById(2).getTotalStudyTime(), .00);
        Assert.assertEquals(10, Students.getInstance().findById(3).getTotalStudyTime(), .00);

    }
}
