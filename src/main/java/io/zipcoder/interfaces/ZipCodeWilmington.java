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
//        Learner[] arr = Arrays.copyOf(students.toArray(), students.count(), Learner[].class);
        teacher.lecture(Students.getInstance().toArray(), numberOfHours);
    }

    public void hostLecture (long id, double numberOfHours){
       Teacher theTeach = instructors.findById(id);
     hostLecture(theTeach, numberOfHours);
    }

    public HashMap<Student, Double> getStudyMap(){
        HashMap<Student,Double> studyMap = new HashMap<>();
        for (Student p : students){
            studyMap.put( p,p.totalStudyTime);

        }
     return studyMap;
    }

    public static ZipCodeWilmington getInstance(){
        return INSTANCE;
    }

}
