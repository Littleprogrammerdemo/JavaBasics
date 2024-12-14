import java.util.Scanner;

public class Skeleton {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.parseInt(scanner.nextLine());
        int sec = Integer.parseInt(scanner.nextLine());
        double length = Double.parseDouble(scanner.nextLine());
        int secForWalking100Meters = Integer.parseInt(scanner.nextLine());
        double controlInSeconds = min*60+ sec;
        double timeDecrease = length/120;
        double reducedTime = timeDecrease*2.5;
        double timeForMarin = (length/100)*secForWalking100Meters-reducedTime;
        double controlTime = controlInSeconds;
        if (timeForMarin <= controlInSeconds){
            System.out.println("Marin Bangiev won an Olympic quota!");
            System.out.printf("His time is %.3f.",timeForMarin);
        }else {
            System.out.printf("No, Marin failed! He was %.3f second slower.",timeForMarin-controlTime);
        }
    }
}
