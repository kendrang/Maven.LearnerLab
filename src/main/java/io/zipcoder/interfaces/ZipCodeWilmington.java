package io.zipcoder.interfaces;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ZipCodeWilmington {
    private static final ZipCodeWilmington INSTANCE = new ZipCodeWilmington();
    Students students = Students.getInstance();
    Instructors instructors = Instructors.getInstance();

    private ZipCodeWilmington () {
    }

    public void hostLecture (Teacher teacher, double numberOfHours){
        Learner[] arr = Arrays.copyOf(students.toArray(), students.count(), Learner[].class);
        teacher.lecture(arr, numberOfHours);
    }

    public void hostLecture (long id, double numberOfHours){
     hostLecture((Teacher) instructors.findById(id), numberOfHours);
    }
    public HashMap<Student, Double> getStudyMap(){
        HashMap<Student,Double> studyMap = new HashMap<>();
        for (Person p : students){
            studyMap.put((Student) p,((Student)p).totalStudyTime);

        }
     return studyMap;
    }

    public static ZipCodeWilmington getInstance(){
        return INSTANCE;
    }

}
