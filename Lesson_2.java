public class Lesson_2 {
    public static void main(String[] args){

        //-------Commands-------

        /* Now that you have learned about varibles, we are going to learn about commands.
        Commands are what tell the computer what to do. They are the instructions that you give to the computer.
        There are many commands in java, but we are going to focus on the ones that you will need to know for now.
        The first command that we are going to learn about is the print command. This command will print out a message
        to the terminal. The terminal is where you will see the output of your program. */

        System.out.println("Hello World!"); //This command will print out "Hello World!" to the terminal.
       
        /* The if command is used to make decisions in your program. 
        It will check if a condition is true or false and then execute based on that condition. 

        The else if command is used in conjunction with the if command.
        It will check if a condition is true or false and then execute based on that condition if the previous condition is false.

        The else command is used in conjunction with the if command. 
        It will execute if the condition in the if command is false. */

        int num = 5; //We are going to use this varible in our if command.

        if(num < 3){ //This condition checks if num is less than 3.
            System.out.println("Num is less than 3!"); //If the condition is true, this will execute.

        } else if(num == 3) { //If the condition in the if command is false and num = 3, this will execute.
            System.out.println("Num is equal to 3!"); 

        } else { //If the condition in the if and else if commands is false, this will execute.
            System.out.println("Num is greater than 3!");
        }    

        /* There is a few mathematical operations that varry from normal operations. 
        These include:
        - The increment operator (++) and the decrement operator (--). 

        - The compound assignment operators (+=, -=, *=, /=). This means that you can add, subtract, multiply, or divide
            a varible by a number and assign the result to the varible in one step.

        - The comparison operators (==, !=, <, >, <=, >=).

        - The logical operators (&&, ||, !). 
           - The && operator means "and". It will return true if both conditions are true.
           - The || operator means "or". It will return true if either condition is true.
           - The ! operator means "not". It will return true if the condition is false and false if the condition is true.

        - The modulo operator (%). This means it returns the remainder of a division operation. */

        int modulo = 5 % 2; //This will return 1 as 5 divided by 2 is 2 with a remainder of 1.

        // Next is the while loop.

        int i = 0;
        while(i < 5){ //This loop will execute as long as the condition is true. 
                      //In this case, it will execute 5 times.
            System.out.println("i is: " + i);
            i++; //This will add 1 to the varible i each time the loop executes.
        }

        /* The for loop is similar to the while loop, but it is used when you know how many times you want to execute the loop.
        It has 3 parts, the initialization/variable, the condition, and the increment. */
        for(int j = 0; j < 5; j++){
            System.out.println("j is: " + j);
        }
        /* This fundamentally works the same as the while loop.
        In this case as they will execute the same actions, just in different ways. 
        
        Once you feel you have a good understanding of these concepts, move on to Challenge 2 to practice them. */
    }
}
