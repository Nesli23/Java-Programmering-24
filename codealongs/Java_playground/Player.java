package codealongs.Java_playground;
    
public class Player {
    private String name;
    private int score;
    public Die die;
 
    public Player(String name, int numberOfSides) {
        this.name = name;
        score = 0;
        this.die = new Die(numberOfSides);
 
    }
   
    public String getName() {
      return name;
    }
 
    public int getScore() {
      return score;
    }
 
    public void setScore(int score) {
      this.score = score;
    }
 
    public void rollDice() {
        die.roll();
 
    }
 
    public int getDieValue() {
      return die.getValue();
    }
 
    public void increaseScore() {
      score++;
    }  
 
    public void addDie(int numberOfSides) {
       die = new Die(numberOfSides);
      }
 
 
}
 
