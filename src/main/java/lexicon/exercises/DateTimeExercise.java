package lexicon.exercises;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
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
        exercise6();
        exercise7();
        exercise8();
        exercise9();
        exercise10();
        exercise11();
        exercise12();
        exercise13();
        exercise14();
        exercise15();
        exercise16();
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

    //Exercise 6 – Future and Past Date
    //Create a LocalDate of current date plus 10 years and minus 10 months. From that date extract the month and print it out.
    static void exercise6(){
        LocalDate localDate = LocalDate.now();
        LocalDate futureDate = localDate.plusYears(10);
        IO.println("Month extracted by adding 10 years to the current date is :" + futureDate.getMonth());
        LocalDate pastDate = localDate.minusMonths(10);
        IO.println("Month extracted by minus 10 months to the current date is :" + pastDate.getMonth());
    }

    //Exercise 7 – Period Between Dates
    //Using the LocalDate from exercise 6 and your birthdate, create a Period between your birthdate and the date from exercise 6. Print out the elapsed years, months and days.
    static void exercise7(){
        LocalDate localDate = LocalDate.now();
        LocalDate birthdate = LocalDate.of(1990,10,18);
        Period period = Period.between(birthdate, localDate);
        IO.println("Elapsed years are : " + period.getYears() + ", Months are : "+period.getMonths()+ " and Days are : "+period.getDays() + " from my birthday (18-10-1990)");
    }

    //Exercise 8 – Add Period to Current Date
    //Create a period of 4 years, 7 months and 29 days. Then create a LocalDate of current date and add the period you created to the current date.
    static void exercise8(){
        LocalDate localDate = LocalDate.now();
        Period period = Period.of(4,7,29);
        localDate = (LocalDate) period.addTo(localDate);
        IO.println("Adding the period to the current date gives us the date : "+ localDate);
    }

    //Exercise 9 – Current Time
    //Create a LocalTime object of the current time.
    static void exercise9(){
        LocalTime localTime = LocalTime.now();
        IO.println("Local time now is  : "+ localTime);
    }

    //Exercise 10 – Nanoseconds of LocalTime
    //Extract the nanoseconds of a LocalTime object of current time. Print out the nanoseconds.
    static void exercise10(){
        LocalTime localTime = LocalTime.now();
        IO.println("Nanoseconds of Local time now is  : "+ localTime.getNano());
    }

    //Exercise 11 – Parse Time from String
    //Create a LocalTime object from a String using the `.parse()` method.
    static void exercise11(){
        String time = "12:10:37.327258100";
        LocalTime localTime = LocalTime.parse(time);
        IO.println("LocalTime from a String by using the `.parse()` method is : "+localTime);
    }

    //Exercise 12 – Formatted Current Time
    //Using `DateTimeFormatter` format LocalTime from current time and print it out as following pattern: **10:32:53**.
    static void exercise12(){
        LocalTime localTime = LocalTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String time = localTime.format(dateTimeFormatter);
        IO.println("Current Local time using DateTimeFormatter is : "+time);
    }

    //Exercise 13 – Specific LocalDateTime
    //Create a LocalDateTime with the date and time components as: **date: 2018-04-05, time: 10.00**.
    static void exercise13(){
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("YYYY-MM-dd HH:mm");
        String dateTime = localDateTime.format(dateTimeFormatter);
        IO.println("Current Local Date and time using DateTimeFormatter is : "+dateTime);
    }

    //Exercise 14 – Formatted LocalDateTime
    //Using `DateTimeFormatter` format the LocalDateTime object from exercise 13 to a String that should look like this: **torsdag 5 april 10:00**.
    static void exercise14(){
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("EEEE d MMMM HH:mm", new Locale("sv", "SE"));
        String dateTime = localDateTime.format(dateTimeFormatter);
        IO.println("Formatted date and time is  : "+dateTime);
    }

    //Exercise 15 – Combine Date and Time
    //Create a LocalDateTime object by combining LocalDate object and LocalTime object.
    static void exercise15(){
        LocalDate localDate =LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = localDate.atTime(localTime);
        IO.println("Combination of localdate and localtime is   : "+localDateTime);
    }

    //Exercise 16 – Extract Components from LocalDateTime
    //Create a LocalDateTime object. Then get the LocalDate and LocalTime components into separate objects of respective types from the LocalDateTime object.
    static void exercise16(){
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate localDate = localDateTime.toLocalDate();
        LocalTime localTime = localDateTime.toLocalTime();
        IO.println("Local date from LocalDateTime is  : "+localDate);
        IO.println("Local time from LocalDateTime is  : "+localTime);

    }
}
