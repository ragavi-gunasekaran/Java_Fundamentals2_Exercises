package lexicon.exercises;

import java.time.LocalDate;

public class StringExercise {

    static void main() {
        IO.println("Hello and welcome to Java fundamentals_2 Exercises - String !!!!");
        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise5();
        exercise6();
        exercise7();
        exercise8();
        exercise9();
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

    //Exercise 5 – Lowercase and Uppercase
    //Convert the following String: "CAPS EQUALS SCREAMING" to lowercase and print it out. Then convert it back to uppercase and print it out again.
    static void exercise5(){
        String text = "CAPS EQUALS SCREAMING";
        IO.println(" Lower case if the text give : "+ text.toLowerCase());
        IO.println(" Upper case if the text give : "+ text.toUpperCase());

    }

    //Exercise 6 – Trim String
    //What is the output of the following String: "\tJ\ta\tv\ta\t" after you trim it?
    static void exercise6(){
        String text = "\tJ\ta\tv\ta\t";
        text = text.trim();
        IO.println(" Trim the text give : "+ text);
    }

    //Exercise 7 – Parse to String
    //Parse the following int: 20 to a String and add a 20 to the end of the String. Printing it out should return: "2020".
    static void exercise7(){
        int n = 20;
        String text = String.valueOf(n)+"20";
        IO.println(" Parse to String : "+ text);
    }

    //Exercise 8 – Split String (Oil and Water)
    //Oil and water don't go well together. Given the String: "Oil and Water", split them up into the words "Oil", "Water" and store them in a String array.
    static void exercise8(){
        String text = "Oil and water";
        String[] newText = text.split("and");
        IO.println(" Split String (Oil and Water) : "+ newText[0] + " , "+newText[1]);
    }

    //Exercise 9 – Split String (Names)
    //Split the following String: "Carl,Susie,Fredrick,Bob,Erik" into an array. Print out all names separately.
    static void exercise9(){
        IO.println();
        String text = "Carl,Susie,Fredrick,Bob,Erik";
        String[] newText = text.split(",");
        IO.println(" Split String of (Carl,Susie,Fredrick,Bob,Erik) : ");
        for(String names:newText){
            IO.println(" "+names);
        }
    }

}
