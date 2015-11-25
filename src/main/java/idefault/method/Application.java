package idefault.method;

import idefault.method.impl.PeopleBirthDayImpl;

/**
 */
public class Application {

    public static void main(String[] args) {
        PeopleBirthDay peopleBirthDay = new PeopleBirthDayImpl();
        System.out.println(peopleBirthDay.getFullName("Tim", "Bennet"));
        System.out.println(peopleBirthDay.getAge(1996));
    }
}
