import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pensNum = Integer.parseInt(sc.nextLine());
        int markersNum = Integer.parseInt(sc.nextLine());
        int preparatNum = Integer.parseInt(sc.nextLine());
        int percent = Integer.parseInt(sc.nextLine());
        double penPrice = pensNum * 5.80;
        double markersPrice = markersNum * 7.20;
        double preparatsPrice = preparatNum *  1.20;
        double totalSum = penPrice+ markersPrice+preparatsPrice;
        double result = totalSum - (totalSum * (percent/100.0 ));
        System.out.println(result);
    }
}
