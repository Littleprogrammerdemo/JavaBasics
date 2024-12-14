import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int max =0;
        int sum = 0;
            for (int count = 0;count< n;count++){
                int num = Integer.parseInt(scanner.nextLine());
                sum += num;
                if(num>max){
                    max = num;
                }
            }
            sum= sum - max;
            if(sum==max){
                System.out.printf("Yes %n Sum = %d",sum);
            }else{
                System.out.printf("No%nDiff = %d",Math.abs(sum-max));
            }

    }
}
