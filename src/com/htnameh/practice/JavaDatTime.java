package com.htnameh.practice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class JavaDatTime {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();

        System.out.println(getDay(day, month, year));
    }

    public static String getDay(String day, String month, String year) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date date = formatter.parse(day + "/" + month + "/" + year);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);

            int i = calendar.get(Calendar.DAY_OF_WEEK);

            if (i == 1) {
                return "SUNDAY";
            } else if (i == 2) {
                return "MONDAY";
            } else if (i == 3) {
                return "TUESDAY";
            } else if (i == 4) {
                return "WEDNESDAY";
            } else if (i == 5) {
                return "THURSDAY";
            } else if (i == 6) {
                return "FRIDAY";
            } else if (i == 7) {
                return "SATURDAY";
            } else {
                return "";
            }
        } catch (ParseException e) { // note: parse method can throw ParseException
            e.printStackTrace();
            return "";
        }
    }
}
