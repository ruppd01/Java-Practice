public class Lesson_3 {
    
    //-------Methods-------
    
    /* Now that you have learned about varibles and commands, we are going to learn about methods.
    Methods are a way to group together a set of commands that can be executed by calling the method.
    This is useful for when you want to execute the same set of commands multiple times in your program.
    It also makes your code more organized and easier to read.
        
    Even if your only using a method once, it helps make your code more organized and easier to read! */

    //Here is an example of a method that takes in 2 integers and returns the sum of them.
    public static int add(int num1, int num2){ 
        int sum = num1 + num2;
        return sum; //This will return the value of sum to the method that called it.
    }

    public static void main(String[] args){
        //To call this method, you would use the following command:
        int sum = add(5, 10); //This will return 15 and assign it to the varible sum.

        //You can also call this method multiple times with different arguments.
        int sum2 = add(3, 7); //This will return 10 and assign it to the varible sum2.

        //You can also use the return value of a method in another method.
        int sum3 = add(sum, sum2); //This will return 25 and assign it to the varible sum3.

        /* Heres a quick breakdown of a method.
        Methods can either be public or private. 
        Public methods can be called from anywhere in the program, while private methods can only be called from within the same class.

        Methods can also be static or non-static.
        Static methods can be called without creating an instance of the class, while non-static methods can only be called from an instance of the class.
        You will almost always use static methods for now.

        Methods can also have a return type, which is the type of value that the method will return. 
        If a method does not return a value, its return type is void. */

        //The same can be done inside of print statements.
        /* ex: */ System.out.println(add(5, 10));

        /* You will also notice that methods can be called within other methods. 
        Main, what we have been using so far, is a special method that serves as the entry point for the program. */

    }   //Now try to make your own method that takes in 2 integers and returns the difference of them.    
       
    //---enter code here---

    /* There are many more things that you can do with methods, but these are the basics.
    Feel free to experiment with methods and see what you can come up with! 
    
    Then, once you are comfortable with methods, you can move on to the next lesson.
    We will put methods to the test in Challenge 4! */    

}