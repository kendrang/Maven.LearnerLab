package io.zipcoder.interfaces;

public class Students extends People {
 private static final Students INSTANCE = new Students();

    protected Students() {
        super();
        super.add(new Student(1, "Kai"));
        super.add(new Student(2, "Val"));
        super.add(new Student(3, "Ryan"));
    }

    public static Students getInstance(){
        return INSTANCE;
    }
}
