import java.util.Scanner;

public class Challenge_5a {
    public static void main(String[] args){
        
        /* Before you receive your actual challenges, 
        you will need to create a few methods here that will be called in the Challenge_5b class.

        The methods you will need to create are as follows:
        - A method called inputArray that takes in a int that determines how many intergers will be inputted into an array.
        - A method called sumArray that takes in an array of integers and returns the sum of all the integers in the array as a seperate int.
        - A method called 
        - A method called highLowArray that takes in an array of integers and returns the highest and lowest integers in the array as a seperate array.
        
        The first method, inputArray, is defined below: 
        
        Note: All methods will begin with public int*/
    }
    
    public int[] inputArray(int numInputs) {
        Scanner scnr = new Scanner(System.in);
        int userList[] = new int[numInputs];
   
        for(int i = 0; i < numInputs; i++){
            userList[i] = scnr.nextInt();
        }
        return userList;
    }

    //-------enter code here-------

    

}