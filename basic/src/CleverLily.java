import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        double priceForWashingMachine = Double.parseDouble(scanner.nextLine());
        double sum = 0;
        double priceForToy = Double.parseDouble(scanner.nextLine());
        for (int currentAge = 1; currentAge<=age; currentAge++){
            if (currentAge% 2==0){
                sum= sum+ (((double)currentAge/2)*10)-1;
            }else{
                sum = sum+priceForToy;
            }
        }
        double diff =Math.abs(sum-priceForWashingMachine);
         if(sum>=priceForWashingMachine){
             System.out.printf("Yes! %.2f", diff);
        }else{
             System.out.printf("No! %.2f", diff);
         }
    }
}
