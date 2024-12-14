 import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstTime = Integer.parseInt(scanner.nextLine());
        int secondTime = Integer.parseInt(scanner.nextLine());
        int thirdTime = Integer.parseInt(scanner.nextLine());
        int sum = firstTime + secondTime+ thirdTime;
        int min = sum / 60;
        int sec = sum % 60;
        if (sec<10){
            System.out.printf("%d:0%d",min, sec);
        }else{
            System.out.printf("%d:%d",min, sec);
          }
        }
    }

