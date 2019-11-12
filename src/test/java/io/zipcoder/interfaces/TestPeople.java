package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPeople {

    @Test
    public void testAdd (){
        People peoples = new People();
        Person person1 = new Person(1, "Marble");
        Person person2 = new Person(2, "Kermit");
        Person person3 = new Person(3, "Peach");
        peoples.add(person1);
        peoples.add(person2);
        peoples.add(person3);
        Assert.assertTrue(peoples.contains(person1));
        Assert.assertTrue(peoples.contains(person2));
        Assert.assertTrue(peoples.contains(person3));
    }

    @Test
    public void testRemove(){
        People peoples1 = new People();
        Person person1 = new Person(1, "Bob");
        peoples1.add(person1);
        peoples1.remove(person1);
        Assert.assertFalse(peoples1.contains(person1));

    }

    @Test
    public void testFindByID(){
        People peoples2 = new People();
        Person person1 = new Person(2, "Cheeseburger");
        peoples2.add(person1);
        Person actual = peoples2.findById(2);
        Assert.assertEquals(person1, actual);
    }
}
