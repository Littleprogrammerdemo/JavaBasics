import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int daysStay = Integer.parseInt(scanner.nextLine());
        String typeRoom = scanner.nextLine();
        String evaluation = scanner.nextLine();
        int overnight = daysStay - 1;
        double totalPrice = 0;
        switch (typeRoom){
            case "room for one person":
                totalPrice = overnight * 18.00;
                break;
            case "apartment":
                totalPrice = overnight * 25.00;
                break;
            case "president apartment":
                totalPrice = overnight * 35.00;
                break;
        }
        if (typeRoom.equals("apartment")){
            if (overnight < 10){
                totalPrice = totalPrice - (totalPrice * 0.30);
            } else if (overnight > 10 && overnight < 15) {
                totalPrice = totalPrice - (totalPrice * 0.35);
            } else  {
                totalPrice = totalPrice - (totalPrice * 0.50);
            }
        } else if (typeRoom.equals("president apartment")) {
            if (overnight < 10){
                totalPrice = totalPrice - (totalPrice * 0.10);
            } else if (overnight > 10 && overnight < 15) {
                totalPrice = totalPrice - (totalPrice * 0.15);
            } else  {
                totalPrice = totalPrice - (totalPrice * 0.20);
            }
        }
        if (evaluation.equals("positive")){
            totalPrice = totalPrice + (totalPrice * 0.25);
        }else if (evaluation.equals("negative")){
            totalPrice = totalPrice - (totalPrice * 0.10);
        }
        System.out.printf("%.2f",totalPrice);
        }
    }

