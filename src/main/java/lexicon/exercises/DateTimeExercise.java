package lexicon.exercises;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeExercise {

    static void main() {
        IO.println("Hello and welcome to Java fundamentals_2 Exercises !!!!");
        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise5();
    }

    //Exercise 1 – Current Date
    //Create a LocalDate of the current day and print it out.
    static void exercise1(){
        LocalDate localDate = LocalDate.now();
        IO.println("Current Local date is : "+localDate);
    }

    //Exercise 2 – Formatted Current Date
    //Create a LocalDate of the current day and print it out in the following pattern using `DateTimeFormatter`: **Torsdag 29 mars**
    static void exercise2(){
        LocalDate localDate = LocalDate.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("EEEE d MMMM", new Locale("sv", "SE"));
        String date = localDate.format(dateTimeFormatter);
        IO.println("Current Local date using DateTimeFormatter is : "+date);
    }

    //Exercise 3 – Last Monday and the Entire Week
    //Create a LocalDate of last Monday. Then print out the entire week in a loop using standard ISO format.
    static void exercise3(){
        LocalDate localDate = LocalDate.of(2026,02,23);
        for(int i = 1; i < 7 ; i++){
            LocalDate date = localDate.plusDays(i-1);
            IO.println("Day "+ (i + 1) + " of last week is : "+date);
        }
    }

    //Exercise 4 – Parse Date from String
    //Create a LocalDate object from a String by using the `.parse()` method.
    static void exercise4(){
        String date = "2026-03-04";
        LocalDate localDate = LocalDate.parse(date);
        IO.println("LocalDate from a String by using the `.parse()` method is : "+localDate);
    }

    //Exercise 5 – Day of the Week
    //The date time API provides enums for time units such as day and month. Create a LocalDate of your birthday and extract the day of week for that date.
    //Example: `1945-05-08` -> `TUESDAY`
    static void exercise5(){
        LocalDate localDate = LocalDate.of(1990,10,18);
        IO.println("'"+localDate+"'"+"  ->  "+"'"+localDate.getDayOfWeek()+"'");
    }

}
