package io.zipcoder.interfaces;

public class Instructors extends People {
    private static final Instructors INSTANCE = new Instructors();

    protected Instructors() {
        super();
        super.add(new Instructor(1, "Dolio"));
        super.add(new Instructor(2, "Froilan"));
        super.add(new Instructor(3, "Roberto"));
    }

    public static Instructors getInstance(){
        return INSTANCE;
    }
}
