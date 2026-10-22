public class Lesson_5a {
    public static void main(String[] args) {

        //-------Objects/Arrays-------

        /* We are first going to learn about objects.
        Objects are instances of classes. They are created from the blueprint that the class provides.
        This means that we can create multiple objects from the same class, each with their own properties and methods.
        This is useful for when you want to create multiple instances of the same thing, but with different values, similar to an array.
        
        All objects are created using the 'new' keyword. */

        //Here is an example of creating an object from a class.
        Lesson_5a lesson = new Lesson_5a(); //This creates an object called lesson from the class Lesson_5a.

        //You can also create multiple objects from the same class.
        Lesson_5a lesson2 = new Lesson_5a();

        /* We can also create arrays of objects.
        This allows us to store multiple objects(up to 20) of the same class in a single variable. */

        //Here is an example of creating an array of objects.
        Lesson_5a[] lessons = new Lesson_5a[5]; //This creates an array of 5 objects from the class Lesson_5a.

        //We can also create an array of objects without the use of a class.
        int[] anything = new int[3]; //This creates an array of 4 integers.
        anything[0] = 1; //This assigns the value 1 to the first index of the array.
        anything[1] = 2; //This assigns the value 2 to the second index of the array.
        anything[2] = 3; //This assigns the value 3 to the third index of the array.

    }

    public void lessonMethod(int value) {
        /* This is a method that can be called from the main method AND in other classes.

        To test this, we will call this method from the Lesson_5b class. 
        At this point you may move on to Lesson_5b.*/

        System.out.println("This is a method from the Lesson_5a class.\nThe value passed in is: " + value);
    }
}
