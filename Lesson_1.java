import java.util.Scanner;

public class Lesson_1 {
    public static void main(String[] args){
        
        //-------Introduction and Variables-------
        
        /* This is where you will learn the basics of java.
        Your lead should be able to help with the rest. 

        To start off, we need to make a varible.
        A varible stores a piece of data weather its a number, sentance, or letter.
        But, the program also needs you to declare what type of varible that is going to be.
        So, here are the important ones that you are going to need to know. */

        int integer = 3; //Stores only whole numbers from -2,147,483,648 to 2,147,483,647.
        //   ^^^^^  When naming varibles, try to keep it relevent

        double number = 3.14; //Stores numbers up to 15 decimal places
        //     ^^^^^  Note: The yellow underline is a warning that you are not using this varible. Your code will continue to run as normal.
        float worseNumber = 5.91f; //Stores numbers up to 7 decimal places, and must have a 
                                   //f at the end of the number to tell java that it is a float
        
        int integerFrac = integer/2; //When executed, it will only = 1 as it cuts of the end of 1.5

        double doubleFrac = integer/2.0; //When executed, it will = 1.5 as it converts the int to a double

        /* ints can be coverted to doubles, but doubles cannot be converted to ints
        Note: int's will always convert to a double unless you specify otherwise
        ex:*/ float floatFrac = integer/2.0f;

        //Note: ints use up 4 bytes while a double uses up 8 bytes

        String sentance = "Hello World 1+1=2"; //Stores numbers and letters as if it were a sentance
        //Strings must always be put in double quotes

        char letter = 'a'; //Stores a single letter or number
        //Chars must always be put in single quotes

        boolean bool = true; //Stores either true or false

        //-----------------------------------------------------------------------------
        
        /*There are MANY more but these are the ones that you will need to know for now.
        Now, using what you have learned so far, we are going to perform some basic math.

        - Make 3 integers named num1, num2, and num3 and assign them the numbers 5, 2, 7.
        - Make a new interger called average and assign it the average of the 3 integers.
        - Print out the average using System.out.println("Average: " + average); */

        //---Start code here---


        /*You will notice that it should print out the average as only 4 when it should be 4.666...
        Now we are going to fix this. There are multiple was to approch this.
        First, make average a double instead of an int.
        Then, pick one of the examples below to try on your code
        
        - Instead of dividing by 3, divide by 3.0
        - Change one of the num# variables to a double
        
        Note: By making just average a double, it will only print as 4.0 as the math is initially done and stored as an int

        -----------------------------------------------------------------

        This next section is not important to understanding java but will help will the learning experience.

        We will create what is called a scanner. This will allow us to take in user input and use it in our program.
        We will use this to take in the 3 numbers from the user instead of hard coding them in. 
        This will allow you to test our program with different numbers without having to change the code each time.

        How the scanner works is something that will be explained more as the lessons continue.
        For now, How the scanner is created will be done for you until an understanding is developed.
        */

        Scanner scnr = new Scanner(System.in); //This creates a new scanner object that will take in user input.
        //      ^^^^ This is the name of the scanner object. You can name it whatever you want.

        int num1 = scnr.nextInt(); //This will take in the next integer that the user inputs and assign it to num1.
        int num2 = scnr.nextInt(); //This will take in the next integer that the user inputs and assign it to num2.

        System.out.println(num1 + num2); //This will print out the sum of num1 and num2.
                  
        /* Try to run the program and input 5 and 2 into the terminal. It should print out 7.
        
        Feel free to mess around with this a little bit longer until you are confortable with varibles.
        Then, move on to Lesson 2 to learn about basic commands. */
        
    }
}
