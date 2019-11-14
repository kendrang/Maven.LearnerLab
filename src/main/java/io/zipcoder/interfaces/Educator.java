package io.zipcoder.interfaces;

public enum Educator implements Teacher{

   DOLIO(1, "Dolio"), FROILAN(2,"Froilan"), ROBERTO(3, "Roberto");



    final private Instructor instructor;
    private double timeWorked= 0;

    Educator(int i, String name) {
        instructor = new Instructor(i, name);
    };



    @Override
    public void teach(Learner learner, double numberOfHours) {
        instructor.teach(learner,numberOfHours);
        timeWorked += numberOfHours;
    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
        instructor.lecture(learners,numberOfHours);
        timeWorked += numberOfHours;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public double getTimeWorked() {
        return timeWorked;
    }
}
