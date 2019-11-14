package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class ZipCodeTest {
    @Test
    public void testHostLecture(){
        ZipCodeWilmington zipcode = ZipCodeWilmington.getInstance();
        zipcode.hostLecture(1,30);
        HashMap <Student, Double > map = zipcode.getStudyMap();
        for (Student s: map.keySet()){
            Assert.assertEquals(10, s.getTotalStudyTime(), .00);
        }

    }
}
