package codealongs.Java_playground;

import java.util.ArrayList; //Används för att lagra en dynamis lista av objekt. Man kan lägga till, ta bort eller manipulera objekt med add, remove, get, size, clear
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Questions {
    private String question;
    private String correctAnswer;
    private List <String> options;

    public Question(String question, String correctAnswer, List<String> options) {
        this.question = question;
        this.correctAnswer = correctAnswer;
        this.option = new ArrayList<>(options);
        this.options.add(correctAnswer);
    }

    public String getQuestion(){
        return question;
    }

    public List <String> getOptions(){
        Collections.shuffle(options); //Slumpar svarsalternativen
        return options;
    }

    public boolean isCorrect(String answer){
        return correctAnswer.equals(answer);
    }

}
