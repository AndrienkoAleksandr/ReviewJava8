package idefault.method.impl;

import idefault.method.PeopleBirthDay;

/**
 */
public class PeopleBirthDayImpl implements PeopleBirthDay {
    @Override
    public String getFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }
}
