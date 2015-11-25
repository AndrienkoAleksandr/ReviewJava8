package idefault.method;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 */
public interface PeopleBirthDay {
    String getFullName(String firstName, String lastName);

    default int getAge(int peopleBirthDay) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy");
        String yearLine = format.format(new Date());
        int currentYear = Integer.valueOf(yearLine);
        return currentYear - peopleBirthDay;
    }
}
