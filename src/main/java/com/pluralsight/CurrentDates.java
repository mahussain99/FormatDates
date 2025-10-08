package com.pluralsight;

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class CurrentDates {
    public static void main(String[] args) {

      // Current date formate
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);

        System.out.println("============================");

        //Converting the current date to new formate date
        //Step 1 formating day first

        DateTimeFormatter newFormateDate = DateTimeFormatter.ofPattern( "dd/MM/yyyy");
        String dayFormate = newFormateDate.format(currentDate);
        System.out.println(dayFormate);

        System.out.println("============================");

        //Step 2: formating year first
        //String NewDateInput = "2025-10-07";
        DateTimeFormatter FormateDateChange = DateTimeFormatter.ofPattern( "yyyy-MM-dd");
        String yearFormate = FormateDateChange.format(currentDate);
        System.out.println(yearFormate);

        System.out.println("============================");

        //Step 3: formating month first
        DateTimeFormatter monthOfformate = DateTimeFormatter.ofPattern("MMMM d, yyyy");
        String monthFormate = monthOfformate.format(currentDate);
        System.out.println(monthFormate);
        // Step 4 "E, MMM dd, yyyy HH:mm:ss"
        ZonedDateTime nowGmt = ZonedDateTime.now(ZoneId.of("GMT"));
        DateTimeFormatter GMTformatter = DateTimeFormatter.ofPattern("EEEE, MMM d, yyyy HH:mm", Locale.ENGLISH);
        String formatted = nowGmt.format(GMTformatter);
        System.out.println(formatted + " in GMT");

        // Step 5 "E, MMM dd, yyyy HH:mm:ss"
        DateTimeFormatter timeOfformate = DateTimeFormatter.ofPattern("h:mm a 'on' dd-MMM-yyyy 'in local time zone'");
        String fullDayFormate = timeOfformate.format(currentDate);
        System.out.println(fullDayFormate);



    }
}
