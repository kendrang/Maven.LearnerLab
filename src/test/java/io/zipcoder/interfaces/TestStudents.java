package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudents {
    @Test
    public void testSingleton(){
        Students studentssingle = new Students();
        Person imhere = studentssingle.findById(1);
        Assert.assertEquals( "Kai", imhere.getName());
        Person imheretoo = studentssingle.findById(2);
        Assert.assertEquals( "Val", imheretoo.getName());
        Person imherealso = studentssingle.findById(3);
        Assert.assertEquals( "Ryan", imherealso.getName());

    }
}
