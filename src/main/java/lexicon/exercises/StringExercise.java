package lexicon.exercises;

import java.time.LocalDate;

public class StringExercise {

    static void main() {
        IO.println("Hello and welcome to Java fundamentals_2 Exercises - String !!!!");
        exercise1();
        exercise2();
        exercise3();
        exercise4();
    }

    //Exercise 1 – Length of a String
    //What is the length of the String: "Java"?
    static void exercise1(){
       String text = "Java";
       IO.println(" Length of a String - Java is : "+text.length());
    }

    //Exercise 2 – Character at Index
    //What char is at index position 6 in the following String: "Long example sentence"?
    static void exercise2(){
        String text = "Long example sentence";
        IO.println(" Char at the index position 6 is : "+text.charAt(6));
    }

    //Exercise 3 – Index Position of 'o'
    //What is the index position of 'o' in the following String: "Even longer example sentence"?
    static void exercise3(){
        String text = "Even longer example sentence";
        IO.println(" Index position of ´o´ is : "+ text.indexOf("o"));
    }

    //Exercise 4 – Substring
    //Given the following String: "Ok this is not as long!", create a substring of only "not as long" (excluding the exclamation point) and print it out.
    static void exercise4(){
        String text = "Ok this is not as long!";
        IO.println(" Substring of \"Ok this is not as long!\" is : "+ text.substring(10,22));
    }
}
