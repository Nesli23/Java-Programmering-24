package Java_playground;

public class DiceGame {
    public static void main(String[] args) {
        
        Player player;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Namn:");
        String namne = scanner.nextLine();

        System.out.println("Skriv in antal omgångar du vill spela");
        int rounds = scanner.nextLine();

        System.out.println("Hur många sidor ska det vara på tärningen?");
        int antalSidorPåTärning = scanner.nextInt();
        scanner.nextLine

        player= new Player(name, antalSidorPåTärning);

        for(int round = 1; round <= rounds, round++) {
            System.out.println("Omgång" + round);
            System.out.println(player.getName() + ", gissa tärningsvärdet:");
            int guess = scanner.nextInt():

            player.rollDice();
        int dieValue = player.getDieValue();
        System.out.println(player.getName() + " rullade " + dieValue);

        player.rollDice();
        int dieValue = player.getDieValue();
        System.out.println(player.getName() + " rullade " + dieValue);

        System.out.println("Spelet är slut. " + player.getName() + " har " + player.getScore() + " poäng.");
    }
}
