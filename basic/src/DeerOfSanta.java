import java.util.Scanner;

public class DeerOfSanta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countDays = Integer.parseInt(scanner.nextLine());
        int leftFood = Integer.parseInt(scanner.nextLine());
        double foodForFirstDeer = Double.parseDouble(scanner.nextLine());
        double foodForSecondDeer = Double.parseDouble(scanner.nextLine());
        double foodForThirdDeer = Double.parseDouble(scanner.nextLine());
        double deerOne = countDays*foodForFirstDeer;
        double deerTwo = countDays * foodForSecondDeer;
        double deerThree = countDays * foodForThirdDeer;
double neededFood = deerOne+deerTwo+deerThree;
        double foodLeft = Math.abs(leftFood-neededFood);
if(neededFood<leftFood){
    System.out.printf("%d kilos of food left.",(int)Math.floor(foodLeft));

}else {
    System.out.printf("%d more kilos of food are needed.",(int)Math.ceil(foodLeft ));
}
    }
}
