import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int naylon = Integer.parseInt(sc.nextLine());
        int paint = Integer.parseInt(sc.nextLine());
        int razreditel = Integer.parseInt(sc.nextLine());
        int hours = Integer.parseInt(sc.nextLine());
        double priceForNaylon = (naylon+2) * 1.50;
        double priceForPaint = (paint+(paint * 10/100.0)) * 14.50;
        double priceForRazreditel = razreditel * 5;
        double sum = priceForNaylon+priceForPaint+priceForRazreditel+ 0.40;
        double workers = hours * (sum* 30/100.0);
        double results = sum+workers;
        System.out.println(results);

    }
}
