import java.util.Scanner;

public class practice2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //정수 입력 받기
        System.out.print("정수를 입력하세요");
        int number = scanner.nextInt();

        //조건문
        if (number >= 1 && number <= 100) {
            System.out.println("1에서 100사이의 값입니다.");
        } else {
            System.out.println("1에서 100 사이의 값이 아닙니다.");
        }
        scanner.close();
    }
}
