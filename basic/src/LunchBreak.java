import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String seriesName = scanner.nextLine();
        int durationEpisode = Integer.parseInt(scanner.nextLine());
        int durationBreak = Integer.parseInt(scanner.nextLine());
        double restOfBreak = durationBreak - ((durationBreak/8.0)+ (durationBreak/4.0));
        double diff = Math.ceil(Math.abs(restOfBreak - durationEpisode));

        if(restOfBreak>=durationEpisode){
            System.out.printf("You have enough time to watch %s and left with %.2f minutes free time.",seriesName, diff);
        }else{
            System.out.printf("You don't have enough time to watch %s, you need %.2f more minutes.", seriesName,diff);
        }

    }
}
