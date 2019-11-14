package io.zipcoder.interfaces;

public class Instructors extends People<Instructor> {
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

    @Override
    Instructor[] toArray() {
        Instructor[] instructortarr = new Instructor[3];
        for (int i = 0 ; i < INSTANCE.personList.size(); i ++){
            instructortarr[i] = INSTANCE.personList.get(i);
        }
        return instructortarr;
    }
}
