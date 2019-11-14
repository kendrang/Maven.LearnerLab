package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class ZipCodeTest {
    @Test
    public void testHostLecture(){
        ZipCodeWilmington zipcode = ZipCodeWilmington.getInstance();
        zipcode.hostLecture(1,30);
        HashMap <Student, Double > zipmap = zipcode.getStudyMap();
        for (Student s: zipmap.keySet()){
            Assert.assertEquals(10, s.getTotalStudyTime(), .0001);
        }

    }
}
