import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tabs = Integer.parseInt(scanner.nextLine());
        double salary = Double.parseDouble(scanner.nextLine());
        for(int tab = 1;  tab<= tabs; tab++){
String site = scanner.nextLine();
    switch (site){
        case "Facebook":
            salary -= 150;
            break;
        case "Instagram":
            salary -= 100;
            break;
        case "Reddit":
            salary -= 50;
break;
    }
    if(salary<=0){
        break;
    }
        }
        if(salary<=0){
            System.out.println("You have lost your salary.");
        }else{
            System.out.println((int) salary);
        }

    }
}
