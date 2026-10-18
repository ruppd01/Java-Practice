public class Lesson_4 {
    public static void main(String[] args){

        //-------Debugging-------

        /* Debugging is the process of finding and fixing errors in your code.
        It is an essential skill for any programmer, as it helps ensure that your programs work as intended.
        
        There are many different types of errors that can occur in your code, including syntax errors, runtime errors, and logic errors.
        - santax errors occur when you make a mistake in the structure of your code, such as forgetting a semicolon or misspelling a variable name.
        - runtime errors occur when your program is running and encounters an unexpected situation, such as trying to divide by zero.
        - logic errors occur when your program runs without crashing but produces incorrect results.

        It is important to learn how to identify and fix these errors, as they can be frustrating and time-consuming to deal with.
        Additionally, some techniques for debugging include using print statements to check the values of variables, only work when the program is running.
        
        Here are some common debugging techniques:
        1. Use System.out.println() to print out values of variables and check if they are what you expect.
        2. Use a debugger to step through your code line by line and see what is happening.
        3. Read the error messages carefully and try to understand what went wrong.
        4. Break down complex problems into smaller, more manageable parts using methods.
        5. Ask for help from others if you are stuck. 
        
        In this first example, we are running into a logic error.
        Try to use print statements to debug the following code.
        They see if you can fix the mistake presented. 
        
        Note: a palindrome is a word, phrase, or sequence that reads the same backward as forward. */

        String input = "Not a palindrome"; //assume this could be any string, and we want to check if it is a palindrome or not.
        //String input = "racecar"; //once you have fixed the code, try this input to see if it works correctly.
        boolean isPalindrome = true;
        int count = 0;

        String noSpaces = input.replace(" ", ""); //This will remove all spaces from the input string.
        int noSpaceLength = noSpaces.length()-1; //This will get the length of the string without spaces.
        //We add a -1 because strings assign each character a number starting at 0, so the last character is always length-1.

        for(int i = 0; i <= noSpaceLength-i; ++i){
            if(noSpaces.charAt(i) == noSpaces.charAt(noSpaceLength-i)){ //Checks if the character at the current index is equal to the character at the opposite index.
                count++;
            }
        }
        if(count == (noSpaceLength+2)/2){ //Checks if the count is equal to half the length of the string (rounded up).
            isPalindrome = false;
        }

        if(isPalindrome == true){
            System.out.println("palindrome: " + input);
        } else {
            System.out.println("not a palindrome: " + input);
        }

        /* Once you have fixed the code, try the input "racecar" to see if it works correctly.
        Assuming you have fixed the logic error, the output should be "palindrome: racecar".
        
        Now we are going to test a syntax error.
        delete the "//" on the following line and take a look at the error code given. */
        
        //System.out.println("This is a syntax error);

        /* You should notice a red underline under the line above.
        The error message should indicate that a closing quotation mark is missing along with what line the error is on.
        Fix the error by adding a closing quotation mark.

        The last type of error we are going to test is a runtime error.
        Delete the "//" on the following line and take a look at the error code given. */

        //int runtimeError = 5/0;
        
        /* You should notice that even though the code is correct, it will still give you an error when you run it.
        The error message should indicate that you are trying to divide by zero along with what line the error is on.
        runtime errors are often the most difficult to debug, as they can be caused by a variety of factors.
        
        The best way to prevent any type of errors is to try running your code every 10-20 lines or so.
        
        Once you fell comfortable with these concepts, move on to challenge 4!*/
    }
}