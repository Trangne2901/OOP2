

public class StudentImpl extends People implements Student {


    public StudentImpl(String name, int age, boolean gender) {
        super(name, age, gender);
    }

    @Override
    public String eat() {
        return "an cuc";
    }

    @Override
    public String sleep() {
        return "ngu ";
    }

    @Override
    public String study() {
        return "dang hoc bai";
    }

    @Override
    public String registerCourse(String course) {

        return course;
    }

    @Override
    public void attendClass() {
        return ;

    }

}
