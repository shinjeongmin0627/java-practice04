import java.util.Scanner;

public class InputNum1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3;

        System.out.print("숫자를 입력하시오: ");

        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();

        System.out.println(num1);
    }
}
