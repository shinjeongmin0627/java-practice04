public class practice1 {
    public static void main(String[] args) {
        // 합계를 저장할 변수 초기화.
        int sum = 0;

        // 모든 수를 검사하고 홀수만 더하는 방법
        for (int i = 1; i <= 1000; i+=2) {
            sum += i; // 홀수인 경우에만 합계에 더함
        }
        // 결과 출력
        System.out.println
                ("1부터 1000까지 홀수의 합: " + sum);
    }
}
