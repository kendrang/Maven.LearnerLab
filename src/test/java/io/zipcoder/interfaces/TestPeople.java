package io.zipcoder.interfaces;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestPeople {
    Person person;
    List<Person> personList;
    @Before
    public void setUp() throws Exception {
        person = new Person(2, "Josie");
        personList = new ArrayList<Person>();
    }
    @After
    public void tearDown() throws Exception {
    }
    @Test
    public void add() {
        personList.add(person);
        Assert.assertTrue(personList.contains(person));
    }
    @Test
    public void findById() {
        person.getId();
        Assert.assertEquals(2, person.getId());
    }
    @Test
    public void remove() {
        personList.remove(person);
        Assert.assertFalse(personList.contains(2));
    }
}