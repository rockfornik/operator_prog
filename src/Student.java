
public class Student extends Person {
    int course = 1;

    public Student (int height, String name, int course) {
        this.course = course;
        super.height = height;
        super.name = name;
    }
    public Student (){}
    void tellName (){
        System.out.println("I'm is new student " + super.name);
    }
    void tellCourse(){
        System.out.println("My course is " + course);
    }
}
