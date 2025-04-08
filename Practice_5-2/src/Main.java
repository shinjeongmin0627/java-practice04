import java.util.Scanner;

public class Main {
    public static void main(String[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자1를 입력하시오:");
        num1 = sc.nextint();
        System.out.print("숫자2를 입력하시오:");
        num2 = sc.nextint();
        System.out.print("숫자3를 입력하시오:");
        num3 = sc.nextint();

        System.out.println(num1-num2-num3);
    }
}