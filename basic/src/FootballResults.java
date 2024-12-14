import java.util.Scanner;

public class FootballResults {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstResult = scanner.nextLine();
        String secondResult = scanner.nextLine();
        String thirdResult = scanner.nextLine();
        int firstResult1 = firstResult.charAt(0);
        int secondResult1 = firstResult.charAt(2);
        int wins = 0;
        int loses = 0;
        int draws = 0;

        if (firstResult1 > secondResult1) {
            wins++;
        } else if (firstResult1 == secondResult1) {
            draws++;
        } else {
            loses++;
        }
        int firstResult2 = secondResult.charAt(0);
        int secondResult2 = secondResult.charAt(2);

        if (firstResult2 > secondResult2) {
            wins++;
        } else if (firstResult2 == secondResult2) {
            draws++;
        } else {
            loses++;
        }
        int firstResult3 = thirdResult.charAt(0);
        int secondResult3 = thirdResult.charAt(2);
        if (firstResult3 > secondResult3) {
            wins++;
        } else if (firstResult3 == secondResult3) {
            draws++;
        } else {
            loses++;
        }
        System.out.printf("Team won %d games.%n", wins);
        System.out.printf("Team lost %d games.%n", loses);
        System.out.printf("Drawn games: %d%n", draws);
    }
}
