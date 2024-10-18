package codealongs.Java_playground.Arrayground;

import java.util.Arrays;
import java.util.Random;

public class ArrayOfIntegers {
    int [] integerArray; 

    public ArrayOfIntegers (int i){
        integerArray = new int[i];
        Random r = new Random();

        for (int element = 0; element < integerArray.length; element++){
            integerArray[element] = r.nextInt(1000);
        }
    }
    
    public static void main(String[] args) {
        ArrayOfIntegers theArray = new ArrayOfIntegers(10);

        System.out.println(Arrays.toString(theArray.integerArray));

        theArray.substitute(4,999);
        System.out.println(Arrays.toString(theArray.integerArray));
        theArray.square(3);
        System.out.println(Arrays.toString(theArray.integerArray));
    }

    void substitute (int index,int newValue) {
    integerArray[newValue] = newValue;
}

    void square (int index) {
        integerArray[index] = integerArray[index] * integerArray[index]; 
    }
}

//Write a Java class that creates an array of integer values 
//chosen at random (you can choose them yourself, or implement 
//a <code>Random</code>-object). Create a method that takes two integers 
//as input. The method should substitute the integer at the first position
 //for the one in the second position. Create another method that takes a
  //single integer as input. The method should take the integer at the input
   //position and multiply it by itself. Write a main-method to check that your methods work as intended. 