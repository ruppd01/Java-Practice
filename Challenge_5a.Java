import java.util.Scanner;

public class Challenge_5a {
    public static void main(String[] args){
        
        /* Before you receive your actual challenges, 
        you will need to create a few methods here that will be called in the Challenge_5b class.

        The methods you will need to create are as follows:
        - A method called inputArray that takes in a int that determines how many intergers will be inputted into an array.
        - A method called printArray that takes in an array of integerst.
        - A method called sumArray that takes in an array of integers and returns the sum of all the integers in the array.
        */
    }
    
    public void inputArray(int numInputs) {
        Scanner scnr = new Scanner(System.in);

        int numElements = scnr.nextInt();   
        for(int i = 0; i < numElements; i++){
            userList[i] = scnr.nextInt();
        }
    }

    public void printArray(int[] userList) {
        for(int i = 0; i < userList.length; i++){
            System.out.println(userList[i]);
        }
    }

    public int sumArray(int[] userList) {
        int sum = 0;
        for(int i = 0; i < userList.length; i++){
            sum += userList[i];
        }
        return sum;
    }
}