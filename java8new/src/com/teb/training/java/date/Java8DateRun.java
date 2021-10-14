package com.teb.training.java.date;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.GregorianCalendar;

public class Java8DateRun {

    public static void main(final String[] args) {
        SimpleDateFormat dateFormatLoc = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        GregorianCalendar calendarLoc = new GregorianCalendar();
        //        calendarLoc.add(1,
        //                        Calendar.DAY_OF_MONTH);
        Date dateLoc = new Date();
        System.out.println(dateFormatLoc.format(calendarLoc.getTime()));
        long timeInMillisLoc = calendarLoc.getTimeInMillis();
        Date date2Loc = new Date(System.currentTimeMillis());

        // Java 8 Date library
        LocalDate localDateLoc = LocalDate.now()
                                          .plusDays(1);

        System.out.println(localDateLoc);

        LocalDateTime localDateTimeLoc = LocalDateTime.now()
                                                      .plusDays(1);

        long epochMilliLoc = ZonedDateTime.now()
                                          .plusWeeks(1)
                                          .toInstant()
                                          .toEpochMilli();

        ZonedDateTime ofLoc = ZonedDateTime.of(LocalDateTime.now(),
                                               ZoneId.of("Asia/Tokyo"));
        System.out.println(ofLoc);
        System.out.println(ZonedDateTime.now());
        System.out.println(localDateTimeLoc.format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss")));

        Duration betweenLoc = Duration.between(localDateTimeLoc,
                                               LocalDateTime.now());
        System.out.println(betweenLoc.toMillis());
    }

}
