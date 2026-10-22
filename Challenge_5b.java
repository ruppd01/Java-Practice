import java.util.Scanner;

public class Challenge_5b {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        /* This is the class where you will run you code through.
        The following challenge will requuire you to call in methods from Challenge_5a.
        
        You have already created the necessary objects and methods. 
        Now you will have to call those methods in to perform the required tasks.
        
        Here are the series of tasks that you will be required to do:
        - Call in the inputArray method from Challenge_5a.
        - Call in the sumArray method, then print out and label the sum of the array.
        - Call in the averageArray method, then print out and label the average of the array.
        - Call in the highLow method, printing out the highest and lowest value from the array.
        - Call in the sumArray method to print out and label the sum of the array given from the highLow method.
        - Call in the averageArray method to print out and label the average of the array given from the hgihLow method.
        
        The first task is already completed for you. 
        
        Note: When testing your code, the first imput must be from 1-20. 
        This will determine how many interger will go into the array. Then click Enter.
        Once on the next line, enter the integers that would go into each index of the array. */

        Challenge_5a methods = new Challenge_5a(); //This creates an object called input from the class Challenge_5a.
        
        int count = scnr.nextInt();
        int[] userList = methods.inputArray(count); //This will call the inputArray method from the Challenge_5a class.

        //-------enter code here-------


        /* Unfortunately this is the end for now.
        Lesson 6 will be available soon, but for now I need to demo this to make sure it works!
    
        My hope is after testing to create 2 lessons and 1 challenege every 2 weeks */
    }
}