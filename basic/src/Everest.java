import java.util.Scanner;

public class Everest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = 1;
        int metersClimbed = 0;
        int totalMetersClimbed = 5364;
        int goal = 8848;

        while (true) {
            if (totalMetersClimbed >= goal) {
                break;
            }

            String overnight = scanner.nextLine();
            if (overnight.equals("END")) {
                break;
            }
            boolean hasOvernight = overnight.equals("Yes");
            int meters = Integer.parseInt(scanner.nextLine());

            if (totalMetersClimbed + meters > goal) {
                meters = goal - totalMetersClimbed;
            }


            if (hasOvernight) {
                days++;
            } else {
                days = days;
            }

            if (days > 5) {
                break;
            }
            metersClimbed += meters;
            totalMetersClimbed += meters;
        }
        if (totalMetersClimbed >= goal) {
            System.out.printf("Goal reached for %d days!%n", days);
        } else {
            System.out.println("Failed!");
            System.out.println(totalMetersClimbed);
        }
    }
}
