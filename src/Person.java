import java.lang.constant.DynamicCallSiteDesc;

public class Person {
    public int height = 178, age = 1;

    public void myName(String myName){
        System.out.println("My name is " + myName);
    }

    public void say(String name) {
        System.out.println("Hello, " + name);
    }

    public void sayMyHeight(int sayMyHeight) {
        System.out.println("My height is " + height);
    }

    public void sayAge(int sayAge) {
        System.out.println("I'm " + age + " years!");
    }
//Конструктор
    public Person(int h, int ag){
        height = h;
        age = ag;
    }
}
