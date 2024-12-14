import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOne = Integer.parseInt(scanner.nextLine());
        int numberTwo = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        if (numberTwo==0&& (operator.equals("/")|| operator.equals("%"))){
            System.out.printf("Cannot divide %d by zero",numberOne);
            return;
        }
        double result =  0;
        if (operator.equals("+")){
result= numberOne+numberTwo;
    } else if (operator.equals("-")) {
            result= numberOne - numberTwo;
        } else if (operator.equals("*")) {
            result = numberOne*numberTwo;
        } else if (operator.equals("/")) {
            result= numberOne * 1.0 / numberTwo;
        } else if (operator.equals("%")) {
            result = numberOne % numberTwo;
        }
        if (operator.equals("+")|| operator.equals("-") || operator.equals("*")){
            String evenOrOdd = "";
            if (result%2 ==0.0){
            evenOrOdd = "even";
            }else {
                evenOrOdd = "odd";
            }
            System.out.printf("%d %s %d = %.0f-%s", numberOne,operator,numberTwo,result,evenOrOdd);
        } else if (operator.equals("/")) {
            System.out.printf("%d/%d = %.2f",numberOne,numberTwo,result);
            
        } else if (operator.equals("%")){
            System.out.printf("%d %% %d=%.0f ",numberOne,numberTwo,result);
        }
    }
    }