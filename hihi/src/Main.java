public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double sum = 0.0;
        double kor = 0;
        double eng = 0;
        double math = 0;
        double sci = 0;
        int intAvg = 0;
        double doubleAvg = 0.0;

        boolean boolResult = false;

        System.out.println("국어점수를 입력하세요");
        kor = sc.nextDouble();
        System.out.println("영어점수를 입력하세요");
        eng = sc.nextDouble();
        System.out.println("수학점수를 입력하세요");
        math = sc.nextDouble();
        System.out.println("과학점수를 입력하세요");
        sci = sc.nextDouble();

        sum = kor + eng + math + sci;
        doubleAvg = sum / 4;
        intAvg = (int)sum/4;

        System.out.println(sum);
        System.out.println(intAvg);
        System.out.println(doubleAvg);
        System.out.println(boolResult);


    }
}