import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinutes = Integer.parseInt(scanner.nextLine());
        int arrivalHour = Integer.parseInt(scanner.nextLine());
        int arrivalMinutes = Integer.parseInt(scanner.nextLine());

        // exam: 9:30 -> (9 * 60) + 30 = 570
        // arrival: 9:50 -> (9 * 60) + 50 = 590

        int examTime = (examHour* 60)+ examMinutes;
        int arrivalTime=(arrivalHour*60)+arrivalMinutes;
        int diff = Math.abs(examTime-arrivalTime);

            if(examTime<arrivalTime){
                System.out.println("Late");
                if (diff>= 60){
                    int hour = diff /60;
                    int minutes = diff%60;
                    System.out.printf("%d:%02d hours after the start",hour,minutes);
                }else{
                    System.out.printf("%d minutes after the start",diff);
                }
            } else if (examTime == arrivalTime || diff<=30) {
                System.out.println("On time");
                if(diff!=0){
                    System.out.printf("%d minutes before the start",diff);
                }
            }else {
                System.out.println("Early");
                if (diff>=60){
                    int hour = diff /60;
                    int minutes = diff%60;
                    System.out.printf("%d:%02d hours before the start",hour,minutes);
                }else{
                    System.out.printf("%d minutes before the start",diff);
                }
            }
    }
}
