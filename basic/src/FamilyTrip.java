import java.util.Scanner;

public class FamilyTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            double budget= Double.parseDouble(scanner.nextLine());
            int nightCount = Integer.parseInt(scanner.nextLine());
        double nightPrice= Double.parseDouble(scanner.nextLine());
        int percentageForAdditionalCosts= Integer.parseInt(scanner.nextLine());
        if(nightCount>7){
            nightPrice=nightPrice*0.95;
        }
                double allNightsPrice = nightCount * nightPrice;
            double additionalCosts= budget*(percentageForAdditionalCosts/100.0);
            double totalExpenses  = allNightsPrice+additionalCosts;
            if (totalExpenses<=budget){
                System.out.printf("Ivanovi will be left with %.2f leva after vacation.",budget - totalExpenses);
            }else {
                System.out.printf("%.2f leva needed.", totalExpenses-budget);
            }
    }
}
