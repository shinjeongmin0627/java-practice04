import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하시오: ");
        double num1 = scanner.nextDouble();
        System.out.print("두 번째 숫자를 입력하시오: ");
        double num2 = scanner.nextDouble();
        System.out.print("세 번째 숫자를 입력하시오: ");
        double num3 = scanner.nextDouble();

        double result = num1 + num2 + num3;
        System.out.println("세 숫자의 합은: " + result);
    }
}