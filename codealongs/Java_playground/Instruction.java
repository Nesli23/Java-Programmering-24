package codealongs.Java_playground;

import javax.swing.*;

public class Instruction {
    public static void main(String[] args) {
        InstructionText instructionText = new InstructionText();
        JFrame frame = new JFrame("Instructions");
        frame.setSize(350,250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel(instructionText.getInstructions(), JLabel.CENTER);
        frame.add(label);
        //JButton button = new JButton("Tryck här för instruktioner");
        frame.setVisible(true);
        //frame.add(button);
        
    }
}
