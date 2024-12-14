import java.util.Scanner;

public class BarcodeGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String start = scanner.nextLine();
        String end = scanner.nextLine();
        int firstStart = Integer.parseInt(start.charAt(0)+"");
        int secondStart = Integer.parseInt(start.charAt(1)+"");
        int thirdStart = Integer.parseInt(start.charAt(2)+"");
        int fourthStart = Integer.parseInt(start.charAt(3)+"");

        int firstEnd = Integer.parseInt(end.charAt(0)+"");
        int secondEnd = Integer.parseInt(end.charAt(1)+"");
        int thirdEnd = Integer.parseInt(end.charAt(2)+"");
        int fourthEnd = Integer.parseInt(end.charAt(3)+"");
for (int first = firstStart;first<=firstEnd;first++){
    for (int second = secondStart;second<=secondEnd;second++){
        for (int third = thirdStart;third<=thirdEnd;third++){
            for (int fourth = fourthStart;fourth<=fourthEnd;fourth++){
                if (first % 2 != 0 && second % 2 != 0 && third % 2 != 0 && fourth % 2 != 0) {
    System.out.printf("%d%d%d%d ",first,second,third,fourth);
}
            }
        }
    }
}
    }
}
