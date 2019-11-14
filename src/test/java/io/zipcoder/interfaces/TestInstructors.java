package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {
    @Test
    public void testSingleton() {
        Instructors instructorsSingle = Instructors.getInstance();
        Person imhere = instructorsSingle.findById(1);
        Assert.assertEquals("Dolio", imhere.getName());
        Person imheretoo = instructorsSingle.findById(2);
        Assert.assertEquals("Froilan", imheretoo.getName());
        Person imherealso = instructorsSingle.findById(3);
        Assert.assertEquals("Roberto", imherealso.getName());
    }
}
