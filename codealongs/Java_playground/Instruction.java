package codealongs.Java_playground;

import javax.swing.*;

public class Instruction {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Instructions");
        frame.setSize(350,250);
        JLabel label = new JLabel("Instruktioner till QuizGame", JLabel.CENTER);
        frame.add(label);
        frame.setVisible(true);
    }
}
