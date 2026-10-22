import Challenge_5a.java;

public class Challenge_5b {
    public static void main(String[] args) {

        /* This is the class where you will run you code through.
        The following challenegs will requuire you to call in methods from Challenge_5a.
        
        You have already created the necessary objects and methods. 
        Now you will have to call those methods in to perform the required tasks.
        
        */

        // The first challenge will require you to call in the inputArray method from Challenge_5a.

        Challenge_5a input = new Challenge_5a(); //This creates an object called input from the class Challenge_5a.
        int[] numbers = input.inputArray(5); //This will call the inputArray method from the Challenge_5a class.
        // The second challenge will require you to call in the printArray method from Challenge_5a.

        input.printArray(numbers); //This will call the printArray method from the Challenge_5a class.

        // The third challenge will require you to call in the sumArray method from Challenge_5a.

        int sum = input.sumArray(); //This will call the sumArray method from the Challenge_5a class.
        System.out.println("Sum: " + sum);

        Lesson_5a lesson = new Lesson_5a(); //This creates an object called lesson from the class Lesson_5a.
        //We can use the lesson object to access the properties and methods of the Lesson_5a class.

        lesson.lessonMethod(5);

    }
}
