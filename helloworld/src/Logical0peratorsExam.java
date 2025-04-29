public class Logical0peratorsExam {
        public static  void main(String[] args) {
            int x = 5;
            int y = 5;

            // AND 연산자
            if (x > 0 && y > 0)
                System.out.println("둘 다 양수");

            // OR 연산자
            if (x > 10 || y > 5)
                System.out.println("하나 이상 조건 만족");
        }
}
