public class Challenge_4 {
    public static void main(String[] args){
       /* Now that you have learned about methods and debugging, we are going to put it to the test. 
       
       Given the following code, there are several issues that need to be fixed. 
       There are 4 syntax errors and 7 logic errors.
       Once you fix them, the program should run correctly and print out the following:
       
       while loops:
       0, 1, 2, 3, 4, 5, 6, 7, 8, 9,
       115, 120, 125, 130, 135, 140, 145, 150, 155, 160, 165, 170,
       20, 18, 16, 14, 12, 10, 8, 6, 4, 2,
       100, 93, 86, 79, 72, 65, 58, 51, 44, 37, 30, 23, 16, 9, 2,
       1, 4, 9, 16, 25, 36, 49, 64, 81, 100,

       Note: some fixes that are unintended might cause other issues that would need to be solved.
       This also means there is more than one way to solve many of the issues presentoed. */

       System.out.println("while loops: ");
       
        int num1 = 0;
        int num2 = 115;
        int num3 = 22;
        int num4 = 100;
        int num5a = 1.0;
        double num5b = 1.0;

       do {
            Systems.out.print(num1 + ", ");
            num1 = num1 + 1;
        } while (num1 < 9);
         System.out.println();

       do {
            System.out.print(num2 + ",");
            num2 = num2 + 5;
        } while (num2 <= 170);
         System.out.println();
       
        do {
            System.out.print(num2 + ", ");
            num3 = num3 - 2;
         while (num3 >= 2);
         System.out.println();

       do {
            System.out.println(num4 + ", ");
            num4 = num4 - 9;
        } while (num4 >= 2);
         System.out.println();

       do {
            System.out.printf("%.0f, ", num5b); //%.0f is used to format the output to 0 decimal places
            num5a = num5a + 2;
            num5b = Math.pow((num5a), 2); //Math.pow is used to calculate the power of a number, in this case num5a^2
        } while (num5b <= 100)
         System.out.println();



       /* Given the below starting code, write a method that takes in 6 integers and returns the age of a person.

       The program should remain true for any date, so it should be able to calculate the age of a person based on their birthdate and the current date.
       
       Note: this is a simplified calculation and does not account for leap years or exact birth times. */

       int birthMonth = 10, birthDay = 15, birthYear = 1990;
       int currMonth = 10, currDay = 15, currYear = 2026;     

       System.out.println(getAge(birthMonth, birthDay, birthYear, currMonth, currDay, currYear)); 
    }   

    //---enter code here---



    /* Once you have completed the both challenges, you can move on to lesson 5.
    
    Unfortunately this is the end for now.
    Lesson 5 will be available soon, but for now I need to demo this to make sure it works!
    
    My hope is after testing to create 2 lessons and 1 challenege a week*/
}
