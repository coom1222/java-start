package operator;

public class OperatorAdd1 {

    public static void main(String[] args) {
        int a = 0;

        a = a + 1;
        System.out.println("a = " + a);

        a = a + 1;
        System.out.println("a = " + a);

        // 증감연산자
        ++a;    // a = a + 1
        System.out.println("a = " + a);
        ++a;
        System.out.println("a = " + a);

        --a;
        System.out.println("a = " + a);
    }
}
/*
soutm
클래스명, 메소드 명 출력

soutp
입력받은 파라미터들 출력

soutv
메소드 내에서 사용 가능한 변수 출력
 */