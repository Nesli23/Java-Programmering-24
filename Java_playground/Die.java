package Java_playground;

import java.util.Random;
 
public class Die {
    private int value;
    private int numberOfSides;
    private Random slumpgenerator;
 
   
    public Die(int numberOfSides) {
     this.numberOfSides = numberOfSides;
 
     slumpgenerator = new Random();
 
     value = 1;
      }
 
    public int getNumberOfSides() {
        return numberOfSides;
    }
 
    public void roll() {
        value = slumpgenerator.nextInt(numberOfSides)+1;
    }
 
    public int getValue() {
        return value;
    }
   
}    


}
