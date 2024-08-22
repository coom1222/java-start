package operator;

public class OperatorAdd2 {

    public static void main(String[] args) {
        int a = 1;
        int b = 0;

        b = ++a;    // a의 값을 먼저 증가시키고 그 결과를 b 에 대입
        System.out.println("a = " + a + ", b = " + b);

        // 후위증감 연산자 예시
        a = 1;
        b = 0;
        b = a++;    // a의 현재값을 b에 먼저 대입 후 a의 값을 증가시킴
        System.out.println("a = " + a + ", b = " + b);
        /*
        b = a;  // b = 1
        a = a + 1;  // a = 2
        결과는 a = 2, b = 1
         */
    }
}
