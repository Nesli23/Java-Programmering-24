package codealongs.Java_playground;

import java.util.ArrayList; //Används för att lagra en dynamis lista av objekt. Man kan lägga till, ta bort eller manipulera objekt med add, remove, get, size, clear
import java.util.Collections; // Används för att slumpa svarsalternativen. shuffle(List<?> list): Blandar elementen i listan.
import java.util.List; // Framework som representerar en ordnad samling av element, där dubbletter är tillåtna. Här är några viktiga egenskaper och funktioner hos List:
import java.util.Scanner; // Används för att kunna skriva i terminalen

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
