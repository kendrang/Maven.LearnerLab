package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {
    @Test
    public void testImplementation () {
        Student iStudent = new Student(1, "Chris");
        Assert.assertTrue(iStudent instanceof Learner );
    }

    @Test
    public void testInheritance() {
        Student aStudent = new Student (1, "Brad");
        Assert.assertTrue(aStudent instanceof Person);
    }

    @Test
    public void testLearn() {
        Student student = new Student (1, "Claire");
        student.learn(80);
        student.learn(20);
        Assert.assertEquals(100, student.getTotalStudyTime(), .00001);

    }

}
