# **Java Fundamentals2 Exercises**
This task is about the understanding of the Data Time class and String Class in Java. 
I have used various String in-build methods and Date time in-build methods to work on various tasks given.

### **Date Time Exercise**
_Below are the exercises done for Data and Time class in Java:_

##### Exercise 1 – Current Date
##### Question
Create a LocalDate of the current day and print it out.

---

##### Exercise 2 – Formatted Current Date
##### Question
Create a LocalDate of the current day and print it out in the following pattern using `DateTimeFormatter`: **Torsdag 29 mars**.

---

##### Exercise 3 – Last Monday and the Entire Week
##### Question
Create a LocalDate of last Monday. Then print out the entire week in a loop using standard ISO format.

---

##### Exercise 4 – Parse Date from String
##### Question
Create a LocalDate object from a String by using the `.parse()` method.

---

##### Exercise 5 – Day of the Week
##### Question
The date time API provides enums for time units such as day and month. Create a LocalDate of your birthday and extract the day of week for that date.

**Example:** `1945-05-08` -> `TUESDAY`

---

##### Exercise 6 – Future and Past Date
##### Question
Create a LocalDate of current date plus 10 years and minus 10 months. From that date extract the month and print it out.

---

##### Exercise 7 – Period Between Dates
##### Question
Using the LocalDate from exercise 6 and your birthdate, create a Period between your birthdate and the date from exercise 6. Print out the elapsed years, months and days.

---

##### Exercise 8 – Add Period to Current Date
##### Question
Create a period of 4 years, 7 months and 29 days. Then create a LocalDate of current date and add the period you created to the current date.

---

##### Exercise 9 – Current Time
##### Question
Create a LocalTime object of the current time.

---

##### Exercise 10 – Nanoseconds of LocalTime
##### Question
Extract the nanoseconds of a LocalTime object of current time. Print out the nanoseconds.

---

##### Exercise 11 – Parse Time from String
##### Question
Create a LocalTime object from a String using the `.parse()` method.

---

##### Exercise 12 – Formatted Current Time
##### Question
Using `DateTimeFormatter` format LocalTime from current time and print it out as following pattern: **10:32:53**.

---

##### Exercise 13 – Specific LocalDateTime
##### Question
Create a LocalDateTime with the date and time components as: **date: 2018-04-05, time: 10.00**.

---

##### Exercise 14 – Formatted LocalDateTime
##### Question
Using `DateTimeFormatter` format the LocalDateTime object from exercise 13 to a String that should look like this: **torsdag 5 april 10:00**.

---

##### Exercise 15 – Combine Date and Time
##### Question
Create a LocalDateTime object by combining LocalDate object and LocalTime object.

---

##### Exercise 16 – Extract Components from LocalDateTime
##### Question
Create a LocalDateTime object. Then get the LocalDate and LocalTime components into separate objects of respective types from the LocalDateTime object.

---

##### Extra Challenge – Calendar for 2018
##### Question
Create your own calendar for the year 2018. The program should print out all days of the year, organized in a monthly calendar style.

**Expected output example (for January):**
```text
JANUARY
M   T   W   T   F   S   S
1   2   3   4   5   6   7
8   9   10  11  12  13  14
15  16  17  18  19  20  21
22  23  24  25  26  27  28
29  30  31
```


### **String Exercise**
_Below are the exercises done for String class in Java:_

##### Exercise 1 – Length of a String
##### Question
What is the length of the String: "Java"?

---

##### Exercise 2 – Character at Index
##### Question
What char is at index position 6 in the following String: "Long example sentence"?

---

##### Exercise 3 – Index Position of 'o'
##### Question
What is the index position of 'o' in the following String: "Even longer example sentence"?

---

##### Exercise 4 – Substring
##### Question
Given the following String: "Ok this is not as long!", create a substring of only "not as long" (excluding the exclamation point) and print it out.

---

##### Exercise 5 – Lowercase and Uppercase
##### Question
Convert the following String: "CAPS EQUALS SCREAMING" to lowercase and print it out. Then convert it back to uppercase and print it out again.

---

##### Exercise 6 – Trim String
##### Question
What is the output of the following String: "\tJ\ta\tv\ta\t" after you trim it?

---

##### Exercise 7 – Parse to String
##### Question
Parse the following int: 20 to a String and add a 20 to the end of the String. Printing it out should return: "2020".

---

##### Exercise 8 – Split String (Oil and Water)
##### Question
Oil and water don't go well together. Given the String: "Oil and Water", split them up into the words "Oil", "Water" and store them in a String array.

---

##### Exercise 9 – Split String (Names)
##### Question
Split the following String: "Carl,Susie,Fredrick,Bob,Erik" into an array. Print out all names separately.

---

##### Exercise 10 – Convert to Char Array
##### Question
Convert the following String: "ThisShouldBeConverted" to a char array. Iterate through the char array and print out each element.

---

##### Exercise 11 – Convert Char Array to String
##### Question
Convert the following char[]: {'J','a','v','a'} to a String and print it out.

