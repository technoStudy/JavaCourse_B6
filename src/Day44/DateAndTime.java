package Day44;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateAndTime {

    public static void main(String[] args) {

        // LocalDate
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current Date on my local: " + currentDate);

        LocalDate currentDateAustralia = LocalDate.now(ZoneId.of("Australia/Sydney"));
        System.out.println("Current Date for Australia/Sydney: " + currentDateAustralia);

        // LocalTime
        LocalTime currentTime = LocalTime.now();
        System.out.println("Current Time on my local: " + currentTime);

        LocalTime currentTimeEuropeParis = LocalTime.now(ZoneId.of("Europe/Paris"));
        System.out.println("Current Time for Europe/Paris: " + currentTimeEuropeParis);

        // LocalDateAndTime
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current Date and Time on my local: " + currentDateTime);

        DateTimeFormatter newFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss");
        String formattedDateAndTime = currentDateTime.format(newFormat);

        System.out.println(formattedDateAndTime);

    }

}
