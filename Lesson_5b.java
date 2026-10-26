public class Lesson_5b {
    public static void main(String[] args) {
        
        //-------Classes/imports-------

        /* Classes are blueprints for creating objects.
        They define the properties and methods that objects of that class will have.
        In java, everything is an object. This means that every piece of data that you create is an object.
        This includes varibles, methods, and even classes themselves.
        This also means that we can call a class within another class. */

        Lesson_5a lesson = new Lesson_5a(); //This creates an object called lesson from the class Lesson_5a.
        //We can use the lesson object to access the properties and methods of the Lesson_5a class.

        lesson.lessonMethod(5); //This will call the lessonMethod from the Lesson_5a class.
        /*try running this program and see what happens. 
        You should see the output from the lessonMethod in the terminal. 

        ------------------------------------------------------------------------
        
        Imports are used to bring in other classes and make them available for use in the current class. 
        Imports are always placed at the top of the file before the class declaration, similar to the scanner. 

        We will discuss imports more when we start getting into some FRC specific programming.
        
        Once you feel comfortable with the previous concepts, you can move on to Challenge_5. */

    }
}
