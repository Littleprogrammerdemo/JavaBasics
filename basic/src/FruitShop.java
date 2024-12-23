    import java.util.Scanner;

    public class FruitShop {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String fruit = scanner.nextLine();
            String dayOfWeek = scanner.nextLine();
            double quantity = Double.parseDouble(scanner.nextLine());
            boolean isWorkingDay = dayOfWeek.equals("Monday") || dayOfWeek.equals("Tuesday")  || dayOfWeek.equals("Wednesday")  || dayOfWeek.equals("Thursday")  || dayOfWeek.equals("Friday");
            boolean isWeekend = dayOfWeek.equals("Saturday") || dayOfWeek.equals("Sunday");
            boolean isValid = true;
            double price = 0;
            if (isWorkingDay) {
                if (fruit.equals("banana")) {
                    price = 2.5;
                } else if (fruit.equals("apple")) {
                    price = 1.2;
                } else if (fruit.equals("orange")) {
                    price = 0.85;
                } else if (fruit.equals("grapefruit")) {
                    price = 1.45;
                } else if (fruit.equals("kiwi")) {
                    price = 2.7;
                } else if (fruit.equals("pineapple")) {
                    price = 5.5;
                } else if (fruit.equals("grapes")) {
                    price = 3.85;
                } else {
                    isValid = false;
                }
            } else if (isWeekend) {
                if (fruit.equals("banana")) {
                    price = 2.7;
                } else if (fruit.equals("apple")) {
                    price = 1.25;
                } else if (fruit.equals("orange")) {
                    price = 0.9;
                } else if (fruit.equals("grapefruit")) {
                    price = 1.6;
                } else if (fruit.equals("kiwi")) {
                    price = 3;
                } else if (fruit.equals("pineapple")) {
                    price = 5.6;
                } else if (fruit.equals("grapes")) {
                    price = 4.2;
                } else {
                    isValid = false;
                }
            } else {
                isValid = false;
            }
            if (isValid) {
                double result = quantity * price;
                System.out.printf("%.2f",result);
            } else {
                System.out.println("error");
            }
        }
    }
