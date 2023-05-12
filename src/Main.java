
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person nick = new Person(194, 28);; //Объект nick
        nick.say("Vasya");
        nick.myName("Nick");
        nick.sayMyHeight(nick.height);
        nick.sayAge(nick.age);
        System.out.println("");

        Person vasya = new Person(178, 33); //объект vasya
        vasya.say("Nick");
        vasya.sayMyHeight(vasya.height);
        vasya.sayAge(vasya.age);
        Dog body = new Dog("Body", 5);
        body.dogName();
        System.out.println("");

        Student newMan = new Student();
        newMan.age = 35;
        newMan.name = "Victor";
        newMan.tellName();
        newMan.sayAge(newMan.age);
        newMan.course = 3;
        newMan.tellCourse();
        System.out.println("");

        Student vitalya = new Student(188, "Vitalya", 2);
        vitalya.myName(vitalya.name);
        vitalya.sayAge(vitalya.age);
        vitalya.sayMyHeight(vitalya.height);
        vitalya.tellCourse();
    }
}