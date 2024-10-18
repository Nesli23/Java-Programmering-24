package codealongs.Java_playground;

import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {
        
        Player player;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Namn:");
        String name = scanner.nextLine();

        System.out.println("Skriv in antal omgångar du vill spela: ");
        int rounds = scanner.nextInt();

        System.out.println("Hur många sidor ska det vara på tärningen?");
        int numberOfSides = scanner.nextInt();
        scanner.nextLine();

        player = new Player(name, numberOfSides);

        for(int round = 1; round <= rounds; round++) {
            System.out.println("Omgång" + round);
            System.out.println(player.getName() + ", gissa tärningsvärdet:");
            int guess = scanner.nextInt();

            player.rollDice();
        int dieValue = player.getDieValue();
        System.out.println(player.getName() + " rullade " + dieValue);

        if (guess == dieValue) {
            System.out.println(player.getName() + " får en poäng!");
            player.increaseScore();
        } else {
            System.out.println(player.getName() + " får inte en poäng!");
        }
    }

    System.out.println("Spelet är slut. " + player.getName() + " har " + player.getScore() + " poäng.");
    }

}