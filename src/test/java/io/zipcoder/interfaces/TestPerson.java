package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testConstructor() {
        long expectedID = 1L;
        String expectedName = "Jimmyjohn";
        Person testedPerson = new Person(expectedID, expectedName);
        long actualID = testedPerson.getId();
        String actualName = testedPerson.getName();
        Assert.assertEquals(testedPerson.getId(), actualID);
        Assert.assertEquals(testedPerson.getName(),actualName);


    }

    @Test
    public void testSetName() {
        Person setPerson = new Person (1,null);
        setPerson.setName("Frodo");
        Assert.assertEquals("Frodo", setPerson.getName());
    }

}
