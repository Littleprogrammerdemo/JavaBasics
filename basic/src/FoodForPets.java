    import java.util.Scanner;

public class FoodForPets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dayCounts = Integer.parseInt(scanner.nextLine());
        double totalCountFood = Double.parseDouble(scanner.nextLine());
        double totalDogFood=0;
        double totalCatFood=0;
        double totalEatenFood=0;
        double biscuits=0;
        for(int currentDay=1;currentDay<=dayCounts;currentDay++){
            double dogFood = Double.parseDouble(scanner.nextLine());
            double catFood = Double.parseDouble(scanner.nextLine());
            double totalEatenFoodToday = catFood+dogFood;
           if(currentDay%3==0){
               double biscuitsToday =totalEatenFoodToday*0.10;
                   biscuits+=biscuitsToday;
           }
totalDogFood+=dogFood;
totalCatFood+=catFood;
totalEatenFood+=totalEatenFoodToday;
        }

        System.out.printf("Total eaten biscuits: %dgr.%n",Math.round(biscuits));
        System.out.printf("%.2f%% of the food has been eaten.%n",(totalEatenFood/totalCountFood)*100);
        System.out.printf("%.2f%% eaten from the dog.%n",(totalDogFood/totalEatenFood)*100);
        System.out.printf("%.2f%% eaten from the cat.%n",(totalCatFood/totalEatenFood)*100);
    }
}
