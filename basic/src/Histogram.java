import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int p4 = 0;
        int p5 = 0;
        for (int iteration = 1; iteration <= n; iteration++) {
            int num = Integer.parseInt(scanner.nextLine());

            if (num < 200) {
                p1++;
            } else if (num < 400) {
                p2++;
            } else if (num < 600) {
                p3++;
            } else if (num < 800) {
                p4++;
            } else {
                p5++;
            }
        }
        System.out.printf("%.2f%%%n ",(double)p1/n *100);
        System.out.printf("%.2f%%%n ",(double)p2/n*100);
        System.out.printf("%.2f%%%n ",(double)p3/n*100);
        System.out.printf("%.2f%%%n ",(double)p4/n*100);
        System.out.printf("%.2f%%%n ",(double)p5/n*100);

    }
}
