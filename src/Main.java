
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person nick = new Person(194, 28);; //Объект nick
        nick.say("Vasya");
        nick.myName("Nick");
        nick.sayMyHeight(nick.height);
        nick.sayAge(nick.age);
        System.out.println("");

        Person vasya = new Person(178, 33); //объекь vasya
        vasya.say("Nick");
        vasya.sayMyHeight(vasya.height);
        vasya.sayAge(vasya.age);
        Dog body = new Dog("Body", 5);
        body.dogName();
    }
}